/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.modelements;

import me.hypherionmc.mcrafterzzreborn.Registry;
import me.hypherionmc.mcrafterzzreborn.blocks.Fence;
import me.hypherionmc.mcrafterzzreborn.blocks.FenceGate;
import me.hypherionmc.mcrafterzzreborn.blocks.ModStairs;
import me.hypherionmc.mcrafterzzreborn.blocks.ModWall;
import me.hypherionmc.mcrafterzzreborn.config.Config;
import me.hypherionmc.mcrafterzzreborn.util.ModUtil;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModElementsSmallerBlocks {

    public static Block dark_nether_bricks_fence;
    public static Block red_nether_bricks_fence;
    public static Block nether_bricks_fence_gate;
    public static Block dark_nether_bricks_fence_gate;
    public static Block red_nether_bricks_fence_gate;

    public static Block iron_wall;
    public static Block gold_wall;
    public static Block diamond_wall;
    public static Block emerald_wall;
    public static Block quartz_wall;
    public static Block copper_wall;
    public static Block tin_wall;
    public static Block bronze_wall;
    public static Block jade_wall;
    public static Block amethyst_wall;
    public static Block stone_wall;
    public static Block granite_wall;
    public static Block andesite_wall;
    public static Block diorite_wall;
    public static Block basalt_wall;
    public static Block brick_wall;
    public static Block stonebrick_wall;
    public static Block granite_bricks_wall;
    public static Block andesite_bricks_wall;
    public static Block diorite_bricks_wall;
    public static Block basalt_bricks_wall;
    public static Block sandy_stone_bricks_wall;
    public static Block spruce_log_wall;

    public static Block coal_stairs;
    public static Block iron_stairs;
    public static Block gold_stairs;
    public static Block lapis_stairs;
    public static Block redstone_stairs;
    public static Block diamond_stairs;
    public static Block emerald_stairs;
    public static Block tin_stairs;
    public static Block copper_stairs;
    public static Block bronze_stairs;
    public static Block jade_stairs;
    public static Block amethyst_stairs;
    public static Block stone_stairs;
    public static Block granite_stairs;
    public static Block andesite_stairs;
    public static Block diorite_stairs;
    public static Block basalt_stairs;
    public static Block granite_bricks_stairs;
    public static Block andesite_bricks_stairs;
    public static Block diorite_bricks_stairs;
    public static Block basalt_bricks_stairs;
    public static Block sandy_stone_bricks_stairs;
    public static Block oak_log_stairs;
    public static Block birch_log_stairs;
    public static Block spruce_log_stairs;
    public static Block jungle_log_stairs;
    public static Block acacia_log_stairs;
    public static Block dark_oak_log_stairs;
    public static Block seamless_oak_log_stairs;
    public static Block seamless_birch_log_stairs;
    public static Block seamless_spruce_log_stairs;
    public static Block seamless_jungle_log_stairs;
    public static Block seamless_acacia_log_stairs;
    public static Block seamless_dark_oak_log_stairs;
    public static Block seamless_smooth_sandstone_stairs;
    public static Block seamless_smooth_red_sandstone_stairs;
    public static Block prismarine_stairs;
    public static Block prismarine_bricks_stairs;
    public static Block dark_prismarine_stairs;
    public static Block obsidian_stairs;
    public static Block end_stone_bricks_stairs;
    public static Block bone_stairs;
    public static Block red_nether_bricks_stairs;
    public static Block dark_nether_bricks_stairs;

    public ModElementsSmallerBlocks() {
    }

    public static void createBlocksAndItems() {
        dark_nether_bricks_fence = (new Fence(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)).setTranslationKey("dark_nether_bricks_fence").setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        red_nether_bricks_fence = (new Fence(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.NETHERRACK)).setTranslationKey("red_nether_bricks_fence").setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        nether_bricks_fence_gate = (new FenceGate(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED)).setTranslationKey("nether_bricks_fence_gate").setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        dark_nether_bricks_fence_gate = (new FenceGate(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)).setTranslationKey("dark_nether_bricks_fence_gate").setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        red_nether_bricks_fence_gate = (new FenceGate(Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK)).setTranslationKey("red_nether_bricks_fence_gate").setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

        iron_wall = (new ModWall(Blocks.IRON_BLOCK, 5.0F, 30.0F, MapColor.IRON)).setTranslationKey("iron_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        gold_wall = (new ModWall(Blocks.GOLD_BLOCK, 5.0F, 30.0F, MapColor.GOLD)).setTranslationKey("gold_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        diamond_wall = (new ModWall(Blocks.DIAMOND_BLOCK, 5.0F, 30.0F, MapColor.DIAMOND)).setTranslationKey("diamond_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        emerald_wall = (new ModWall(Blocks.EMERALD_BLOCK, 5.0F, 30.0F, MapColor.EMERALD)).setTranslationKey("emerald_wall").setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        quartz_wall = (new ModWall(Blocks.QUARTZ_BLOCK, 0.8F, 4.0F, MapColor.QUARTZ)).setTranslationKey("quartz_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        copper_wall = (new ModWall(ModElements.copper_block, 5.0F, 30.0F, MapColor.RED)).setTranslationKey("copper_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        tin_wall = (new ModWall(ModElements.tin_block, 5.0F, 30.0F, MapColor.IRON)).setTranslationKey("tin_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        bronze_wall = (new ModWall(ModElements.bronze_block, 5.0F, 30.0F, MapColor.RED)).setTranslationKey("bronze_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        jade_wall = (new ModWall(ModElements.jade_block, 6.0F, 35.0F, MapColor.EMERALD)).setTranslationKey("jade_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        amethyst_wall = (new ModWall(ModElements.amethyst_block, 6.0F, 35.0F, MapColor.PURPLE)).setTranslationKey("amethyst_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        stone_wall = (new ModWall(Blocks.STONE, 1.5F, 30.0F, MapColor.STONE)).setTranslationKey("stone_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        granite_wall = (new ModWall(Blocks.STONE, 1.5F, 30.0F, MapColor.RED)).setTranslationKey("granite_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        andesite_wall = (new ModWall(Blocks.STONE, 1.5F, 30.0F, MapColor.STONE)).setTranslationKey("andesite_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        diorite_wall = (new ModWall(Blocks.STONE, 1.5F, 30.0F, MapColor.IRON)).setTranslationKey("diorite_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        basalt_wall = (new ModWall(Blocks.STONE, 1.5F, 30.0F, MapColor.BLACK)).setTranslationKey("basalt_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        brick_wall = (new ModWall(Blocks.BRICK_BLOCK, 2.0F, 30.0F, MapColor.RED)).setTranslationKey("brick_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        stonebrick_wall = (new ModWall(Blocks.STONEBRICK, 1.5F, 30.0F, MapColor.STONE)).setTranslationKey("stonebrick_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        granite_bricks_wall = (new ModWall(ModElements.granite_bricks, 1.5F, 30.0F, MapColor.RED)).setTranslationKey("granite_bricks_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        andesite_bricks_wall = (new ModWall(ModElements.andesite_bricks, 1.5F, 30.0F, MapColor.STONE)).setTranslationKey("andesite_bricks_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        diorite_bricks_wall = (new ModWall(ModElements.diorite_bricks, 1.5F, 30.0F, MapColor.IRON)).setTranslationKey("diorite_bricks_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        basalt_bricks_wall = (new ModWall(ModElements.basalt_bricks, 1.5F, 30.0F, MapColor.BLACK)).setTranslationKey("basalt_bricks_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        sandy_stone_bricks_wall = (new ModWall(ModElements.basalt_bricks, 1.5F, 30.0F, MapColor.SAND)).setTranslationKey("sandy_stone_bricks_wall").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);

        coal_stairs = (new ModStairs(Blocks.COAL_BLOCK.getDefaultState(), Material.ROCK)).setTranslationKey("coal_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        iron_stairs = (new ModStairs(Blocks.IRON_BLOCK.getDefaultState(), Material.ROCK)).setTranslationKey("iron_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        gold_stairs = (new ModStairs(Blocks.GOLD_BLOCK.getDefaultState(), Material.ROCK)).setTranslationKey("gold_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        lapis_stairs = (new ModStairs(Blocks.LAPIS_BLOCK.getDefaultState(), Material.ROCK)).setTranslationKey("lapis_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        redstone_stairs = (new ModStairs(Blocks.REDSTONE_BLOCK.getDefaultState(), Material.ROCK)).setTranslationKey("redstone_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        diamond_stairs = (new ModStairs(Blocks.DIAMOND_BLOCK.getDefaultState(), Material.ROCK)).setTranslationKey("diamond_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        emerald_stairs = (new ModStairs(Blocks.EMERALD_BLOCK.getDefaultState(), Material.ROCK)).setTranslationKey("emerald_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        tin_stairs = (new ModStairs(ModElements.tin_block.getDefaultState(), Material.ROCK)).setTranslationKey("tin_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        copper_stairs = (new ModStairs(ModElements.copper_block.getDefaultState(), Material.ROCK)).setTranslationKey("copper_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        bronze_stairs = (new ModStairs(ModElements.bronze_block.getDefaultState(), Material.ROCK)).setTranslationKey("bronze_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        jade_stairs = (new ModStairs(ModElements.jade_block.getDefaultState(), Material.ROCK)).setTranslationKey("jade_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        amethyst_stairs = (new ModStairs(ModElements.amethyst_block.getDefaultState(), Material.ROCK)).setTranslationKey("amethyst_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        stone_stairs = (new ModStairs(Blocks.STONE.getDefaultState(), Material.ROCK)).setTranslationKey("stone_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        granite_stairs = (new ModStairs(Blocks.STONE.getDefaultState(), Material.ROCK)).setTranslationKey("granite_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        andesite_stairs = (new ModStairs(Blocks.STONE.getDefaultState(), Material.ROCK)).setTranslationKey("andesite_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        diorite_stairs = (new ModStairs(Blocks.STONE.getDefaultState(), Material.ROCK)).setTranslationKey("diorite_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        basalt_stairs = (new ModStairs(ModElements.basalt.getDefaultState(), Material.ROCK)).setTranslationKey("basalt_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        granite_bricks_stairs = (new ModStairs(ModElements.granite_bricks.getDefaultState(), Material.ROCK)).setTranslationKey("granite_bricks_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        andesite_bricks_stairs = (new ModStairs(ModElements.andesite_bricks.getDefaultState(), Material.ROCK)).setTranslationKey("andesite_bricks_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        diorite_bricks_stairs = (new ModStairs(ModElements.diorite_bricks.getDefaultState(), Material.ROCK)).setTranslationKey("diorite_bricks_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        basalt_bricks_stairs = (new ModStairs(ModElements.basalt_bricks.getDefaultState(), Material.ROCK)).setTranslationKey("basalt_bricks_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        sandy_stone_bricks_stairs = (new ModStairs(ModElements.sandy_stone_bricks.getDefaultState(), Material.ROCK)).setTranslationKey("sandy_stone_bricks_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        oak_log_stairs = (new ModStairs(Blocks.LOG.getDefaultState(), Material.ROCK)).setTranslationKey("oak_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        birch_log_stairs = (new ModStairs(Blocks.LOG.getDefaultState(), Material.ROCK)).setTranslationKey("birch_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        spruce_log_stairs = (new ModStairs(Blocks.LOG.getDefaultState(), Material.ROCK)).setTranslationKey("spruce_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        jungle_log_stairs = (new ModStairs(Blocks.LOG.getDefaultState(), Material.ROCK)).setTranslationKey("jungle_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        acacia_log_stairs = (new ModStairs(Blocks.LOG2.getDefaultState(), Material.ROCK)).setTranslationKey("acacia_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        dark_oak_log_stairs = (new ModStairs(Blocks.LOG2.getDefaultState(), Material.ROCK)).setTranslationKey("dark_oak_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        seamless_oak_log_stairs = (new ModStairs(ModElements.seamless_oak_log.getDefaultState(), Material.WOOD)).setTranslationKey("seamless_oak_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        seamless_birch_log_stairs = (new ModStairs(ModElements.seamless_birch_log.getDefaultState(), Material.WOOD)).setTranslationKey("seamless_birch_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        seamless_spruce_log_stairs = (new ModStairs(ModElements.seamless_spruce_log.getDefaultState(), Material.WOOD)).setTranslationKey("seamless_spruce_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        seamless_jungle_log_stairs = (new ModStairs(ModElements.seamless_jungle_log.getDefaultState(), Material.WOOD)).setTranslationKey("seamless_jungle_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        seamless_acacia_log_stairs = (new ModStairs(ModElements.seamless_acacia_log.getDefaultState(), Material.WOOD)).setTranslationKey("seamless_acacia_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        seamless_dark_oak_log_stairs = (new ModStairs(ModElements.seamless_dark_oak_log.getDefaultState(), Material.WOOD)).setTranslationKey("seamless_dark_oak_log_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        seamless_smooth_sandstone_stairs = (new ModStairs(ModElements.seamless_smooth_sandstone.getDefaultState(), Material.ROCK)).setTranslationKey("seamless_smooth_sandstone_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        seamless_smooth_red_sandstone_stairs = (new ModStairs(ModElements.seamless_smooth_red_sandstone.getDefaultState(), Material.ROCK)).setTranslationKey("seamless_smooth_red_sandstone_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        prismarine_stairs = (new ModStairs(Blocks.PRISMARINE.getDefaultState(), Material.ROCK)).setTranslationKey("prismarine_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        prismarine_bricks_stairs = (new ModStairs(Blocks.PRISMARINE.getDefaultState(), Material.ROCK)).setTranslationKey("prismarine_bricks_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        dark_prismarine_stairs = (new ModStairs(Blocks.PRISMARINE.getDefaultState(), Material.ROCK)).setTranslationKey("dark_prismarine_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        obsidian_stairs = (new ModStairs(Blocks.OBSIDIAN.getDefaultState(), Material.ROCK)).setTranslationKey("obsidian_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        end_stone_bricks_stairs = (new ModStairs(Blocks.END_BRICKS.getDefaultState(), Material.ROCK)).setTranslationKey("end_stone_bricks_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        bone_stairs = (new ModStairs(Blocks.BONE_BLOCK.getDefaultState(), Material.ROCK)).setTranslationKey("bone_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        red_nether_bricks_stairs = (new ModStairs(Blocks.RED_NETHER_BRICK.getDefaultState(), Material.ROCK)).setTranslationKey("red_nether_bricks_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
        dark_nether_bricks_stairs = (new ModStairs(ModElements.dark_nether_bricks.getDefaultState(), Material.ROCK)).setTranslationKey("dark_nether_bricks_stairs").setCreativeTab(ModElements.creativeTabSmallerBuildingBlocks);
    }

    public static void registerItemsAndBlocks() {
        Registry.registerBlock(dark_nether_bricks_fence, dark_nether_bricks_fence.getTranslationKey().substring(5));
        Registry.registerBlock(red_nether_bricks_fence, red_nether_bricks_fence.getTranslationKey().substring(5));
        Registry.registerBlock(nether_bricks_fence_gate, nether_bricks_fence_gate.getTranslationKey().substring(5));
        Registry.registerBlock(dark_nether_bricks_fence_gate, dark_nether_bricks_fence_gate.getTranslationKey().substring(5));
        Registry.registerBlock(red_nether_bricks_fence_gate, red_nether_bricks_fence_gate.getTranslationKey().substring(5));

        Registry.registerBlock(iron_wall, iron_wall.getTranslationKey().substring(5));
        Registry.registerBlock(gold_wall, gold_wall.getTranslationKey().substring(5));
        Registry.registerBlock(diamond_wall, diamond_wall.getTranslationKey().substring(5));
        Registry.registerBlock(emerald_wall, emerald_wall.getTranslationKey().substring(5));
        Registry.registerBlock(quartz_wall, quartz_wall.getTranslationKey().substring(5));
        Registry.registerBlock(copper_wall, copper_wall.getTranslationKey().substring(5));
        Registry.registerBlock(tin_wall, tin_wall.getTranslationKey().substring(5));
        Registry.registerBlock(bronze_wall, bronze_wall.getTranslationKey().substring(5));
        Registry.registerBlock(jade_wall, jade_wall.getTranslationKey().substring(5));
        Registry.registerBlock(amethyst_wall, amethyst_wall.getTranslationKey().substring(5));
        Registry.registerBlock(stone_wall, stone_wall.getTranslationKey().substring(5));
        Registry.registerBlock(granite_wall, granite_wall.getTranslationKey().substring(5));
        Registry.registerBlock(andesite_wall, andesite_wall.getTranslationKey().substring(5));
        Registry.registerBlock(diorite_wall, diorite_wall.getTranslationKey().substring(5));
        Registry.registerBlock(basalt_wall, basalt_wall.getTranslationKey().substring(5));
        Registry.registerBlock(brick_wall, brick_wall.getTranslationKey().substring(5));
        Registry.registerBlock(stonebrick_wall, stonebrick_wall.getTranslationKey().substring(5));
        Registry.registerBlock(granite_bricks_wall, granite_bricks_wall.getTranslationKey().substring(5));
        Registry.registerBlock(andesite_bricks_wall, andesite_bricks_wall.getTranslationKey().substring(5));
        Registry.registerBlock(diorite_bricks_wall, diorite_bricks_wall.getTranslationKey().substring(5));
        Registry.registerBlock(basalt_bricks_wall, basalt_bricks_wall.getTranslationKey().substring(5));
        Registry.registerBlock(sandy_stone_bricks_wall, sandy_stone_bricks_wall.getTranslationKey().substring(5));

        Registry.registerBlock(coal_stairs, coal_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(iron_stairs, iron_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(gold_stairs, gold_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(lapis_stairs, lapis_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(redstone_stairs, redstone_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(diamond_stairs, diamond_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(emerald_stairs, emerald_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(tin_stairs, tin_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(copper_stairs, copper_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(bronze_stairs, bronze_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(jade_stairs, jade_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(amethyst_stairs, amethyst_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(stone_stairs, stone_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(granite_stairs, granite_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(andesite_stairs, andesite_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(diorite_stairs, diorite_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(basalt_stairs, basalt_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(granite_bricks_stairs, granite_bricks_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(andesite_bricks_stairs, andesite_bricks_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(diorite_bricks_stairs, diorite_bricks_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(basalt_bricks_stairs, basalt_bricks_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(sandy_stone_bricks_stairs, sandy_stone_bricks_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(oak_log_stairs, oak_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(birch_log_stairs, birch_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(spruce_log_stairs, spruce_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(jungle_log_stairs, jungle_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(acacia_log_stairs, acacia_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(dark_oak_log_stairs, dark_oak_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(seamless_oak_log_stairs, seamless_oak_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(seamless_birch_log_stairs, seamless_birch_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(seamless_spruce_log_stairs, seamless_spruce_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(seamless_jungle_log_stairs, seamless_jungle_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(seamless_acacia_log_stairs, seamless_acacia_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(seamless_dark_oak_log_stairs, seamless_dark_oak_log_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(seamless_smooth_sandstone_stairs, seamless_smooth_sandstone_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(seamless_smooth_red_sandstone_stairs, seamless_smooth_red_sandstone_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(prismarine_stairs, prismarine_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(prismarine_bricks_stairs, prismarine_bricks_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(dark_prismarine_stairs, dark_prismarine_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(obsidian_stairs, obsidian_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(end_stone_bricks_stairs, end_stone_bricks_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(bone_stairs, bone_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(red_nether_bricks_stairs, red_nether_bricks_stairs.getTranslationKey().substring(5));
        Registry.registerBlock(dark_nether_bricks_stairs, dark_nether_bricks_stairs.getTranslationKey().substring(5));
    }

    public static void registerRenders() {
        Registry.registerRenderBlock(dark_nether_bricks_fence);
        Registry.registerRenderBlock(red_nether_bricks_fence);
        Registry.registerRenderBlock(nether_bricks_fence_gate);
        Registry.registerRenderBlock(dark_nether_bricks_fence_gate);
        Registry.registerRenderBlock(red_nether_bricks_fence_gate);

        Registry.registerRenderBlock(iron_wall);
        Registry.registerRenderBlock(gold_wall);
        Registry.registerRenderBlock(diamond_wall);
        Registry.registerRenderBlock(emerald_wall);
        Registry.registerRenderBlock(quartz_wall);
        Registry.registerRenderBlock(copper_wall);
        Registry.registerRenderBlock(tin_wall);
        Registry.registerRenderBlock(bronze_wall);
        Registry.registerRenderBlock(jade_wall);
        Registry.registerRenderBlock(amethyst_wall);
        Registry.registerRenderBlock(stone_wall);
        Registry.registerRenderBlock(granite_wall);
        Registry.registerRenderBlock(andesite_wall);
        Registry.registerRenderBlock(diorite_wall);
        Registry.registerRenderBlock(basalt_wall);
        Registry.registerRenderBlock(brick_wall);
        Registry.registerRenderBlock(stonebrick_wall);
        Registry.registerRenderBlock(granite_bricks_wall);
        Registry.registerRenderBlock(diorite_bricks_wall);
        Registry.registerRenderBlock(andesite_bricks_wall);
        Registry.registerRenderBlock(basalt_bricks_wall);
        Registry.registerRenderBlock(sandy_stone_bricks_wall);

        Registry.registerRenderBlock(coal_stairs);
        Registry.registerRenderBlock(iron_stairs);
        Registry.registerRenderBlock(gold_stairs);
        Registry.registerRenderBlock(lapis_stairs);
        Registry.registerRenderBlock(redstone_stairs);
        Registry.registerRenderBlock(diamond_stairs);
        Registry.registerRenderBlock(emerald_stairs);
        Registry.registerRenderBlock(tin_stairs);
        Registry.registerRenderBlock(copper_stairs);
        Registry.registerRenderBlock(bronze_stairs);
        Registry.registerRenderBlock(jade_stairs);
        Registry.registerRenderBlock(amethyst_stairs);
        Registry.registerRenderBlock(stone_stairs);
        Registry.registerRenderBlock(granite_stairs);
        Registry.registerRenderBlock(andesite_stairs);
        Registry.registerRenderBlock(diorite_stairs);
        Registry.registerRenderBlock(basalt_stairs);
        Registry.registerRenderBlock(granite_bricks_stairs);
        Registry.registerRenderBlock(andesite_bricks_stairs);
        Registry.registerRenderBlock(diorite_bricks_stairs);
        Registry.registerRenderBlock(basalt_bricks_stairs);
        Registry.registerRenderBlock(sandy_stone_bricks_stairs);
        Registry.registerRenderBlock(oak_log_stairs);
        Registry.registerRenderBlock(birch_log_stairs);
        Registry.registerRenderBlock(spruce_log_stairs);
        Registry.registerRenderBlock(jungle_log_stairs);
        Registry.registerRenderBlock(acacia_log_stairs);
        Registry.registerRenderBlock(dark_oak_log_stairs);
        Registry.registerRenderBlock(seamless_oak_log_stairs);
        Registry.registerRenderBlock(seamless_birch_log_stairs);
        Registry.registerRenderBlock(seamless_spruce_log_stairs);
        Registry.registerRenderBlock(seamless_jungle_log_stairs);
        Registry.registerRenderBlock(seamless_acacia_log_stairs);
        Registry.registerRenderBlock(seamless_dark_oak_log_stairs);
        Registry.registerRenderBlock(seamless_smooth_sandstone_stairs);
        Registry.registerRenderBlock(seamless_smooth_red_sandstone_stairs);
        Registry.registerRenderBlock(prismarine_stairs);
        Registry.registerRenderBlock(prismarine_bricks_stairs);
        Registry.registerRenderBlock(dark_prismarine_stairs);
        Registry.registerRenderBlock(obsidian_stairs);
        Registry.registerRenderBlock(end_stone_bricks_stairs);
        Registry.registerRenderBlock(bone_stairs);
        Registry.registerRenderBlock(red_nether_bricks_stairs);
        Registry.registerRenderBlock(dark_nether_bricks_stairs);
    }

    public static void crafting() {
        if (Config.crafting) {
            GameRegistry.addShapelessRecipe(new ItemStack(dark_nether_bricks_fence).getItem().getRegistryName(), null, new ItemStack(dark_nether_bricks_fence), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_fence, ModElements.dark_nether_bricks}));
            GameRegistry.addShapelessRecipe(new ItemStack(red_nether_bricks_fence).getItem().getRegistryName(), null, new ItemStack(red_nether_bricks_fence), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_fence, Blocks.RED_NETHER_BRICK}));
            GameRegistry.addShapelessRecipe(new ItemStack(nether_bricks_fence_gate).getItem().getRegistryName(), null, new ItemStack(nether_bricks_fence_gate), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_fence_gate, Blocks.NETHER_BRICK}));
            GameRegistry.addShapelessRecipe(new ItemStack(dark_nether_bricks_fence_gate).getItem().getRegistryName(), null, new ItemStack(dark_nether_bricks_fence_gate), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_fence_gate, ModElements.dark_nether_bricks}));
            GameRegistry.addShapelessRecipe(new ItemStack(red_nether_bricks_fence_gate).getItem().getRegistryName(), null, new ItemStack(red_nether_bricks_fence_gate), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_fence_gate, Blocks.RED_NETHER_BRICK}));

            if (Config.craft_vanilla_blocks_with_patterns) {
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE_WALL).getItem().getRegistryName(), null, new ItemStack(Blocks.COBBLESTONE_WALL), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Blocks.COBBLESTONE}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE_WALL, 1, 1).getItem().getRegistryName(), null, new ItemStack(Blocks.COBBLESTONE_WALL, 1, 1), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Blocks.MOSSY_COBBLESTONE}));
            }

            GameRegistry.addShapelessRecipe(new ItemStack(iron_wall).getItem().getRegistryName(), null, new ItemStack(iron_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Items.IRON_INGOT}));
            GameRegistry.addShapelessRecipe(new ItemStack(gold_wall).getItem().getRegistryName(), null, new ItemStack(gold_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Items.GOLD_INGOT}));
            GameRegistry.addShapelessRecipe(new ItemStack(diamond_wall).getItem().getRegistryName(), null, new ItemStack(diamond_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Items.DIAMOND}));
            GameRegistry.addShapelessRecipe(new ItemStack(emerald_wall).getItem().getRegistryName(), null, new ItemStack(emerald_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Items.EMERALD}));
            GameRegistry.addShapelessRecipe(new ItemStack(quartz_wall).getItem().getRegistryName(), null, new ItemStack(quartz_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Items.QUARTZ}));
            GameRegistry.addShapelessRecipe(new ItemStack(copper_wall).getItem().getRegistryName(), null, new ItemStack(copper_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.copper_ingot}));
            GameRegistry.addShapelessRecipe(new ItemStack(tin_wall).getItem().getRegistryName(), null, new ItemStack(tin_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.tin_ingot}));
            GameRegistry.addShapelessRecipe(new ItemStack(bronze_wall).getItem().getRegistryName(), null, new ItemStack(bronze_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.bronze_ingot}));
            GameRegistry.addShapelessRecipe(new ItemStack(jade_wall).getItem().getRegistryName(), null, new ItemStack(jade_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.jade}));
            GameRegistry.addShapelessRecipe(new ItemStack(amethyst_wall).getItem().getRegistryName(), null, new ItemStack(amethyst_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.amethyst}));
            GameRegistry.addShapelessRecipe(new ItemStack(stone_wall).getItem().getRegistryName(), null, new ItemStack(stone_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Blocks.STONE}));
            GameRegistry.addShapelessRecipe(new ItemStack(granite_wall).getItem().getRegistryName(), null, new ItemStack(granite_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, new ItemStack(Blocks.STONE, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(andesite_wall).getItem().getRegistryName(), null, new ItemStack(andesite_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, new ItemStack(Blocks.STONE, 1, 5)}));
            GameRegistry.addShapelessRecipe(new ItemStack(diorite_wall).getItem().getRegistryName(), null, new ItemStack(diorite_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, new ItemStack(Blocks.STONE, 1, 3)}));
            GameRegistry.addShapelessRecipe(new ItemStack(basalt_wall).getItem().getRegistryName(), null, new ItemStack(basalt_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.basalt}));
            GameRegistry.addShapelessRecipe(new ItemStack(brick_wall).getItem().getRegistryName(), null, new ItemStack(brick_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Blocks.BRICK_BLOCK}));
            GameRegistry.addShapelessRecipe(new ItemStack(stonebrick_wall).getItem().getRegistryName(), null, new ItemStack(stonebrick_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, Blocks.STONEBRICK}));
            //GameRegistry.addShapelessRecipe(new ItemStack(granite_bricks_wall).getItem().getRegistryName(), null, new ItemStack(granite_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.granite_bricks}));
            //GameRegistry.addShapelessRecipe(new ItemStack(diorite_bricks_wall).getItem().getRegistryName(), null, new ItemStack(diorite_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.diorite_bricks}));
            //GameRegistry.addShapelessRecipe(new ItemStack(andesite_bricks_wall).getItem().getRegistryName(), null, new ItemStack(andesite_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.andesite_bricks}));
            //GameRegistry.addShapelessRecipe(new ItemStack(basalt_bricks_wall).getItem().getRegistryName(), null, new ItemStack(basalt_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.basalt_bricks}));
            //GameRegistry.addShapelessRecipe(new ItemStack(sandy_stone_bricks_wall).getItem().getRegistryName(), null, new ItemStack(sandy_stone_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.sandy_stone_bricks}));


            if (Config.craft_vanilla_blocks_with_patterns) {
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OAK_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.OAK_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 0)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SPRUCE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.SPRUCE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 1)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BIRCH_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.BIRCH_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 2)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.JUNGLE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.JUNGLE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 3)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ACACIA_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.ACACIA_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 4)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DARK_OAK_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.DARK_OAK_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 5)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_BRICK_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.NETHER_BRICK_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.NETHER_BRICK)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PURPUR_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.PURPUR_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PURPUR_BLOCK)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.QUARTZ_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.QUARTZ_BLOCK)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SANDSTONE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.RED_SANDSTONE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.RED_SANDSTONE)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SANDSTONE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.SANDSTONE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.SANDSTONE)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_BRICK_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.STONE_BRICK_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONEBRICK)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.STONE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.COBBLESTONE)}));
            }

            GameRegistry.addShapelessRecipe(new ItemStack(coal_stairs).getItem().getRegistryName(), null, new ItemStack(coal_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.COAL_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(iron_stairs).getItem().getRegistryName(), null, new ItemStack(iron_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.IRON_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(gold_stairs).getItem().getRegistryName(), null, new ItemStack(gold_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.GOLD_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(lapis_stairs).getItem().getRegistryName(), null, new ItemStack(lapis_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LAPIS_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(redstone_stairs).getItem().getRegistryName(), null, new ItemStack(redstone_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.REDSTONE_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(diamond_stairs).getItem().getRegistryName(), null, new ItemStack(diamond_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.DIAMOND_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(tin_stairs).getItem().getRegistryName(), null, new ItemStack(tin_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.tin_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(copper_stairs).getItem().getRegistryName(), null, new ItemStack(copper_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.copper_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(bronze_stairs).getItem().getRegistryName(), null, new ItemStack(bronze_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.bronze_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(jade_stairs).getItem().getRegistryName(), null, new ItemStack(jade_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.jade_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(amethyst_stairs).getItem().getRegistryName(), null, new ItemStack(amethyst_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.amethyst_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(stone_stairs).getItem().getRegistryName(), null, new ItemStack(stone_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 0)}));
            GameRegistry.addShapelessRecipe(new ItemStack(granite_stairs).getItem().getRegistryName(), null, new ItemStack(granite_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(andesite_stairs).getItem().getRegistryName(), null, new ItemStack(andesite_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 5)}));
            GameRegistry.addShapelessRecipe(new ItemStack(diorite_stairs).getItem().getRegistryName(), null, new ItemStack(diorite_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 3)}));
            GameRegistry.addShapelessRecipe(new ItemStack(basalt_stairs).getItem().getRegistryName(), null, new ItemStack(basalt_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.basalt)}));
            GameRegistry.addShapelessRecipe(new ItemStack(granite_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(granite_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.granite_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(andesite_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(andesite_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.andesite_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(diorite_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(diorite_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.diorite_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(basalt_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(basalt_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.basalt_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(sandy_stone_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(sandy_stone_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.sandy_stone_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(oak_log_stairs).getItem().getRegistryName(), null, new ItemStack(oak_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 0)}));
            GameRegistry.addShapelessRecipe(new ItemStack(birch_log_stairs).getItem().getRegistryName(), null, new ItemStack(birch_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 2)}));
            GameRegistry.addShapelessRecipe(new ItemStack(spruce_log_stairs).getItem().getRegistryName(), null, new ItemStack(spruce_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(jungle_log_stairs).getItem().getRegistryName(), null, new ItemStack(jungle_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 4)}));
            GameRegistry.addShapelessRecipe(new ItemStack(acacia_log_stairs).getItem().getRegistryName(), null, new ItemStack(acacia_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG2, 1, 0)}));
            GameRegistry.addShapelessRecipe(new ItemStack(dark_oak_log_stairs).getItem().getRegistryName(), null, new ItemStack(dark_oak_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.LOG2, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_oak_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_oak_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_oak_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_birch_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_birch_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_birch_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_spruce_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_spruce_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_spruce_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_jungle_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_jungle_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_jungle_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_acacia_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_acacia_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_acacia_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_dark_oak_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_dark_oak_log_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_dark_oak_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_smooth_sandstone_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_smooth_sandstone_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_smooth_sandstone)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_smooth_red_sandstone_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_smooth_red_sandstone_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.seamless_smooth_red_sandstone)}));
            GameRegistry.addShapelessRecipe(new ItemStack(prismarine_stairs).getItem().getRegistryName(), null, new ItemStack(prismarine_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PRISMARINE, 1, 0)}));
            GameRegistry.addShapelessRecipe(new ItemStack(prismarine_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(prismarine_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PRISMARINE, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(dark_prismarine_stairs).getItem().getRegistryName(), null, new ItemStack(dark_prismarine_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.PRISMARINE, 1, 2)}));
            GameRegistry.addShapelessRecipe(new ItemStack(obsidian_stairs).getItem().getRegistryName(), null, new ItemStack(obsidian_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.OBSIDIAN)}));
            GameRegistry.addShapelessRecipe(new ItemStack(end_stone_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(end_stone_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.END_BRICKS)}));
            GameRegistry.addShapelessRecipe(new ItemStack(bone_stairs).getItem().getRegistryName(), null, new ItemStack(bone_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.BONE_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(red_nether_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(red_nether_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(Blocks.RED_NETHER_BRICK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(dark_nether_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(dark_nether_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_stairs, new ItemStack(ModElements.dark_nether_bricks)}));
        }

    }
}
