/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class FenceGate extends BlockHorizontal {

    public static final PropertyBool OPEN = PropertyBool.create("open");
    public static final PropertyBool POWERED = PropertyBool.create("powered");
    public static final PropertyBool IN_WALL = PropertyBool.create("in_wall");
    protected static final AxisAlignedBB AABB_COLLIDE_ZAXIS = new AxisAlignedBB(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D);
    protected static final AxisAlignedBB AABB_COLLIDE_XAXIS = new AxisAlignedBB(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D);
    protected static final AxisAlignedBB AABB_COLLIDE_ZAXIS_INWALL = new AxisAlignedBB(0.0D, 0.0D, 0.375D, 1.0D, 0.8125D, 0.625D);
    protected static final AxisAlignedBB AABB_COLLIDE_XAXIS_INWALL = new AxisAlignedBB(0.375D, 0.0D, 0.0D, 0.625D, 0.8125D, 1.0D);
    protected static final AxisAlignedBB AABB_CLOSED_SELECTED_ZAXIS = new AxisAlignedBB(0.0D, 0.0D, 0.375D, 1.0D, 1.5D, 0.625D);
    protected static final AxisAlignedBB AABB_CLOSED_SELECTED_XAXIS = new AxisAlignedBB(0.375D, 0.0D, 0.0D, 0.625D, 1.5D, 1.0D);

    
    public FenceGate(String name, Material material, SoundType stepSound, String tool, int toolLevel, MapColor mapColour) {
        super(material, mapColour);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);
        this.setDefaultState(this.getDefaultState().withProperty(OPEN, false).withProperty(POWERED, false).withProperty(IN_WALL, false));
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        state = this.getActualState(state, source, pos);
        return (Boolean)state.getValue(IN_WALL) ? (((EnumFacing)state.getValue(FACING)).getAxis() == EnumFacing.Axis.X ? AABB_COLLIDE_XAXIS_INWALL : AABB_COLLIDE_ZAXIS_INWALL) : (((EnumFacing)state.getValue(FACING)).getAxis() == EnumFacing.Axis.X ? AABB_COLLIDE_XAXIS : AABB_COLLIDE_ZAXIS);
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        EnumFacing.Axis enumfacing$axis = ((EnumFacing)state.getValue(FACING)).getAxis();
        if (enumfacing$axis == EnumFacing.Axis.Z && (worldIn.getBlockState(pos.west()).getBlock() == Blocks.COBBLESTONE_WALL || worldIn.getBlockState(pos.east()).getBlock() == Blocks.COBBLESTONE_WALL) || enumfacing$axis == EnumFacing.Axis.X && (worldIn.getBlockState(pos.north()).getBlock() == Blocks.COBBLESTONE_WALL || worldIn.getBlockState(pos.south()).getBlock() == Blocks.COBBLESTONE_WALL)) {
            state = state.withProperty(IN_WALL, true);
        }

        return state;
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return worldIn.getBlockState(pos.down()).getMaterial().isSolid() && super.canPlaceBlockAt(worldIn, pos);
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return (Boolean)blockState.getValue(OPEN) ? NULL_AABB : (((EnumFacing)blockState.getValue(FACING)).getAxis() == EnumFacing.Axis.Z ? AABB_CLOSED_SELECTED_ZAXIS : AABB_CLOSED_SELECTED_XAXIS);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
        return worldIn.getBlockState(pos).getValue(OPEN);
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing()).withProperty(OPEN, false).withProperty(POWERED, false).withProperty(IN_WALL, false);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (state.getValue(OPEN)) {
            state = state.withProperty(OPEN, false);
            worldIn.setBlockState(pos, state, 10);
        } else {
            EnumFacing enumfacing = EnumFacing.fromAngle((double)playerIn.rotationYaw);
            if (state.getValue(FACING) == enumfacing.getOpposite()) {
                state = state.withProperty(FACING, enumfacing);
            }

            state = state.withProperty(OPEN, true);
            worldIn.setBlockState(pos, state, 10);
        }

        worldIn.playEvent(playerIn, state.getValue(OPEN) ? 1008 : 1014, pos, 0);
        return true;
    }

    @Override
    public void observedNeighborChange(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos changedBlockPos) {
        if (!worldIn.isRemote) {
            boolean flag = worldIn.isBlockPowered(pos);
            if (flag || blockIn.getDefaultState().canProvidePower()) {
                if (flag && !(Boolean)state.getValue(OPEN) && !(Boolean)state.getValue(POWERED)) {
                    worldIn.setBlockState(pos, state.withProperty(OPEN, true).withProperty(POWERED, true), 2);
                    worldIn.playEvent((EntityPlayer)null, 1008, pos, 0);
                } else if (!flag && (Boolean)state.getValue(OPEN) && (Boolean)state.getValue(POWERED)) {
                    worldIn.setBlockState(pos, state.withProperty(OPEN, false).withProperty(POWERED, false), 2);
                    worldIn.playEvent((EntityPlayer)null, 1014, pos, 0);
                } else if (flag != (Boolean)state.getValue(POWERED)) {
                    worldIn.setBlockState(pos, state.withProperty(POWERED, flag), 2);
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return true;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.byHorizontalIndex(meta)).withProperty(OPEN, (meta & 4) != 0).withProperty(POWERED, (meta & 8) != 0);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | state.getValue(FACING).getHorizontalIndex();
        if (state.getValue(POWERED)) {
            i |= 8;
        }

        if (state.getValue(OPEN)) {
            i |= 4;
        }

        return i;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING, OPEN, POWERED, IN_WALL);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }
}
