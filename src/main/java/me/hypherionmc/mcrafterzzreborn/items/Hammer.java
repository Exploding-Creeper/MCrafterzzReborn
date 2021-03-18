/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Collections;

public class Hammer extends ToolItem {

    public static float attack_speed = -2.8F;
    public static float damage = 3.0F;

    public Hammer(IItemTier tier, int durabillity, ItemGroup group) {
        super(damage, attack_speed, tier, Collections.emptySet(), new Properties().group(group).addToolType(ToolType.PICKAXE, tier.getHarvestLevel()).maxDamage(durabillity));

    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemStack, BlockPos pos, PlayerEntity player) {
        if (player.isCreative()) {
            World world = player.world;
            RayTraceResult sideHit = this.rayTrace(world, player, RayTraceContext.FluidMode.NONE);

            if (sideHit != null) {
                Direction facing = Direction.getFacingFromVector(sideHit.getHitVec().x, sideHit.getHitVec().y, sideHit.getHitVec().z);
                Direction facing1 = null;
                Direction facing2 = null;
                Direction.Axis[] var9 = Direction.Axis.values();
                int var10 = var9.length;

                int j;
                for(j = 0; j < var10; ++j) {
                    Direction.Axis axis = var9[j];
                    if (axis != facing.getAxis()) {
                        Direction f = Direction.getFacingFromAxis(Direction.AxisDirection.POSITIVE, axis);
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
        Direction facing = Direction.getFacingFromVector(sideHit.getHitVec().x, sideHit.getHitVec().y, sideHit.getHitVec().z);
        Direction facing1 = null;
        Direction facing2 = null;
        Direction.Axis[] var11 = Direction.Axis.values();
        int var12 = var11.length;

        int j;
        for(j = 0; j < var12; ++j) {
            Direction.Axis axis = var11[j];
            if (axis != facing.getAxis()) {
                Direction f = Direction.getFacingFromAxis(Direction.AxisDirection.POSITIVE, axis);
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
                    BlockState offsetState = worldIn.getBlockState(offset2);
                    Block block = offsetState.getBlock();
                    if (block.canHarvestBlock(state, worldIn, offset2, player)) {
                        block.removedByPlayer(state, worldIn, offset2, player, true, null);
                        block.onPlayerDestroy(worldIn, offset2, offsetState);
                        block.harvestBlock(worldIn, player, offset2, offsetState, (TileEntity)null, itemStack);
                        if (block.isToolEffective(offsetState, ToolType.get("pickaxe"))) {
                            if ((double)offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
                                itemStack.damageItem(1, player, (entity) -> {
                                    entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                                });
                            }
                        } else if ((double)offsetState.getBlockHardness(worldIn, offset2) != 0.0D && block != Blocks.AIR) {
                            itemStack.damageItem(3, player, (entity) -> {
                                entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                            });
                        }
                    } else if (worldIn.isBlockModifiable(player, offset2) && offsetState.getBlockHardness(worldIn, offset2) < 100.0F && offsetState.getBlockHardness(worldIn, offset2) != -1.0F) {
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
