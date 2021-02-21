/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import me.hypherionmc.mcrafterzzreborn.modelements.ModElements;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class DeathBlock extends Block {

    public DeathBlock(Material material) {
        super(material, MapColor.RED);
        this.setHarvestLevel("pickaxe", 2);
        this.setSoundType(SoundType.STONE);

    }

    @Override
    public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {

        if (entityIn instanceof EntityLivingBase) {
            entityIn.attackEntityFrom(ModElements.death_block, 1.87491942E9F);
        }

    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {

        if (entityIn instanceof EntityLivingBase) {
            entityIn.attackEntityFrom(ModElements.death_block, 1.87491942E9F);
        }

    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return new AxisAlignedBB(0.11D, 0.0D, 0.11D, 0.99D, 0.99D, 0.99D);
    }
}
