/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Collections;

public class Scythe extends ItemTool {

    public static float attack_speed = -2.8F;
    public static float damage = 3.0F;

    public Scythe(String name, ToolMaterial toolMaterial, int durabillity) {
        super(damage, attack_speed, toolMaterial, Collections.emptySet());
        this.setMaxDamage(durabillity);
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModItems.ITEMS.add(this);
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemStack, BlockPos pos, EntityPlayer player) {
        if (player.isCreative()) {
            World world = player.world;
            RayTraceResult sideHit = this.rayTrace(world, player, false);
            EnumFacing facing = sideHit.sideHit;
            EnumFacing facing1 = null;
            EnumFacing facing2 = null;
            EnumFacing.Axis[] var9 = EnumFacing.Axis.values();
            int var10 = var9.length;

            int j;
            for(j = 0; j < var10; ++j) {
                EnumFacing.Axis axis = var9[j];
                if (axis != facing.getAxis()) {
                    EnumFacing f = EnumFacing.getFacingFromAxis(EnumFacing.AxisDirection.POSITIVE, axis);
                    if (facing1 == null) {
                        facing1 = f;
                    } else {
                        facing2 = f;
                    }
                }
            }

            for(int i = -1; i <= 1; ++i) {
                BlockPos offset1 = pos.offset(facing1, i);

                for(j = -1; j <= 1; ++j) {
                    if (i != 0 || j != 0) {
                        BlockPos offset2 = offset1.offset(facing2, j);
                        world.destroyBlock(offset2, false);
                    }
                }
            }
        }

        return false;
    }

    public boolean func_179218_a(ItemStack itemStack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        EntityPlayer player = (EntityPlayer)entityLiving;
        RayTraceResult sideHit = this.rayTrace(worldIn, player, false);
        EnumFacing facing = sideHit.sideHit;
        EnumFacing facing1 = null;
        EnumFacing facing2 = null;
        EnumFacing.Axis[] var11 = EnumFacing.Axis.values();
        int var12 = var11.length;

        int j;
        for(j = 0; j < var12; ++j) {
            EnumFacing.Axis axis = var11[j];
            if (axis != facing.getAxis()) {
                EnumFacing f = EnumFacing.getFacingFromAxis(EnumFacing.AxisDirection.POSITIVE, axis);
                if (facing1 == null) {
                    facing1 = f;
                } else {
                    facing2 = f;
                }
            }
        }

        for(int i = -1; i <= 1; ++i) {
            BlockPos offset1 = pos.offset(facing1, i);

            for(j = -1; j <= 1; ++j) {
                if (i != 0 || j != 0) {
                    BlockPos offset2 = offset1.offset(facing2, j);
                    IBlockState offsetState = worldIn.getBlockState(offset2);
                    Block block = offsetState.getBlock();
                    if (block.getMaterial(offsetState) != Material.GOURD && block.getMaterial(offsetState) != Material.LEAVES && block.getMaterial(offsetState) != Material.PLANTS && block.getMaterial(offsetState) != Material.CACTUS && !block.canHarvestBlock(worldIn, offset2, player)) {
                        if ((double)offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
                            itemStack.damageItem(3, player);
                        }

                        if (worldIn.isBlockModifiable(player, offset2) && block.getBlockHardness(offsetState, worldIn, offset2) < 100.0F && block.getBlockHardness(offsetState, worldIn, offset2) != -1.0F) {
                            worldIn.setBlockToAir(offset2);
                        }
                    } else {
                        block.removedByPlayer(offsetState, worldIn, offset2, player, true);
                        block.onPlayerDestroy(worldIn, offset2, offsetState);
                        block.harvestBlock(worldIn, player, offset2, offsetState, (TileEntity)null, itemStack);
                        if ((double)offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
                            if (block.getMaterial(offsetState) != Material.GOURD && block.getMaterial(offsetState) != Material.LEAVES && block.getMaterial(offsetState) != Material.PLANTS && block.getMaterial(offsetState) != Material.CACTUS) {
                                itemStack.damageItem(3, player);
                            } else {
                                itemStack.damageItem(1, player);
                            }
                        }
                    }
                }
            }
        }

        if ((double)state.getBlockHardness(worldIn, pos) != 0.0D) {
            Material material = state.getBlock().getMaterial(state);
            if (material != Material.GOURD && material != Material.LEAVES && material != Material.PLANTS && material != Material.CACTUS) {
                itemStack.damageItem(3, entityLiving);
            } else {
                itemStack.damageItem(1, entityLiving);
            }
        }

        return true;
    }
}