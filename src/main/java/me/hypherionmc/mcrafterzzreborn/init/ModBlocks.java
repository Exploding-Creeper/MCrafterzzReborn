/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.init;

import me.hypherionmc.mcrafterzzreborn.blocks.*;
import me.hypherionmc.mcrafterzzreborn.config.Config;
import me.hypherionmc.mcrafterzzreborn.temp.RecipeGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static List<Block> BLOCKS = new ArrayList<>();

    //Blocks
    public static DamageSource death_block = (new DamageSource("deathBlock")).setDamageBypassesArmor().setDamageIsAbsolute();

    /**
     * Simple Blocks
     */
    public static Block amethyst_ore = new SimpleBlock("amethyst_ore", Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.STONE).setCreativeTab(ModTabs.creativeTabWorld).setHardness(5.5F).setResistance(30.0F);
    public static Block jade_ore = new SimpleBlock("jade_ore", Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.STONE).setCreativeTab(ModTabs.creativeTabWorld).setHardness(5.5F).setResistance(30.0F);
    public static Block copper_ore = new SimpleBlock("copper_ore", Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.STONE).setCreativeTab(ModTabs.creativeTabWorld).setHardness(4.5F).setResistance(25.0F);
    public static Block tin_ore = new SimpleBlock("tin_ore", Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.STONE).setCreativeTab(ModTabs.creativeTabWorld).setHardness(4.5F).setResistance(25.0F);
    public static Block amethyst_block = new SimpleBlock("amethyst_block", Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.PURPLE).setCreativeTab(ModTabs.creativeTabBuilding).setHardness(6.0F).setResistance(35.0F);
    public static Block jade_block = new SimpleBlock("jade_block", Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.EMERALD).setCreativeTab(ModTabs.creativeTabBuilding).setHardness(6.0F).setResistance(35.0F);
    public static Block copper_block = new SimpleBlock("copper_block", Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.RED).setCreativeTab(ModTabs.creativeTabBuilding).setHardness(5.0F).setResistance(30.0F);
    public static Block tin_block = new SimpleBlock("tin_block", Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.IRON).setCreativeTab(ModTabs.creativeTabBuilding).setHardness(5.0F).setResistance(30.0F);
    public static Block bronze_block = new SimpleBlock("bronze_block", Material.ROCK, SoundType.METAL, "pickaxe", 2, MapColor.RED).setCreativeTab(ModTabs.creativeTabBuilding).setHardness(5.0F).setResistance(30.0F);
    public static Block copper_door = new SimpleBlock("copper_door", Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.RED).setHardness(5.0F).setResistance(30.0F);
    public static Block tin_door = new SimpleBlock("tin_door", Material.ROCK, SoundType.METAL, "pickaxe", 1, MapColor.IRON).setHardness(5.0F).setResistance(30.0F);
    public static Block bronze_door = new SimpleBlock("bronze_door", Material.ROCK, SoundType.METAL, "pickaxe", 2, MapColor.RED).setHardness(5.0F).setResistance(30.0F);
    public static Block amethyst_door = new SimpleBlock("amethyst_door", Material.ROCK, SoundType.METAL, "pickaxe", 3, MapColor.PURPLE).setHardness(6.0F).setResistance(35.0F);
    public static Block glowing_barrier = new SimpleBlock("glowing_barrier", Material.BARRIER, SoundType.GLASS, "pickaxe", 0, true, 1.0F, true).setResistance(1.8E7F);
    public static Block glowing_air = (new GlowingAir("glowing_air", Material.BARRIER)).setResistance(1.8E7F).setCreativeTab(ModTabs.creativeTabMapMaking);
    public static Block block_of_death = (new DeathBlock("block_of_death", Material.ROCK)).setCreativeTab(ModTabs.creativeTabMapMaking).setResistance(10.0F).setHardness(5.0F);
    public static Block null_block = (new Block(Material.BARRIER)).setBlockUnbreakable().setTranslationKey("null_block").setResistance(1000000.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block scaffolding_block = (new SimpleBlock("scaffolding_block", Material.GROUND, SoundType.WOOD, true, MapColor.WOOD)).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_changing_wool = new ColorBlock("colour_changing_wool", Material.CLOTH, SoundType.CLOTH, (String)null, 0, MapColor.CLOTH).setHardness(0.8F).setResistance(4.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_changing_clay = new ColorBlock("colour_changing_clay", Material.CLAY, SoundType.STONE, "pickaxe", 0, MapColor.CLAY).setHardness(1.25F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_changing_glass = (new ColorChangingClass("colour_changing_glass", Material.GLASS, SoundType.GLASS, MapColor.AIR)).setHardness(0.3F).setResistance(1.5F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block basalt = new SimpleBlock("basalt", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block basalt_bricks = new SimpleBlock("basalt_bricks", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block polished_basalt = new SimpleBlock("polished_basalt", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block polished_stone = new SimpleBlock("polished_stone", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.STONE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block granite_bricks = new SimpleBlock("granite_bricks", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block andesite_bricks = new SimpleBlock("andesite_bricks", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.STONE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block diorite_bricks = new SimpleBlock("diorite_bricks", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block sandy_bricks = new SimpleBlock("sandy_bricks", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.SAND).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block sandy_stone_bricks = new SimpleBlock("sandy_stone_bricks", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.SAND).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block dark_nether_bricks = new SimpleBlock("dark_nether_bricks", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);


    /**
     * Pressure Plates
     */
    public static Block diamond_pressure_plate = new PressurePlate("diamond_pressure_plate", Material.ROCK, SoundType.METAL, "pickaxe", 2).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block copper_pressure_plate = new PressurePlate("copper_pressure_plate", Material.ROCK, SoundType.METAL, "pickaxe", 1).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block tin_pressure_plate = new PressurePlate("tin_pressure_plate", Material.ROCK, SoundType.METAL, "pickaxe", 1).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block bronze_pressure_plate = new PressurePlate("bronze_pressure_plate", Material.ROCK, SoundType.METAL, "pickaxe", 2).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block jade_pressure_plate = new PressurePlate("jade_pressure_plate", Material.ROCK, SoundType.METAL, "pickaxe", 3).setHardness(6.0F).setResistance(35.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block amethyst_pressure_plate = new PressurePlate("amethyst_pressure_plate", Material.ROCK, SoundType.METAL, "pickaxe", 3).setHardness(6.0F).setResistance(35.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block emerald_pressure_plate = new PressurePlate("emerald_pressure_plate", Material.ROCK, SoundType.METAL, "pickaxe", 2).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block quartz_pressure_plate = new PressurePlate("quartz_pressure_plate", Material.ROCK, SoundType.METAL, "pickaxe", 0).setHardness(0.8F).setResistance(4.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block invisible_pressure_plate = (new PressurePlate("invisible_pressure_plate", Material.BARRIER, true, true)).setCreativeTab(ModTabs.creativeTabMapMaking).setResistance(1.8E7F);

    /**
     * Bars
     */
    public static Block stone_bars = new Bars("stone_bars", Material.ROCK, SoundType.STONE, "pickaxe", 0, true).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block gold_bars = new Bars("gold_bars", Material.ROCK, SoundType.METAL, "pickaxe", 1, true).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block diamond_bars = new Bars("diamond_bars", Material.ROCK, SoundType.METAL, "pickaxe", 2, true).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block copper_bars = new Bars("copper_bars", Material.ROCK, SoundType.METAL, "pickaxe", 1, true).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block tin_bars = new Bars("tin_bars", Material.ROCK, SoundType.METAL, "pickaxe", 1, true).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block bronze_bars = new Bars("bronze_bars", Material.ROCK, SoundType.METAL, "pickaxe", 2, true).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block jade_bars = new Bars("jade_bars", Material.ROCK, SoundType.METAL, "pickaxe", 3, true).setHardness(6.0F).setResistance(35.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block amethyst_bars = new Bars("amethyst_bars", Material.ROCK, SoundType.METAL, "pickaxe", 3, true).setHardness(6.0F).setResistance(35.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block emerald_bars = new Bars("emerald_bars", Material.ROCK, SoundType.METAL, "pickaxe", 2, true).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block quartz_bars = new Bars("quartz_bars", Material.ROCK, SoundType.METAL, "pickaxe", 0, true).setHardness(0.8F).setResistance(4.0F).setCreativeTab(ModTabs.creativeTabBuilding);

    /**
     * Trap Doors
     */
    public static Block stone_trapdoor = new ModTrapDoor("stone_trapdoor", Material.ROCK, SoundType.STONE, "pickaxe", 0).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block gold_trapdoor = new ModTrapDoor("gold_trapdoor", Material.ROCK, SoundType.METAL, "pickaxe", 1).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block diamond_trapdoor = new ModTrapDoor("diamond_trapdoor", Material.ROCK, SoundType.METAL, "pickaxe", 2).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block copper_trapdoor = new ModTrapDoor("copper_trapdoor", Material.ROCK, SoundType.METAL, "pickaxe", 1).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block tin_trapdoor = new ModTrapDoor("tin_trapdoor", Material.ROCK, SoundType.METAL, "pickaxe", 1).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block bronze_trapdoor = new ModTrapDoor("bronze_trapdoor", Material.ROCK, SoundType.METAL, "pickaxe", 2).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block jade_trapdoor = new ModTrapDoor("jade_trapdoor", Material.ROCK, SoundType.METAL, "pickaxe", 3).setHardness(6.0F).setResistance(35.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block amethyst_trapdoor = new ModTrapDoor("amethyst_trapdoor", Material.ROCK, SoundType.METAL, "pickaxe", 3).setHardness(6.0F).setResistance(35.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block emerald_trapdoor = new ModTrapDoor("emerald_trapdoor", Material.ROCK, SoundType.METAL, "pickaxe", 2).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block quartz_trapdoor = new ModTrapDoor("quartz_trapdoor", Material.ROCK, SoundType.METAL, "pickaxe", 0).setHardness(0.8F).setResistance(4.0F).setCreativeTab(ModTabs.creativeTabBuilding);

    /**
     * Buttons
     */
    public static Block iron_button = new Button("iron_button", false, SoundType.METAL, "pickaxe", 1).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block gold_button = new Button("gold_button", false, SoundType.METAL, "pickaxe", 1).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block diamond_button = new Button("diamond_button", false, SoundType.METAL, "pickaxe", 2).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block copper_button = new Button("copper_button", false, SoundType.METAL, "pickaxe", 1).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block tin_button = new Button("tin_button", false, SoundType.METAL, "pickaxe", 1).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block bronze_button = new Button("bronze_button", false, SoundType.METAL, "pickaxe", 2).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block jade_button = new Button("jade_button", false, SoundType.METAL, "pickaxe", 3).setHardness(6.0F).setResistance(35.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block amethyst_button = new Button("amethyst_button", false, SoundType.METAL, "pickaxe", 3).setHardness(6.0F).setResistance(35.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block emerald_button = new Button("emerald_button", false, SoundType.METAL, "pickaxe", 2).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block quartz_button = new Button("quartz_button", false, SoundType.METAL, "pickaxe", 0).setHardness(0.8F).setResistance(4.0F).setCreativeTab(ModTabs.creativeTabBuilding);

    /**
     * Color Blocks
     */
    public static Block colour_block_white = new ColorBlock("colour_block_white", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.IRON).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_light_gray = new ColorBlock("colour_block_light_gray", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GRAY).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_gray = new ColorBlock("colour_block_gray", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GRAY).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_black = new ColorBlock("colour_block_black", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLACK).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_light_blue = new ColorBlock("colour_block_light_blue", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.LIGHT_BLUE).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_cyan = new ColorBlock("colour_block_cyan", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.CYAN).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_blue = new ColorBlock("colour_block_blue", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLUE).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_light_green = new ColorBlock("colour_block_light_green", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GREEN).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_green = new ColorBlock("colour_block_green", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GREEN).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_yellow = new ColorBlock("colour_block_yellow", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.YELLOW).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_orange = new ColorBlock("colour_block_orange", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.RED).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_brown = new ColorBlock("colour_block_brown", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BROWN).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_magenta = new ColorBlock("colour_block_magenta", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.MAGENTA).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_purple = new ColorBlock("colour_block_purple", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.PURPLE).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_red = new ColorBlock("colour_block_red", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.RED).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_block_pink = new ColorBlock("colour_block_pink", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.PINK).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_changing_block = new ColorBlock("colour_changing_block", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLACK).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block seamless_stone_slab = new SimpleBlock("seamless_stone_slab", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.STONE).setCreativeTab(ModTabs.creativeTabBuilding).setResistance(30.0F).setHardness(2.0F);
    public static Block seamless_oak_log = new SimpleBlock("seamless_oak_log", Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD).setCreativeTab(ModTabs.creativeTabBuilding).setResistance(10.0F).setHardness(2.0F);
    public static Block seamless_birch_log = new SimpleBlock("seamless_birch_log", Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD).setCreativeTab(ModTabs.creativeTabBuilding).setResistance(10.0F).setHardness(2.0F);
    public static Block seamless_spruce_log = new SimpleBlock("seamless_spruce_log", Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD).setCreativeTab(ModTabs.creativeTabBuilding).setResistance(10.0F).setHardness(2.0F);
    public static Block seamless_jungle_log = new SimpleBlock("seamless_jungle_log", Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD).setCreativeTab(ModTabs.creativeTabBuilding).setResistance(10.0F).setHardness(2.0F);
    public static Block seamless_acacia_log = new SimpleBlock("seamless_acacia_log", Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD).setCreativeTab(ModTabs.creativeTabBuilding).setResistance(10.0F).setHardness(2.0F);
    public static Block seamless_dark_oak_log = new SimpleBlock("seamless_dark_oak_log", Material.WOOD, SoundType.WOOD, "axe", 0, MapColor.WOOD).setCreativeTab(ModTabs.creativeTabBuilding).setResistance(10.0F).setHardness(2.0F);
    public static Block seamless_smooth_sandstone = new SimpleBlock("seamless_smooth_sandstone", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.SAND).setCreativeTab(ModTabs.creativeTabBuilding).setResistance(4.0F).setHardness(0.8F);
    public static Block seamless_smooth_red_sandstone = new SimpleBlock("seamless_smooth_red_sandstone", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setCreativeTab(ModTabs.creativeTabBuilding).setResistance(4.0F).setHardness(0.8F);

    // Fixed Colors
    public static Block coloured_stone_bricks_white = new ColorBlock("coloured_stone_bricks_white", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_light_gray = new ColorBlock("coloured_stone_bricks_light_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_gray = new ColorBlock("coloured_stone_bricks_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_black = new ColorBlock("coloured_stone_bricks_black", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_light_blue = new ColorBlock("coloured_stone_bricks_light_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.LIGHT_BLUE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_cyan = new ColorBlock("coloured_stone_bricks_cyan", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.CYAN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_blue = new ColorBlock("coloured_stone_bricks_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLUE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_light_green = new ColorBlock("coloured_stone_bricks_light_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_green = new ColorBlock("coloured_stone_bricks_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_yellow = new ColorBlock("coloured_stone_bricks_yellow", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.YELLOW).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_orange = new ColorBlock("coloured_stone_bricks_orange", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_brown = new ColorBlock("coloured_stone_bricks_brown", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BROWN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_magenta = new ColorBlock("coloured_stone_bricks_magenta", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.MAGENTA).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_purple = new ColorBlock("coloured_stone_bricks_purple", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PURPLE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_red = new ColorBlock("coloured_stone_bricks_red", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_bricks_pink = new ColorBlock("coloured_stone_bricks_pink", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PINK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_changing_stone_bricks = new ColorBlock("colour_changing_stone_bricks", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_white = new ColorBlock("coloured_stone_white", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_light_gray = new ColorBlock("coloured_stone_light_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_gray = new ColorBlock("coloured_stone_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_black = new ColorBlock("coloured_stone_black", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_light_blue = new ColorBlock("coloured_stone_light_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.LIGHT_BLUE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_cyan = new ColorBlock("coloured_stone_cyan", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.CYAN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_blue = new ColorBlock("coloured_stone_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLUE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_light_green = new ColorBlock("coloured_stone_light_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_green = new ColorBlock("coloured_stone_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_yellow = new ColorBlock("coloured_stone_yellow", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.YELLOW).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_orange = new ColorBlock("coloured_stone_orange", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_brown = new ColorBlock("coloured_stone_brown", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BROWN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_magenta = new ColorBlock("coloured_stone_magenta", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.MAGENTA).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_purple = new ColorBlock("coloured_stone_purple", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PURPLE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_red = new ColorBlock("coloured_stone_red", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_stone_pink = new ColorBlock("coloured_stone_pink", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PINK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_changing_stone = new ColorBlock("colour_changing_stone", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_white = new ColorBlock("coloured_cobblestone_white", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_light_gray = new ColorBlock("coloured_cobblestone_light_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_gray = new ColorBlock("coloured_cobblestone_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_black = new ColorBlock("coloured_cobblestone_black", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_light_blue = new ColorBlock("coloured_cobblestone_light_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.LIGHT_BLUE).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_cyan = new ColorBlock("coloured_cobblestone_cyan", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.CYAN).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_blue = new ColorBlock("coloured_cobblestone_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLUE).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_light_green = new ColorBlock("coloured_cobblestone_light_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_green = new ColorBlock("coloured_cobblestone_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_yellow = new ColorBlock("coloured_cobblestone_yellow", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.YELLOW).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_orange = new ColorBlock("coloured_cobblestone_orange", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_brown = new ColorBlock("coloured_cobblestone_brown", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BROWN).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_magenta = new ColorBlock("coloured_cobblestone_magenta", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.MAGENTA).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_purple = new ColorBlock("coloured_cobblestone_purple", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PURPLE).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_red = new ColorBlock("coloured_cobblestone_red", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block coloured_cobblestone_pink = new ColorBlock("coloured_cobblestone_pink", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PINK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block colour_changing_cobblestone = new ColorBlock("colour_changing_cobblestone", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);

    /**
     * Glowing Color Blocks
     */
    public static Block glowing_colour_block_white = new GlowingColorBlock("glowing_colour_block_white", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.IRON).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_light_gray = new GlowingColorBlock("glowing_colour_block_light_gray", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GRAY).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_gray = new GlowingColorBlock("glowing_colour_block_gray", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GRAY).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_black = new GlowingColorBlock("glowing_colour_block_black", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLACK).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_light_blue = new GlowingColorBlock("glowing_colour_block_light_blue", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.LIGHT_BLUE).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_cyan = new GlowingColorBlock("glowing_colour_block_cyan", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.CYAN).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_blue = new GlowingColorBlock("glowing_colour_block_blue", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLUE).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_light_green = new GlowingColorBlock("glowing_colour_block_light_green", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GREEN).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_green = new GlowingColorBlock("glowing_colour_block_green", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.GREEN).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_yellow = new GlowingColorBlock("glowing_colour_block_yellow", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.YELLOW).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_orange = new GlowingColorBlock("glowing_colour_block_orange", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.RED).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_brown = new GlowingColorBlock("glowing_colour_block_brown", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BROWN).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_magenta = new GlowingColorBlock("glowing_colour_block_magenta", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.MAGENTA).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_purple = new GlowingColorBlock("glowing_colour_block_purple", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.PURPLE).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_red = new GlowingColorBlock("glowing_colour_block_red", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.RED).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_block_pink = new GlowingColorBlock("glowing_colour_block_pink", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.PINK).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_changing_block = new GlowingColorBlock("glowing_colour_changing_block", Material.ROCK, SoundType.STONE, "pickaxe", 2, MapColor.BLACK).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);

    // Multi Color
    public static Block glowing_coloured_stone_bricks_white = new GlowingColorBlock("glowing_coloured_stone_bricks_white", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_light_gray = new GlowingColorBlock("glowing_coloured_stone_bricks_light_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_gray = new GlowingColorBlock("glowing_coloured_stone_bricks_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_black = new GlowingColorBlock("glowing_coloured_stone_bricks_black", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_light_blue = new GlowingColorBlock("glowing_coloured_stone_bricks_light_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.LIGHT_BLUE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_cyan = new GlowingColorBlock("glowing_coloured_stone_bricks_cyan", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.CYAN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_blue = new GlowingColorBlock("glowing_coloured_stone_bricks_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLUE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_light_green = new GlowingColorBlock("glowing_coloured_stone_bricks_light_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_green = new GlowingColorBlock("glowing_coloured_stone_bricks_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_yellow = new GlowingColorBlock("glowing_coloured_stone_bricks_yellow", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.YELLOW).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_orange = new GlowingColorBlock("glowing_coloured_stone_bricks_orange", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_brown = new GlowingColorBlock("glowing_coloured_stone_bricks_brown", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BROWN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_magenta = new GlowingColorBlock("glowing_coloured_stone_bricks_magenta", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.MAGENTA).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_purple = new GlowingColorBlock("glowing_coloured_stone_bricks_purple", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PURPLE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_red = new GlowingColorBlock("glowing_coloured_stone_bricks_red", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_bricks_pink = new GlowingColorBlock("glowing_coloured_stone_bricks_pink", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PINK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_changing_stone_bricks = new GlowingColorBlock("glowing_colour_changing_stone_bricks", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_white = new GlowingColorBlock("glowing_coloured_stone_white", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_light_gray = new GlowingColorBlock("glowing_coloured_stone_light_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_gray = new GlowingColorBlock("glowing_coloured_stone_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_black = new GlowingColorBlock("glowing_coloured_stone_black", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_light_blue = new GlowingColorBlock("glowing_coloured_stone_light_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.LIGHT_BLUE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_cyan = new GlowingColorBlock("glowing_coloured_stone_cyan", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.CYAN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_blue = new GlowingColorBlock("glowing_coloured_stone_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLUE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_light_green = new GlowingColorBlock("glowing_coloured_stone_light_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_green = new GlowingColorBlock("glowing_coloured_stone_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_yellow = new GlowingColorBlock("glowing_coloured_stone_yellow", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.YELLOW).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_orange = new GlowingColorBlock("glowing_coloured_stone_orange", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_brown = new GlowingColorBlock("glowing_coloured_stone_brown", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BROWN).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_magenta = new GlowingColorBlock("glowing_coloured_stone_magenta", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.MAGENTA).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_purple = new GlowingColorBlock("glowing_coloured_stone_purple", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PURPLE).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_red = new GlowingColorBlock("glowing_coloured_stone_red", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_stone_pink = new GlowingColorBlock("glowing_coloured_stone_pink", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PINK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_changing_stone = new GlowingColorBlock("glowing_colour_changing_stone", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(1.5F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);

    public static Block glowing_coloured_cobblestone_white = new GlowingColorBlock("glowing_coloured_cobblestone_white", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.IRON).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_light_gray = new GlowingColorBlock("glowing_coloured_cobblestone_light_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_gray = new GlowingColorBlock("glowing_coloured_cobblestone_gray", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GRAY).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_black = new GlowingColorBlock("glowing_coloured_cobblestone_black", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_light_blue = new GlowingColorBlock("glowing_coloured_cobblestone_light_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.LIGHT_BLUE).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_cyan = new GlowingColorBlock("glowing_coloured_cobblestone_cyan", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.CYAN).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_blue = new GlowingColorBlock("glowing_coloured_cobblestone_blue", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLUE).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_light_green = new GlowingColorBlock("glowing_coloured_cobblestone_light_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_green = new GlowingColorBlock("glowing_coloured_cobblestone_green", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.GREEN).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_yellow = new GlowingColorBlock("glowing_coloured_cobblestone_yellow", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.YELLOW).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_orange = new GlowingColorBlock("glowing_coloured_cobblestone_orange", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_brown = new GlowingColorBlock("glowing_coloured_cobblestone_brown", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BROWN).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_magenta = new GlowingColorBlock("glowing_coloured_cobblestone_magenta", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.MAGENTA).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_purple = new GlowingColorBlock("glowing_coloured_cobblestone_purple", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PURPLE).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_red = new GlowingColorBlock("glowing_coloured_cobblestone_red", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_coloured_cobblestone_pink = new GlowingColorBlock("glowing_coloured_cobblestone_pink", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.PINK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);
    public static Block glowing_colour_changing_cobblestone = new GlowingColorBlock("glowing_colour_changing_cobblestone", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabBuilding);

    /**
     * Flowers
     */
    public static BlockBush yellow_tulip = (BlockBush)(new Flower("yellow_tulip")).setCreativeTab(ModTabs.creativeTabWorld);
    public static BlockBush blue_tulip = (BlockBush) (new Flower("blue_tulip")).setCreativeTab(ModTabs.creativeTabWorld);
    public static BlockBush black_tulip = (BlockBush) (new Flower("black_tulip")).setCreativeTab(ModTabs.creativeTabWorld);
    public static BlockBush green_tulip = (BlockBush) (new Flower("green_tulip")).setCreativeTab(ModTabs.creativeTabWorld);
    public static BlockBush purple_tulip = (BlockBush) (new Flower("purple_tulip")).setCreativeTab(ModTabs.creativeTabWorld);

    /**
     * Fences & Gates
     */
    public static Block dark_nether_bricks_fence = new Fence("dark_nether_bricks_fence", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block red_nether_bricks_fence = new Fence("red_nether_bricks_fence", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.NETHERRACK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block nether_bricks_fence_gate = new FenceGate("nether_bricks_fence_gate", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.RED).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block dark_nether_bricks_fence_gate = new FenceGate("dark_nether_bricks_fence_gate", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block red_nether_bricks_fence_gate = new FenceGate("red_nether_bricks_fence_gate", Material.ROCK, SoundType.STONE, "pickaxe", 0, MapColor.BLACK).setHardness(2.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);

    /**
     * Walls
     */
    public static Block iron_wall = new ModWall("iron_wall", Blocks.IRON_BLOCK, 5.0F, 30.0F, MapColor.IRON).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block gold_wall = new ModWall("gold_wall", Blocks.GOLD_BLOCK, 5.0F, 30.0F, MapColor.GOLD).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block diamond_wall = new ModWall("diamond_wall", Blocks.DIAMOND_BLOCK, 5.0F, 30.0F, MapColor.DIAMOND).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block emerald_wall = new ModWall("emerald_wall", Blocks.EMERALD_BLOCK, 5.0F, 30.0F, MapColor.EMERALD).setHardness(5.0F).setResistance(30.0F).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block quartz_wall = new ModWall("quartz_wall", Blocks.QUARTZ_BLOCK, 0.8F, 4.0F, MapColor.QUARTZ).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block copper_wall = new ModWall("copper_wall", ModBlocks.copper_block, 5.0F, 30.0F, MapColor.RED).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block tin_wall = new ModWall("tin_wall", ModBlocks.tin_block, 5.0F, 30.0F, MapColor.IRON).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block bronze_wall = new ModWall("bronze_wall", ModBlocks.bronze_block, 5.0F, 30.0F, MapColor.RED).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block jade_wall = new ModWall("jade_wall", ModBlocks.jade_block, 6.0F, 35.0F, MapColor.EMERALD).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block amethyst_wall = new ModWall("amethyst_wall", ModBlocks.amethyst_block, 6.0F, 35.0F, MapColor.PURPLE).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block stone_wall = new ModWall("stone_wall", Blocks.STONE, 1.5F, 30.0F, MapColor.STONE).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block granite_wall = new ModWall("granite_wall", Blocks.STONE, 1.5F, 30.0F, MapColor.RED).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block andesite_wall = new ModWall("andesite_wall", Blocks.STONE, 1.5F, 30.0F, MapColor.STONE).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block diorite_wall = new ModWall("diorite_wall", Blocks.STONE, 1.5F, 30.0F, MapColor.IRON).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block basalt_wall = new ModWall("basalt_wall", Blocks.STONE, 1.5F, 30.0F, MapColor.BLACK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block brick_wall = new ModWall("brick_wall", Blocks.BRICK_BLOCK, 2.0F, 30.0F, MapColor.RED).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block stonebrick_wall = new ModWall("stonebrick_wall", Blocks.STONEBRICK, 1.5F, 30.0F, MapColor.STONE).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block granite_bricks_wall = new ModWall("granite_bricks_wall", ModBlocks.granite_bricks, 1.5F, 30.0F, MapColor.RED).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block andesite_bricks_wall = new ModWall("andesite_bricks_wall", ModBlocks.andesite_bricks, 1.5F, 30.0F, MapColor.STONE).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block diorite_bricks_wall = new ModWall("diorite_bricks_wall", ModBlocks.diorite_bricks, 1.5F, 30.0F, MapColor.IRON).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block basalt_bricks_wall = new ModWall("basalt_bricks_wall", ModBlocks.basalt_bricks, 1.5F, 30.0F, MapColor.BLACK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block sandy_stone_bricks_wall = new ModWall("sandy_stone_bricks_wall", ModBlocks.basalt_bricks, 1.5F, 30.0F, MapColor.SAND).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);

    /**
     * Stairs
     */
    public static Block coal_stairs = new ModStairs("coal_stairs", Blocks.COAL_BLOCK.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block iron_stairs = new ModStairs("iron_stairs", Blocks.IRON_BLOCK.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block gold_stairs = new ModStairs("gold_stairs", Blocks.GOLD_BLOCK.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block lapis_stairs = new ModStairs("lapis_stairs", Blocks.LAPIS_BLOCK.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block redstone_stairs = new ModStairs("redstone_stairs", Blocks.REDSTONE_BLOCK.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block diamond_stairs = new ModStairs("diamond_stairs", Blocks.DIAMOND_BLOCK.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block emerald_stairs = new ModStairs("emerald_stairs", Blocks.EMERALD_BLOCK.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block tin_stairs = new ModStairs("tin_stairs", ModBlocks.tin_block.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block copper_stairs = new ModStairs("copper_stairs", ModBlocks.copper_block.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block bronze_stairs = new ModStairs("bronze_stairs", ModBlocks.bronze_block.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block jade_stairs = new ModStairs("jade_stairs", ModBlocks.jade_block.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block amethyst_stairs = new ModStairs("amethyst_stairs", ModBlocks.amethyst_block.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block stone_stairs = new ModStairs("stone_stairs", Blocks.STONE.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block granite_stairs = new ModStairs("granite_stairs", Blocks.STONE.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block andesite_stairs = new ModStairs("andesite_stairs", Blocks.STONE.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block diorite_stairs = new ModStairs("diorite_stairs", Blocks.STONE.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block basalt_stairs = new ModStairs("basalt_stairs", ModBlocks.basalt.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block granite_bricks_stairs = new ModStairs("granite_bricks_stairs", ModBlocks.granite_bricks.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block andesite_bricks_stairs = new ModStairs("andesite_bricks_stairs", ModBlocks.andesite_bricks.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block diorite_bricks_stairs = new ModStairs("diorite_bricks_stairs", ModBlocks.diorite_bricks.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block basalt_bricks_stairs = new ModStairs("basalt_bricks_stairs", ModBlocks.basalt_bricks.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block sandy_stone_bricks_stairs = new ModStairs("sandy_stone_bricks_stairs", ModBlocks.sandy_stone_bricks.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block oak_log_stairs = new ModStairs("oak_log_stairs", Blocks.LOG.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block birch_log_stairs = new ModStairs("birch_log_stairs", Blocks.LOG.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block spruce_log_stairs = new ModStairs("spruce_log_stairs", Blocks.LOG.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block jungle_log_stairs = new ModStairs("jungle_log_stairs", Blocks.LOG.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block acacia_log_stairs = new ModStairs("acacia_log_stairs", Blocks.LOG2.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block dark_oak_log_stairs = new ModStairs("dark_oak_log_stairs", Blocks.LOG2.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block seamless_oak_log_stairs = new ModStairs("seamless_oak_log_stairs", ModBlocks.seamless_oak_log.getDefaultState(), Material.WOOD).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block seamless_birch_log_stairs = new ModStairs("seamless_birch_log_stairs", ModBlocks.seamless_birch_log.getDefaultState(), Material.WOOD).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block seamless_spruce_log_stairs = new ModStairs("seamless_spruce_log_stairs", ModBlocks.seamless_spruce_log.getDefaultState(), Material.WOOD).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block seamless_jungle_log_stairs = new ModStairs("seamless_jungle_log_stairs", ModBlocks.seamless_jungle_log.getDefaultState(), Material.WOOD).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block seamless_acacia_log_stairs = new ModStairs("seamless_acacia_log_stairs", ModBlocks.seamless_acacia_log.getDefaultState(), Material.WOOD).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block seamless_dark_oak_log_stairs = new ModStairs("seamless_dark_oak_log_stairs", ModBlocks.seamless_dark_oak_log.getDefaultState(), Material.WOOD).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block seamless_smooth_sandstone_stairs = new ModStairs("seamless_smooth_sandstone_stairs", ModBlocks.seamless_smooth_sandstone.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block seamless_smooth_red_sandstone_stairs = new ModStairs("seamless_smooth_red_sandstone_stairs", ModBlocks.seamless_smooth_red_sandstone.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block prismarine_stairs = new ModStairs("prismarine_stairs", Blocks.PRISMARINE.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block prismarine_bricks_stairs = new ModStairs("prismarine_bricks_stairs", Blocks.PRISMARINE.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block dark_prismarine_stairs = new ModStairs("dark_prismarine_stairs", Blocks.PRISMARINE.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block obsidian_stairs = new ModStairs("obsidian_stairs", Blocks.OBSIDIAN.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block end_stone_bricks_stairs = new ModStairs("end_stone_bricks_stairs", Blocks.END_BRICKS.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block bone_stairs = new ModStairs("bone_stairs", Blocks.BONE_BLOCK.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block red_nether_bricks_stairs = new ModStairs("red_nether_bricks_stairs", Blocks.RED_NETHER_BRICK.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);
    public static Block dark_nether_bricks_stairs = new ModStairs("dark_nether_bricks_stairs", ModBlocks.dark_nether_bricks.getDefaultState(), Material.ROCK).setCreativeTab(ModTabs.creativeTabSmallerBuildingBlocks);

}