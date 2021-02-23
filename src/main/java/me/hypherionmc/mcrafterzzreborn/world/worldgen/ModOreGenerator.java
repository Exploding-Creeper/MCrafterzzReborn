/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.world.worldgen;

import me.hypherionmc.mcrafterzzreborn.config.Config;
import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModOreGenerator implements IWorldGenerator {

    public WorldGenerator copperOre;
    public WorldGenerator tinOre;
    public WorldGenerator amethystOre;
    public WorldGenerator jadeOre;
    public WorldGenerator basalt;
    public WorldGenerator clay;

    public ModOreGenerator() {
        this.copperOre = new WorldGenMinable(ModBlocks.copper_ore.getDefaultState(), Config.copper_block_count, BlockMatcher.forBlock(Blocks.STONE));
        this.tinOre = new WorldGenMinable(ModBlocks.tin_ore.getDefaultState(), Config.tin_block_count, BlockMatcher.forBlock(Blocks.STONE));
        this.amethystOre = new WorldGenMinable(ModBlocks.amethyst_ore.getDefaultState(), Config.amethyst_block_count, BlockMatcher.forBlock(Blocks.END_STONE));
        this.jadeOre = new WorldGenMinable(ModBlocks.jade_ore.getDefaultState(), Config.jade_block_count, BlockMatcher.forBlock(Blocks.STONE));
        this.basalt = new WorldGenMinable(ModBlocks.basalt.getDefaultState(), Config.basalt_block_count, BlockMatcher.forBlock(Blocks.STONE));
        this.clay = new WorldGenMinable(Blocks.CLAY.getDefaultState(), Config.clay_block_count, BlockMatcher.forBlock(Blocks.STONE));
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (Config.spawn_copper && random.nextInt(Config.copper_chance_to_spawn) == 0) {
            this.runGenerator(this.copperOre, world, random, chunkX, chunkZ, Config.copper_chance_to_spawn_in_chunk, Config.copper_min_height, Config.copper_max_height);
        }

        if (Config.spawn_tin && random.nextInt(Config.tin_chance_to_spawn) == 0) {
            this.runGenerator(this.tinOre, world, random, chunkX, chunkZ, Config.tin_chance_to_spawn_in_chunk, Config.tin_min_height, Config.tin_max_height);
        }

        if (Config.spawn_amethyst && random.nextInt(Config.amethyst_chance_to_spawn) == 0) {
            this.runGenerator(this.amethystOre, world, random, chunkX, chunkZ, Config.amethyst_chance_to_spawn_in_chunk, Config.amethyst_min_height, Config.amethyst_max_height);
        }

        if (Config.spawn_jade && random.nextInt(Config.jade_chance_to_spawn) == 0) {
            this.runGenerator(this.jadeOre, world, random, chunkX, chunkZ, Config.jade_chance_to_spawn_in_chunk, Config.jade_min_height, Config.jade_max_height);
        }

        if (Config.spawn_basalt && random.nextInt(Config.basalt_chance_to_spawn) == 0) {
            this.runGenerator(this.basalt, world, random, chunkX, chunkZ, Config.basalt_chance_to_spawn_in_chunk, Config.amethyst_min_height, Config.basalt_max_height);
        }

        if (Config.spawn_clay && random.nextInt(Config.clay_chance_to_spawn) == 0) {
            this.runGenerator(this.clay, world, random, chunkX, chunkZ, Config.clay_chance_to_spawn_in_chunk, Config.clay_min_height, Config.clay_max_height);
        }

    }

    public void runGenerator(WorldGenerator generator, World world, Random random, int chunk_x, int chunk_z, int chanceToSpawn, int minHeight, int maxHeight) {
        if (minHeight >= 0 && maxHeight <= 256 && minHeight <= maxHeight) {
            int heightDifferent = maxHeight - minHeight + 1;

            for(int i = 0; i < chanceToSpawn; ++i) {
                int x = chunk_x * 16 + random.nextInt(16);
                int y = minHeight + random.nextInt(heightDifferent);
                int z = chunk_z * 16 + random.nextInt(16);
                generator.generate(world, random, new BlockPos(x, y, z));
            }

        } else {
            throw new IllegalArgumentException("Illegal height varibles for world generator");
        }
    }
}