/*
 * Copyright (c) 2021. MIT License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import me.hypherionmc.mcrafterzzreborn.init.ModTabs;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.apache.commons.lang3.BooleanUtils;

public class TorchLever extends BlockTorch {

    public static PropertyBool POWERED = PropertyBool.create("powered");

    public TorchLever(String name) {
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(ModTabs.creativeTab);
        this.setDefaultState(this.getDefaultState().withProperty(POWERED, false));

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));

    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            state = state.cycleProperty(POWERED);
            worldIn.setBlockState(pos, state, 3);
            float f = (Boolean) state.getValue(POWERED) ? 0.6F : 0.5F;
            worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 0.3F, f);
            worldIn.notifyNeighborsOfStateChange(pos, this, false);
            return true;
        }
        return true;
    }

    @Override
    public boolean canProvidePower(IBlockState state) {
        return true;
    }

    @Override
    public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return blockState.getValue(POWERED) ? 15 : 0;
    }

    @Override
    public int getStrongPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        if (!blockState.getValue(POWERED))
        {
            return 0;
        }
        else
        {
            return 15;
        }
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        if (state.getValue(POWERED))
        {
            worldIn.notifyNeighborsOfStateChange(pos, this, false);
        }

        super.breakBlock(worldIn, pos, state);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {FACING, POWERED});
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        int powered = state.getValue(POWERED) ? 1 : 0;
        EnumFacing facing = state.getValue(FACING);

        return (int)powered * EnumFacing.values().length + facing.ordinal();
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        Boolean powered = BooleanUtils.toBoolean((int) (meta / EnumFacing.values().length) % 2);
        EnumFacing facing = EnumFacing.values()[meta % EnumFacing.values().length];

        if (facing == EnumFacing.DOWN) {
            return this.getDefaultState().withProperty(POWERED, powered);
        } else {
            return this.getDefaultState().withProperty(FACING, facing).withProperty(POWERED, powered);
        }
    }

    @Override
    public int getLightValue(IBlockState state) {
        return 14;
    }
}
