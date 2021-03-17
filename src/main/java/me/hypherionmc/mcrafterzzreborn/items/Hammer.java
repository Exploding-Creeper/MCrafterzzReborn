/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ItemTool;
import net.minecraft.item.ToolItem;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Collections;

public class Hammer extends ToolItem {

    public static float attack_speed = -2.8F;
    public static float damage = 3.0F;

    public Hammer(String name, ItemTier tier, int durabillity) {
        super(damage, attack_speed, tier, Collections.emptySet(), new Properties().addToolType(ToolType.PICKAXE, tier.getHarvestLevel()).maxDamage(durabillity));
        this.setRegistryName(name);

    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemStack, BlockPos pos, PlayerEntity player) {
        if (player.isCreative()) {
            World world = player.world;
            RayTraceResult sideHit = this.rayTrace(world, player, false);

            if (sideHit != null) {
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

        }

        return false;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemStack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        PlayerEntity player = (PlayerEntity)entityLiving;
        RayTraceResult sideHit = rayTrace(worldIn, player, RayTraceContext.FluidMode.NONE);
        EnumFacing facing = sideHit.getHitVec();
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
                    if (block.canHarvestBlock(worldIn, offset2, player)) {
                        block.removedByPlayer(offsetState, worldIn, offset2, player, true);
                        block.onPlayerDestroy(worldIn, offset2, offsetState);
                        block.harvestBlock(worldIn, player, offset2, offsetState, (TileEntity)null, itemStack);
                        if (block.isToolEffective("pickaxe", offsetState)) {
                            if ((double)offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
                                itemStack.damageItem(1, player);
                            }
                        } else if ((double)offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
                            itemStack.damageItem(3, player);
                        }
                    } else if (worldIn.isBlockModifiable(player, offset2) && block.getBlockHardness(offsetState, worldIn, offset2) < 100.0F && block.getBlockHardness(offsetState, worldIn, offset2) != -1.0F) {
                        worldIn.getBlockState(offset2).getBlockHardness(worldIn, pos);
                    }
                }
            }
        }

        if ((double)state.getBlockHardness(worldIn, pos) != 0.0D) {
            if (state.getBlock().isToolEffective(state, ToolType.PICKAXE)) {
                itemStack.damageItem(1, entityLiving, (entity) -> {
                    entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                });
            } else {
                itemStack.damageItem(3, entityLiving, (entity) -> {
                    entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                });
            }
        }

        return true;
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        itemStack.damageItem(1, attacker, (entity) -> {
            entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        return true;
    }

}
