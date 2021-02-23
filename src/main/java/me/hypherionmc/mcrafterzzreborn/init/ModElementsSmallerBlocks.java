/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.init;

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
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModElementsSmallerBlocks {


    public static void crafting() {
        if (Config.crafting) {
            /*GameRegistry.addShapelessRecipe(new ItemStack(dark_nether_bricks_fence).getItem().getRegistryName(), null, new ItemStack(dark_nether_bricks_fence), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_fence, ModBlocks.dark_nether_bricks}));
            GameRegistry.addShapelessRecipe(new ItemStack(red_nether_bricks_fence).getItem().getRegistryName(), null, new ItemStack(red_nether_bricks_fence), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_fence, Blocks.RED_NETHER_BRICK}));
            GameRegistry.addShapelessRecipe(new ItemStack(nether_bricks_fence_gate).getItem().getRegistryName(), null, new ItemStack(nether_bricks_fence_gate), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_fence_gate, Blocks.NETHER_BRICK}));
            GameRegistry.addShapelessRecipe(new ItemStack(dark_nether_bricks_fence_gate).getItem().getRegistryName(), null, new ItemStack(dark_nether_bricks_fence_gate), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_fence_gate, ModBlocks.dark_nether_bricks}));
            GameRegistry.addShapelessRecipe(new ItemStack(red_nether_bricks_fence_gate).getItem().getRegistryName(), null, new ItemStack(red_nether_bricks_fence_gate), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_fence_gate, Blocks.RED_NETHER_BRICK}));

            if (Config.craft_vanilla_blocks_with_patterns) {
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE_WALL).getItem().getRegistryName(), null, new ItemStack(Blocks.COBBLESTONE_WALL), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Blocks.COBBLESTONE}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE_WALL, 1, 1).getItem().getRegistryName(), null, new ItemStack(Blocks.COBBLESTONE_WALL, 1, 1), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Blocks.MOSSY_COBBLESTONE}));
            }

            GameRegistry.addShapelessRecipe(new ItemStack(iron_wall).getItem().getRegistryName(), null, new ItemStack(iron_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Items.IRON_INGOT}));
            GameRegistry.addShapelessRecipe(new ItemStack(gold_wall).getItem().getRegistryName(), null, new ItemStack(gold_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Items.GOLD_INGOT}));
            GameRegistry.addShapelessRecipe(new ItemStack(diamond_wall).getItem().getRegistryName(), null, new ItemStack(diamond_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Items.DIAMOND}));
            GameRegistry.addShapelessRecipe(new ItemStack(emerald_wall).getItem().getRegistryName(), null, new ItemStack(emerald_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Items.EMERALD}));
            GameRegistry.addShapelessRecipe(new ItemStack(quartz_wall).getItem().getRegistryName(), null, new ItemStack(quartz_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Items.QUARTZ}));
            GameRegistry.addShapelessRecipe(new ItemStack(copper_wall).getItem().getRegistryName(), null, new ItemStack(copper_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, ModBlocks.copper_ingot}));
            GameRegistry.addShapelessRecipe(new ItemStack(tin_wall).getItem().getRegistryName(), null, new ItemStack(tin_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, ModBlocks.tin_ingot}));
            GameRegistry.addShapelessRecipe(new ItemStack(bronze_wall).getItem().getRegistryName(), null, new ItemStack(bronze_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, ModBlocks.bronze_ingot}));
            GameRegistry.addShapelessRecipe(new ItemStack(jade_wall).getItem().getRegistryName(), null, new ItemStack(jade_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, ModBlocks.jade}));
            GameRegistry.addShapelessRecipe(new ItemStack(amethyst_wall).getItem().getRegistryName(), null, new ItemStack(amethyst_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, ModBlocks.amethyst}));
            GameRegistry.addShapelessRecipe(new ItemStack(stone_wall).getItem().getRegistryName(), null, new ItemStack(stone_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Blocks.STONE}));
            GameRegistry.addShapelessRecipe(new ItemStack(granite_wall).getItem().getRegistryName(), null, new ItemStack(granite_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, new ItemStack(Blocks.STONE, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(andesite_wall).getItem().getRegistryName(), null, new ItemStack(andesite_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, new ItemStack(Blocks.STONE, 1, 5)}));
            GameRegistry.addShapelessRecipe(new ItemStack(diorite_wall).getItem().getRegistryName(), null, new ItemStack(diorite_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, new ItemStack(Blocks.STONE, 1, 3)}));
            GameRegistry.addShapelessRecipe(new ItemStack(basalt_wall).getItem().getRegistryName(), null, new ItemStack(basalt_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, ModBlocks.basalt}));
            GameRegistry.addShapelessRecipe(new ItemStack(brick_wall).getItem().getRegistryName(), null, new ItemStack(brick_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Blocks.BRICK_BLOCK}));
            GameRegistry.addShapelessRecipe(new ItemStack(stonebrick_wall).getItem().getRegistryName(), null, new ItemStack(stonebrick_wall), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_wall, Blocks.STONEBRICK}));
            //GameRegistry.addShapelessRecipe(new ItemStack(granite_bricks_wall).getItem().getRegistryName(), null, new ItemStack(granite_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.granite_bricks}));
            //GameRegistry.addShapelessRecipe(new ItemStack(diorite_bricks_wall).getItem().getRegistryName(), null, new ItemStack(diorite_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.diorite_bricks}));
            //GameRegistry.addShapelessRecipe(new ItemStack(andesite_bricks_wall).getItem().getRegistryName(), null, new ItemStack(andesite_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.andesite_bricks}));
            //GameRegistry.addShapelessRecipe(new ItemStack(basalt_bricks_wall).getItem().getRegistryName(), null, new ItemStack(basalt_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.basalt_bricks}));
            //GameRegistry.addShapelessRecipe(new ItemStack(sandy_stone_bricks_wall).getItem().getRegistryName(), null, new ItemStack(sandy_stone_bricks_wall), ModUtil.objectToIngredient(new Object[]{ModElements.wooden_pattern_wall, ModElements.sandy_stone_bricks}));


            if (Config.craft_vanilla_blocks_with_patterns) {
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OAK_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.OAK_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 0)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SPRUCE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.SPRUCE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 1)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BIRCH_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.BIRCH_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 2)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.JUNGLE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.JUNGLE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 3)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ACACIA_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.ACACIA_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 4)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DARK_OAK_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.DARK_OAK_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PLANKS, 1, 5)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_BRICK_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.NETHER_BRICK_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.NETHER_BRICK)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PURPUR_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.PURPUR_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PURPUR_BLOCK)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.QUARTZ_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.QUARTZ_BLOCK)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.RED_SANDSTONE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.RED_SANDSTONE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.RED_SANDSTONE)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SANDSTONE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.SANDSTONE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.SANDSTONE)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_BRICK_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.STONE_BRICK_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.STONEBRICK)}));
                GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE_STAIRS).getItem().getRegistryName(), null, new ItemStack(Blocks.STONE_STAIRS), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.COBBLESTONE)}));
            }

            GameRegistry.addShapelessRecipe(new ItemStack(coal_stairs).getItem().getRegistryName(), null, new ItemStack(coal_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.COAL_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(iron_stairs).getItem().getRegistryName(), null, new ItemStack(iron_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.IRON_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(gold_stairs).getItem().getRegistryName(), null, new ItemStack(gold_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.GOLD_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(lapis_stairs).getItem().getRegistryName(), null, new ItemStack(lapis_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.LAPIS_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(redstone_stairs).getItem().getRegistryName(), null, new ItemStack(redstone_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.REDSTONE_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(diamond_stairs).getItem().getRegistryName(), null, new ItemStack(diamond_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.DIAMOND_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(tin_stairs).getItem().getRegistryName(), null, new ItemStack(tin_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.tin_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(copper_stairs).getItem().getRegistryName(), null, new ItemStack(copper_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.copper_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(bronze_stairs).getItem().getRegistryName(), null, new ItemStack(bronze_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.bronze_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(jade_stairs).getItem().getRegistryName(), null, new ItemStack(jade_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.jade_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(amethyst_stairs).getItem().getRegistryName(), null, new ItemStack(amethyst_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.amethyst_block)}));
            GameRegistry.addShapelessRecipe(new ItemStack(stone_stairs).getItem().getRegistryName(), null, new ItemStack(stone_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 0)}));
            GameRegistry.addShapelessRecipe(new ItemStack(granite_stairs).getItem().getRegistryName(), null, new ItemStack(granite_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(andesite_stairs).getItem().getRegistryName(), null, new ItemStack(andesite_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 5)}));
            GameRegistry.addShapelessRecipe(new ItemStack(diorite_stairs).getItem().getRegistryName(), null, new ItemStack(diorite_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.STONE, 1, 3)}));
            GameRegistry.addShapelessRecipe(new ItemStack(basalt_stairs).getItem().getRegistryName(), null, new ItemStack(basalt_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.basalt)}));
            GameRegistry.addShapelessRecipe(new ItemStack(granite_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(granite_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.granite_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(andesite_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(andesite_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.andesite_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(diorite_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(diorite_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.diorite_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(basalt_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(basalt_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.basalt_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(sandy_stone_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(sandy_stone_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.sandy_stone_bricks)}));
            GameRegistry.addShapelessRecipe(new ItemStack(oak_log_stairs).getItem().getRegistryName(), null, new ItemStack(oak_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 0)}));
            GameRegistry.addShapelessRecipe(new ItemStack(birch_log_stairs).getItem().getRegistryName(), null, new ItemStack(birch_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 2)}));
            GameRegistry.addShapelessRecipe(new ItemStack(spruce_log_stairs).getItem().getRegistryName(), null, new ItemStack(spruce_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(jungle_log_stairs).getItem().getRegistryName(), null, new ItemStack(jungle_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.LOG, 1, 4)}));
            GameRegistry.addShapelessRecipe(new ItemStack(acacia_log_stairs).getItem().getRegistryName(), null, new ItemStack(acacia_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.LOG2, 1, 0)}));
            GameRegistry.addShapelessRecipe(new ItemStack(dark_oak_log_stairs).getItem().getRegistryName(), null, new ItemStack(dark_oak_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.LOG2, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_oak_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_oak_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.seamless_oak_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_birch_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_birch_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.seamless_birch_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_spruce_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_spruce_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.seamless_spruce_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_jungle_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_jungle_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.seamless_jungle_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_acacia_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_acacia_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.seamless_acacia_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_dark_oak_log_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_dark_oak_log_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.seamless_dark_oak_log)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_smooth_sandstone_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_smooth_sandstone_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.seamless_smooth_sandstone)}));
            GameRegistry.addShapelessRecipe(new ItemStack(seamless_smooth_red_sandstone_stairs).getItem().getRegistryName(), null, new ItemStack(seamless_smooth_red_sandstone_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.seamless_smooth_red_sandstone)}));
            GameRegistry.addShapelessRecipe(new ItemStack(prismarine_stairs).getItem().getRegistryName(), null, new ItemStack(prismarine_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PRISMARINE, 1, 0)}));
            GameRegistry.addShapelessRecipe(new ItemStack(prismarine_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(prismarine_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PRISMARINE, 1, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(dark_prismarine_stairs).getItem().getRegistryName(), null, new ItemStack(dark_prismarine_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.PRISMARINE, 1, 2)}));
            GameRegistry.addShapelessRecipe(new ItemStack(obsidian_stairs).getItem().getRegistryName(), null, new ItemStack(obsidian_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.OBSIDIAN)}));
            GameRegistry.addShapelessRecipe(new ItemStack(end_stone_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(end_stone_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.END_BRICKS)}));
            GameRegistry.addShapelessRecipe(new ItemStack(bone_stairs).getItem().getRegistryName(), null, new ItemStack(bone_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.BONE_BLOCK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(red_nether_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(red_nether_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(Blocks.RED_NETHER_BRICK)}));
            GameRegistry.addShapelessRecipe(new ItemStack(dark_nether_bricks_stairs).getItem().getRegistryName(), null, new ItemStack(dark_nether_bricks_stairs), ModUtil.objectToIngredient(new Object[]{ModBlocks.wooden_pattern_stairs, new ItemStack(ModBlocks.dark_nether_bricks)}));*/
        }

    }
}
