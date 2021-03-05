/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.world.worldgen;

import me.hypherionmc.mcrafterzzreborn.config.Config;
import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModFlowerGenerator implements IWorldGenerator {

    public WorldGenerator yellow_tulip;
    public WorldGenerator green_tulip;
    public WorldGenerator blue_tulip;
    public WorldGenerator black_tulip;

    public ModFlowerGenerator() {
        this.yellow_tulip = new ModWorldGeneratorFlowers(ModBlocks.yellow_tulip);
        this.green_tulip = new ModWorldGeneratorFlowers(ModBlocks.green_tulip);
        this.blue_tulip = new ModWorldGeneratorFlowers(ModBlocks.blue_tulip);
        this.black_tulip = new ModWorldGeneratorFlowers(ModBlocks.black_tulip);
    }

    public void runGenerator(WorldGenerator generator, World world, Random random, int chunk_x, int chunk_z, int minChanceToSpawn, int maxChanceToSpawn, int chanceToSpawn) {
        int x = chunk_x * 16;
        int z = chunk_z * 16;
        Biome biome = world.getBiome(new BlockPos(x, 64, z));
        if (biome != Biomes.DEEP_OCEAN && biome != Biomes.OCEAN && biome != Biomes.FROZEN_OCEAN && biome != Biomes.DESERT && biome != Biomes.DESERT_HILLS && biome != Biomes.MUSHROOM_ISLAND && biome != Biomes.MUSHROOM_ISLAND_SHORE && random.nextInt(chanceToSpawn) == 1) {
            int numberOfFlowers = minChanceToSpawn + random.nextInt(maxChanceToSpawn - minChanceToSpawn);

            for(int i = 0; i < numberOfFlowers; ++i) {
                int randomX = x + random.nextInt(16);
                int randomZ = z + random.nextInt(16);
                generator.generate(world, random, new BlockPos(randomX, 24, randomZ));
            }
        }

    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (Config.spawn_flowers) {
            this.runGenerator(this.yellow_tulip, world, random, chunkX, chunkZ, 3, 15, 16);
            this.runGenerator(this.green_tulip, world, random, chunkX, chunkZ, 3, 15, 16);
            this.runGenerator(this.blue_tulip, world, random, chunkX, chunkZ, 3, 15, 16);
            this.runGenerator(this.black_tulip, world, random, chunkX, chunkZ, 3, 15, 16);
        }

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