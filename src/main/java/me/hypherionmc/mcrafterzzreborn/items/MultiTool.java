/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

import java.util.Collections;
import java.util.Iterator;

public class MultiTool extends ItemTool {

    public Item repairItem;
    public static float attack_speed = -2.8F;
    public static float base_damage = 3.0F;

    public MultiTool(ToolMaterial material, Item repairItem) {
        super(base_damage, attack_speed, material, Collections.emptySet());
        this.setHarvestLevel("pickaxe", material.getHarvestLevel());
        this.setHarvestLevel("axe", material.getHarvestLevel());
        this.setHarvestLevel("spade", material.getHarvestLevel());
        this.setHarvestLevel("hoe", material.getHarvestLevel());
        this.setHarvestLevel("sword", material.getHarvestLevel());
        this.repairItem = repairItem;

    }

    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state) {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
        if (!worldIn.isRemote) {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player);
        }

    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = playerIn.getHeldItem(hand);

        if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack)) {
            return EnumActionResult.FAIL;
        } else {


            int hook = ForgeEventFactory.onHoeUse(stack, playerIn, worldIn, pos);
            if (hook != 0) {
                return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
            } else {
                IBlockState iblockstate = worldIn.getBlockState(pos);
                Block block = iblockstate.getBlock();
                if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up())) {
                    if (block == Blocks.GRASS || block == Blocks.GRASS_PATH) {
                        this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                        return EnumActionResult.SUCCESS;
                    }

                    if (block == Blocks.DIRT) {
                        switch((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT)) {
                            case DIRT:
                                this.setBlock(stack, playerIn, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                                return EnumActionResult.SUCCESS;
                            case COARSE_DIRT:
                                this.setBlock(stack, playerIn, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                                return EnumActionResult.SUCCESS;
                        }
                    }
                }

                return EnumActionResult.PASS;
            }
        }
    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        Iterator var3 = this.getToolClasses(stack).iterator();

        String type;
        do {
            if (!var3.hasNext()) {
                if (state.getBlock() == Blocks.WEB) {
                    return this.efficiency * 5.0F;
                }

                return this.efficiency;
            }

            type = (String)var3.next();
        } while(!state.getBlock().isToolEffective(type, state));

        return this.efficiency;
    }

    @Override
    public boolean canHarvestBlock(IBlockState state, ItemStack stack) {
        return state.getMaterial() != Material.AIR && state.getMaterial() != Material.BARRIER;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker) {
        itemStack.damageItem(1, attacker);
        return true;
    }
}