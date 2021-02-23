/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.world.worldgen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class ModWorldGeneratorFlowers extends WorldGenerator {

    Block flower;

    public ModWorldGeneratorFlowers(Block flower) {
        this.flower = flower;
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos pos) {
        int y = 1 + getGroundFromAbove(worldIn, pos.getX(), pos.getZ());
        if (y >= pos.getY()) {
            BlockPos bushPos = new BlockPos(pos.getX(), y, pos.getZ());
            Block toReplace = worldIn.getBlockState(bushPos).getBlock();
            if (toReplace == Blocks.AIR || toReplace.getMaterial(toReplace.getDefaultState()) == Material.PLANTS) {
                worldIn.setBlockState(bushPos, this.flower.getDefaultState(), 2);
            }
        }

        return false;
    }

    public static int getGroundFromAbove(World world, int x, int z) {
        int y = 255;

        Block blockAt;
        for(boolean foundGround = false; !foundGround && y-- >= 0; foundGround = blockAt == Blocks.DIRT || blockAt == Blocks.GRASS) {
            blockAt = world.getBlockState(new BlockPos(x, y, z)).getBlock();
        }

        return y;
    }
}
