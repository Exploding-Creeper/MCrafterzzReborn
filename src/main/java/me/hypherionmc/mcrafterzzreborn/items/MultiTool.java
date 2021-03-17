/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.ForgeEventFactory;

import java.util.Collections;
import java.util.Iterator;

public class MultiTool extends ToolItem {

    public Item repairItem;
    public static float attack_speed = -2.8F;
    public static float base_damage = 3.0F;

    public MultiTool(String name, ItemTier material, Item repairItem) {
        super(base_damage, attack_speed, material, Collections.emptySet(),
                new Properties()
                        .addToolType(ToolType.PICKAXE, material.getHarvestLevel())
                        .addToolType(ToolType.AXE, material.getHarvestLevel())
                        .addToolType(ToolType.SHOVEL, material.getHarvestLevel())
                        .addToolType(ToolType.HOE, material.getHarvestLevel())
                        );

        this.setHarvestLevel("sword", material.getHarvestLevel());
        this.repairItem = repairItem;
        this.setRegistryName(name);


    }

    protected void setBlock(ItemStack stack, PlayerEntity player, World worldIn, BlockPos pos, BlockState state) {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
        if (!worldIn.isRemote) {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player, (entity) -> {
                entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
        }

    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        PlayerEntity playerIn = context.getPlayer();
        ItemStack stack = playerIn.getHeldItem(context.getHand());

        if (!playerIn.canPlayerEdit(context.getPos().offset(context.getFace()), context.getFace(), stack)) {
            return ActionResultType.FAIL;
        } else {


            int hook = ForgeEventFactory.onHoeUse(context);
            if (hook != 0) {
                return hook > 0 ? ActionResultType.SUCCESS : ActionResultType.FAIL;
            } else {
                BlockState iblockstate = context.getWorld().getBlockState(context.getPos());
                Block block = iblockstate.getBlock();
                if (context.getFace() != Direction.DOWN && context.getWorld().isAirBlock(context.getPos().up())) {
                    if (block == Blocks.GRASS || block == Blocks.GRASS_PATH) {
                        this.setBlock(stack, playerIn, context.getWorld(), context.getPos(), Blocks.FARMLAND.getDefaultState());
                        return ActionResultType.SUCCESS;
                    }

                    if (block == Blocks.DIRT) {
                        this.setBlock(stack, playerIn, context.getWorld(), context.getPos(), Blocks.FARMLAND.getDefaultState());
                        return ActionResultType.SUCCESS;

                    } else if (block == Blocks.COARSE_DIRT) {
                        this.setBlock(stack, playerIn, context.getWorld(), context.getPos(), Blocks.DIRT.getDefaultState());
                        return ActionResultType.SUCCESS;
                    }
                }

                return ActionResultType.PASS;
            }
        }
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Iterator var3 = this.getToolTypes(stack).iterator();

        ToolType type;
        do {
            if (!var3.hasNext()) {
                if (state.getBlock() == Blocks.COBWEB) {
                    return this.efficiency * 5.0F;
                }

                return this.efficiency;
            }

            type = (ToolType) var3.next();
        } while(!state.getBlock().isToolEffective(state, type));

        return this.efficiency;
    }

    @Override
    public boolean canHarvestBlock(BlockState state) {
        return state.getMaterial() != Material.AIR && state.getMaterial() != Material.BARRIER;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, LivingEntity target, LivingEntity attacker) {
        itemStack.damageItem(1, attacker, (entity) -> {
            entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        return true;
    }
}