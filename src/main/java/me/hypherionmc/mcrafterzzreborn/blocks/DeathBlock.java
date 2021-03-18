/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class DeathBlock extends Block {

    public DeathBlock(String name, Material material, ItemGroup group, float hardness, float rest) {
        super(Properties.create(material, MaterialColor.RED).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(hardness, rest));
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));

    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {

        if (entityIn instanceof LivingEntity) {
            entityIn.attackEntityFrom(ModBlocks.death_block, 1.87491942E9F);
        }

    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {

        if (entityIn instanceof LivingEntity) {
            entityIn.attackEntityFrom(ModBlocks.death_block, 1.87491942E9F);
        }

    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return Block.makeCuboidShape(1.76D, 0, 1.76D, 1, 1, 1);
    }

}
