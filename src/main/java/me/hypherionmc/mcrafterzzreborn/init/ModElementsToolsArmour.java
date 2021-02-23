/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.init;

import me.hypherionmc.mcrafterzzreborn.Registry;
import me.hypherionmc.mcrafterzzreborn.config.Config;
import me.hypherionmc.mcrafterzzreborn.items.*;
import me.hypherionmc.mcrafterzzreborn.util.ModUtil;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModElementsToolsArmour {



    public ModElementsToolsArmour() {
    }

    public static void crafting() {
        if (Config.crafting) {
            
            /*GameRegistry.addShapedRecipe(new ItemStack(copper_sword).getItem().getRegistryName(), null, new ItemStack(copper_sword), new Object[]{" C ", " C ", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_sword).getItem().getRegistryName(), null, new ItemStack(copper_sword), new Object[]{"C  ", "C  ", "S  ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_sword).getItem().getRegistryName(), null, new ItemStack(copper_sword), new Object[]{"  C", "  C", "  S", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_sword).getItem().getRegistryName(), null, new ItemStack(bronze_sword), new Object[]{" B ", " B ", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_sword).getItem().getRegistryName(), null, new ItemStack(bronze_sword), new Object[]{"B  ", "B  ", "S  ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_sword).getItem().getRegistryName(), null, new ItemStack(bronze_sword), new Object[]{"  B", "  B", "  S", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_sword).getItem().getRegistryName(), null, new ItemStack(jade_sword), new Object[]{" J ", " J ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_sword).getItem().getRegistryName(), null, new ItemStack(jade_sword), new Object[]{"J  ", "J  ", "S  ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_sword).getItem().getRegistryName(), null, new ItemStack(jade_sword), new Object[]{"  J", "  J", "  S", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_sword).getItem().getRegistryName(), null, new ItemStack(amethyst_sword), new Object[]{" A ", " A ", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_sword).getItem().getRegistryName(), null, new ItemStack(amethyst_sword), new Object[]{"A  ", "A  ", "S  ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_sword).getItem().getRegistryName(), null, new ItemStack(amethyst_sword), new Object[]{"  A", "  A", "  S", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapelessRecipe(new ItemStack(stone_bow, 1).getItem().getRegistryName(), null, new ItemStack(stone_bow, 1), ModUtil.objectToIngredient(new Object[]{Blocks.STONE, Items.BOW}));
            GameRegistry.addShapelessRecipe(new ItemStack(iron_bow, 1).getItem().getRegistryName(), null, new ItemStack(iron_bow, 1), ModUtil.objectToIngredient(new Object[]{Items.IRON_INGOT, Items.BOW}));
            GameRegistry.addShapelessRecipe(new ItemStack(gold_bow, 1).getItem().getRegistryName(), null, new ItemStack(gold_bow, 1), ModUtil.objectToIngredient(new Object[]{Items.GOLD_INGOT, Items.BOW}));
            GameRegistry.addShapelessRecipe(new ItemStack(diamond_bow, 1).getItem().getRegistryName(), null, new ItemStack(diamond_bow, 1), ModUtil.objectToIngredient(new Object[]{Items.DIAMOND, Items.BOW}));
            GameRegistry.addShapelessRecipe(new ItemStack(copper_bow, 1).getItem().getRegistryName(), null, new ItemStack(copper_bow, 1), ModUtil.objectToIngredient(new Object[]{ModElements.copper_ingot, Items.BOW}));
            GameRegistry.addShapelessRecipe(new ItemStack(bronze_bow, 1).getItem().getRegistryName(), null, new ItemStack(bronze_bow, 1), ModUtil.objectToIngredient(new Object[]{ModElements.bronze_ingot, Items.BOW}));
            GameRegistry.addShapelessRecipe(new ItemStack(jade_bow, 1).getItem().getRegistryName(), null, new ItemStack(jade_bow, 1), ModUtil.objectToIngredient(new Object[]{ModElements.jade, Items.BOW}));
            GameRegistry.addShapelessRecipe(new ItemStack(amethyst_bow, 1).getItem().getRegistryName(), null, new ItemStack(amethyst_bow, 1), ModUtil.objectToIngredient(new Object[]{ModElements.amethyst, Items.BOW}));
            GameRegistry.addShapedRecipe(new ItemStack(op_bow).getItem().getRegistryName(), null, new ItemStack(op_bow), new Object[]{"AAA", "ABA", "AAA", 'A', ModElements.amethyst_block, 'B', Items.BOW});
            GameRegistry.addShapedRecipe(new ItemStack(stone_shield).getItem().getRegistryName(), null, new ItemStack(stone_shield), new Object[]{"SSS", "SSS", " S ", 'S', Blocks.STONE});
            GameRegistry.addShapedRecipe(new ItemStack(iron_shield).getItem().getRegistryName(), null, new ItemStack(iron_shield), new Object[]{"III", "III", " I ", 'I', Items.IRON_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shield).getItem().getRegistryName(), null, new ItemStack(gold_shield), new Object[]{"GGG", "GGG", " G ", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_shield).getItem().getRegistryName(), null, new ItemStack(diamond_shield), new Object[]{"DDD", "DDD", " D ", 'D', Items.DIAMOND});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shield).getItem().getRegistryName(), null, new ItemStack(copper_shield), new Object[]{"CCC", "CCC", " C ", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shield).getItem().getRegistryName(), null, new ItemStack(bronze_shield), new Object[]{"BBB", "BBB", " B ", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shield).getItem().getRegistryName(), null, new ItemStack(jade_shield), new Object[]{"JJJ", "JJJ", " J ", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shield).getItem().getRegistryName(), null, new ItemStack(amethyst_shield), new Object[]{"AAA", "AAA", " A ", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(copper_PickAxe).getItem().getRegistryName(), null, new ItemStack(copper_PickAxe), new Object[]{"CCC", " S ", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_PickAxe).getItem().getRegistryName(), null, new ItemStack(bronze_PickAxe), new Object[]{"BBB", " S ", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_PickAxe).getItem().getRegistryName(), null, new ItemStack(jade_PickAxe), new Object[]{"JJJ", " S ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_PickAxe).getItem().getRegistryName(), null, new ItemStack(amethyst_PickAxe), new Object[]{"AAA", " S ", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_axe).getItem().getRegistryName(), null, new ItemStack(copper_axe), new Object[]{"CC ", "CS ", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_axe).getItem().getRegistryName(), null, new ItemStack(copper_axe), new Object[]{" CC", " SC", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_axe).getItem().getRegistryName(), null, new ItemStack(copper_axe), new Object[]{" CC", " CS", "  S", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_axe).getItem().getRegistryName(), null, new ItemStack(copper_axe), new Object[]{"CC ", "SC ", "S  ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_axe).getItem().getRegistryName(), null, new ItemStack(bronze_axe), new Object[]{"BB ", "BS ", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_axe).getItem().getRegistryName(), null, new ItemStack(bronze_axe), new Object[]{" BB", " SB", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_axe).getItem().getRegistryName(), null, new ItemStack(bronze_axe), new Object[]{" BB", " BS", "  S", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_axe).getItem().getRegistryName(), null, new ItemStack(bronze_axe), new Object[]{"BB ", "SB ", "S  ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_axe).getItem().getRegistryName(), null, new ItemStack(jade_axe), new Object[]{"JJ ", "JS ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_axe).getItem().getRegistryName(), null, new ItemStack(jade_axe), new Object[]{" JJ", " SJ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_axe).getItem().getRegistryName(), null, new ItemStack(jade_axe), new Object[]{" JJ", " JS", "  S", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_axe).getItem().getRegistryName(), null, new ItemStack(jade_axe), new Object[]{"JJ ", "SJ ", "S  ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_axe).getItem().getRegistryName(), null, new ItemStack(amethyst_axe), new Object[]{"AA ", "AS ", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_axe).getItem().getRegistryName(), null, new ItemStack(amethyst_axe), new Object[]{" AA", " SA", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_axe).getItem().getRegistryName(), null, new ItemStack(amethyst_axe), new Object[]{" AA", " AS", "  S", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_axe).getItem().getRegistryName(), null, new ItemStack(amethyst_axe), new Object[]{"AA ", "SA ", "S  ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shovel).getItem().getRegistryName(), null, new ItemStack(copper_shovel), new Object[]{" C ", " S ", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shovel).getItem().getRegistryName(), null, new ItemStack(copper_shovel), new Object[]{"C  ", "S  ", "S  ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shovel).getItem().getRegistryName(), null, new ItemStack(copper_shovel), new Object[]{"  C", "  S", "  S", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shovel).getItem().getRegistryName(), null, new ItemStack(bronze_shovel), new Object[]{" B ", " S ", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shovel).getItem().getRegistryName(), null, new ItemStack(bronze_shovel), new Object[]{"B  ", "S  ", "S  ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shovel).getItem().getRegistryName(), null, new ItemStack(bronze_shovel), new Object[]{"  B", "  S", "  S", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shovel).getItem().getRegistryName(), null, new ItemStack(jade_shovel), new Object[]{" J ", " S ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shovel).getItem().getRegistryName(), null, new ItemStack(jade_shovel), new Object[]{"J  ", "S  ", "S  ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shovel).getItem().getRegistryName(), null, new ItemStack(jade_shovel), new Object[]{"  J", "  S", "  S", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shovel).getItem().getRegistryName(), null, new ItemStack(amethyst_shovel), new Object[]{" A ", " S ", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shovel).getItem().getRegistryName(), null, new ItemStack(amethyst_shovel), new Object[]{"A  ", "S  ", "S  ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shovel).getItem().getRegistryName(), null, new ItemStack(amethyst_shovel), new Object[]{"  A", "  S", "  S", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_hoe).getItem().getRegistryName(), null, new ItemStack(copper_hoe), new Object[]{"CC ", " S ", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_hoe).getItem().getRegistryName(), null, new ItemStack(copper_hoe), new Object[]{" CC", " S ", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_hoe).getItem().getRegistryName(), null, new ItemStack(copper_hoe), new Object[]{"CC ", "S  ", "S  ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_hoe).getItem().getRegistryName(), null, new ItemStack(copper_hoe), new Object[]{" CC", "  S", "  S", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_hoe).getItem().getRegistryName(), null, new ItemStack(bronze_hoe), new Object[]{"BB ", " S ", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_hoe).getItem().getRegistryName(), null, new ItemStack(bronze_hoe), new Object[]{" BB", " S ", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_hoe).getItem().getRegistryName(), null, new ItemStack(bronze_hoe), new Object[]{"BB ", "S  ", "S  ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_hoe).getItem().getRegistryName(), null, new ItemStack(bronze_hoe), new Object[]{" BB", "  S", "  S", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_hoe).getItem().getRegistryName(), null, new ItemStack(jade_hoe), new Object[]{"JJ ", " S ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_hoe).getItem().getRegistryName(), null, new ItemStack(jade_hoe), new Object[]{" JJ", " S ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_hoe).getItem().getRegistryName(), null, new ItemStack(jade_hoe), new Object[]{"JJ ", "S  ", "S  ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_hoe).getItem().getRegistryName(), null, new ItemStack(jade_hoe), new Object[]{" JJ", "  S", "  S", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_hoe).getItem().getRegistryName(), null, new ItemStack(amethyst_hoe), new Object[]{"AA ", " S ", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_hoe).getItem().getRegistryName(), null, new ItemStack(amethyst_hoe), new Object[]{" AA", " S ", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_hoe).getItem().getRegistryName(), null, new ItemStack(amethyst_hoe), new Object[]{"AA ", "S  ", "S  ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_hoe).getItem().getRegistryName(), null, new ItemStack(amethyst_hoe), new Object[]{" AA", "  S", "  S", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapelessRecipe(new ItemStack(diamond_MultiTool, 1).getItem().getRegistryName(), null, new ItemStack(diamond_MultiTool, 1), ModUtil.objectToIngredient(new Object[]{Items.DIAMOND_SWORD, Items.DIAMOND_PICKAXE, Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_HOE}));
            GameRegistry.addShapelessRecipe(new ItemStack(copper_MultiTool, 1).getItem().getRegistryName(), null, new ItemStack(copper_MultiTool, 1), ModUtil.objectToIngredient(new Object[]{copper_sword, copper_PickAxe, copper_axe, copper_shovel, copper_hoe}));
            GameRegistry.addShapelessRecipe(new ItemStack(bronze_MultiTool, 1).getItem().getRegistryName(), null, new ItemStack(bronze_MultiTool, 1), ModUtil.objectToIngredient(new Object[]{bronze_sword, bronze_PickAxe, bronze_axe, bronze_shovel, bronze_hoe}));
            GameRegistry.addShapelessRecipe(new ItemStack(jade_MultiTool, 1).getItem().getRegistryName(), null, new ItemStack(jade_MultiTool, 1), ModUtil.objectToIngredient(new Object[]{jade_sword, jade_PickAxe, jade_axe, jade_shovel, jade_hoe}));
            GameRegistry.addShapelessRecipe(new ItemStack(amethyst_MultiTool, 1).getItem().getRegistryName(), null, new ItemStack(amethyst_MultiTool, 1), ModUtil.objectToIngredient(new Object[]{amethyst_sword, amethyst_PickAxe, amethyst_axe, amethyst_shovel, amethyst_hoe}));
            GameRegistry.addShapedRecipe(new ItemStack(op_MultiTool).getItem().getRegistryName(), null, new ItemStack(op_MultiTool), new Object[]{"AMA", "MNM", "AMA", 'A', ModElements.amethyst_block, 'M', amethyst_MultiTool, 'N', Items.NETHER_STAR});
            GameRegistry.addShapedRecipe(new ItemStack(op_MultiTool).getItem().getRegistryName(), null, new ItemStack(op_MultiTool), new Object[]{"MAM", "ANA", "MAM", 'A', ModElements.amethyst_block, 'M', amethyst_MultiTool, 'N', Items.NETHER_STAR});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_hammer).getItem().getRegistryName(), null, new ItemStack(wooden_hammer), new Object[]{"WWW", "WWW", " S ", 'W', Blocks.PLANKS, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(stone_hammer).getItem().getRegistryName(), null, new ItemStack(stone_hammer), new Object[]{"BBB", "BBB", " S ", 'B', Blocks.STONE, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(iron_hammer).getItem().getRegistryName(), null, new ItemStack(iron_hammer), new Object[]{"III", "III", " S ", 'I', Items.IRON_INGOT, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(gold_hammer).getItem().getRegistryName(), null, new ItemStack(gold_hammer), new Object[]{"GGG", "GGG", " S ", 'G', Items.GOLD_INGOT, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_hammer).getItem().getRegistryName(), null, new ItemStack(diamond_hammer), new Object[]{"DDD", "DDD", " S ", 'D', Items.DIAMOND, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_hammer).getItem().getRegistryName(), null, new ItemStack(copper_hammer), new Object[]{"CCC", "CCC", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_hammer).getItem().getRegistryName(), null, new ItemStack(bronze_hammer), new Object[]{"BBB", "BBB", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_hammer).getItem().getRegistryName(), null, new ItemStack(jade_hammer), new Object[]{"JJJ", "JJJ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_hammer).getItem().getRegistryName(), null, new ItemStack(amethyst_hammer), new Object[]{"AAA", "AAA", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_scythe).getItem().getRegistryName(), null, new ItemStack(wooden_scythe), new Object[]{"WWW", "WS ", " S ", 'W', Blocks.PLANKS, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_scythe).getItem().getRegistryName(), null, new ItemStack(wooden_scythe), new Object[]{"WWW", " SW", " S ", 'W', Blocks.PLANKS, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(stone_scythe).getItem().getRegistryName(), null, new ItemStack(stone_scythe), new Object[]{"BBB", "BS ", " S ", 'B', Blocks.STONE, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(stone_scythe).getItem().getRegistryName(), null, new ItemStack(stone_scythe), new Object[]{"BBB", " SB", " S ", 'B', Blocks.STONE, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(iron_scythe).getItem().getRegistryName(), null, new ItemStack(iron_scythe), new Object[]{"III", "IS ", " S ", 'I', Items.IRON_INGOT, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(iron_scythe).getItem().getRegistryName(), null, new ItemStack(iron_scythe), new Object[]{"III", " SI", " S ", 'I', Items.IRON_INGOT, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(gold_scythe).getItem().getRegistryName(), null, new ItemStack(gold_scythe), new Object[]{"GGG", "GS ", " S ", 'G', Items.GOLD_INGOT, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(gold_scythe).getItem().getRegistryName(), null, new ItemStack(gold_scythe), new Object[]{"GGG", " SG", " S ", 'G', Items.GOLD_INGOT, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_scythe).getItem().getRegistryName(), null, new ItemStack(diamond_scythe), new Object[]{"DDD", "DS ", " S ", 'D', Items.DIAMOND, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_scythe).getItem().getRegistryName(), null, new ItemStack(diamond_scythe), new Object[]{"DDD", " SD", " S ", 'D', Items.DIAMOND, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_scythe).getItem().getRegistryName(), null, new ItemStack(copper_scythe), new Object[]{"CCC", "CS ", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(copper_scythe).getItem().getRegistryName(), null, new ItemStack(copper_scythe), new Object[]{"CCC", " SC", " S ", 'C', ModElements.copper_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_scythe).getItem().getRegistryName(), null, new ItemStack(bronze_scythe), new Object[]{"BBB", "BS ", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_scythe).getItem().getRegistryName(), null, new ItemStack(bronze_scythe), new Object[]{"BBB", " SB", " S ", 'B', ModElements.bronze_ingot, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_scythe).getItem().getRegistryName(), null, new ItemStack(jade_scythe), new Object[]{"JJJ", "JS ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(jade_scythe).getItem().getRegistryName(), null, new ItemStack(jade_scythe), new Object[]{"JJJ", " SJ", " S ", 'J', ModElements.jade, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_scythe).getItem().getRegistryName(), null, new ItemStack(amethyst_scythe), new Object[]{"AAA", "AS ", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_scythe).getItem().getRegistryName(), null, new ItemStack(amethyst_scythe), new Object[]{"AAA", " SA", " S ", 'A', ModElements.amethyst, 'S', Items.STICK});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_shears).getItem().getRegistryName(), null, new ItemStack(wooden_shears), new Object[]{"W  ", " W ", "   ", 'W', Blocks.PLANKS});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_shears).getItem().getRegistryName(), null, new ItemStack(wooden_shears), new Object[]{" W ", "  W", "   ", 'W', Blocks.PLANKS});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_shears).getItem().getRegistryName(), null, new ItemStack(wooden_shears), new Object[]{" W ", "  W", "   ", 'W', Blocks.PLANKS});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_shears).getItem().getRegistryName(), null, new ItemStack(wooden_shears), new Object[]{"W  ", " W ", "   ", 'W', Blocks.PLANKS});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_shears).getItem().getRegistryName(), null, new ItemStack(wooden_shears), new Object[]{"   ", "W  ", " W ", 'W', Blocks.PLANKS});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_shears).getItem().getRegistryName(), null, new ItemStack(wooden_shears), new Object[]{"   ", " W ", "  W", 'W', Blocks.PLANKS});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_shears).getItem().getRegistryName(), null, new ItemStack(wooden_shears), new Object[]{"   ", " W ", "  W", 'W', Blocks.PLANKS});
            GameRegistry.addShapedRecipe(new ItemStack(wooden_shears).getItem().getRegistryName(), null, new ItemStack(wooden_shears), new Object[]{"   ", "W  ", " W ", 'W', Blocks.PLANKS});
            GameRegistry.addShapedRecipe(new ItemStack(stone_shears).getItem().getRegistryName(), null, new ItemStack(stone_shears), new Object[]{"S  ", " S ", "   ", 'S', Blocks.STONE});
            GameRegistry.addShapedRecipe(new ItemStack(stone_shears).getItem().getRegistryName(), null, new ItemStack(stone_shears), new Object[]{" S ", "  S", "   ", 'S', Blocks.STONE});
            GameRegistry.addShapedRecipe(new ItemStack(stone_shears).getItem().getRegistryName(), null, new ItemStack(stone_shears), new Object[]{" S ", "  S", "   ", 'S', Blocks.STONE});
            GameRegistry.addShapedRecipe(new ItemStack(stone_shears).getItem().getRegistryName(), null, new ItemStack(stone_shears), new Object[]{"S  ", " S ", "   ", 'S', Blocks.STONE});
            GameRegistry.addShapedRecipe(new ItemStack(stone_shears).getItem().getRegistryName(), null, new ItemStack(stone_shears), new Object[]{"   ", "S  ", " S ", 'S', Blocks.STONE});
            GameRegistry.addShapedRecipe(new ItemStack(stone_shears).getItem().getRegistryName(), null, new ItemStack(stone_shears), new Object[]{"   ", " S ", "  S", 'S', Blocks.STONE});
            GameRegistry.addShapedRecipe(new ItemStack(stone_shears).getItem().getRegistryName(), null, new ItemStack(stone_shears), new Object[]{"   ", " S ", "  S", 'S', Blocks.STONE});
            GameRegistry.addShapedRecipe(new ItemStack(stone_shears).getItem().getRegistryName(), null, new ItemStack(stone_shears), new Object[]{"   ", "S  ", " S ", 'S', Blocks.STONE});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shears).getItem().getRegistryName(), null, new ItemStack(gold_shears), new Object[]{"G  ", " G ", "   ", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shears).getItem().getRegistryName(), null, new ItemStack(gold_shears), new Object[]{" G ", "  G", "   ", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shears).getItem().getRegistryName(), null, new ItemStack(gold_shears), new Object[]{" G ", "  G", "   ", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shears).getItem().getRegistryName(), null, new ItemStack(gold_shears), new Object[]{"G  ", " G ", "   ", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shears).getItem().getRegistryName(), null, new ItemStack(gold_shears), new Object[]{"   ", "G  ", " G ", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shears).getItem().getRegistryName(), null, new ItemStack(gold_shears), new Object[]{"   ", " G ", "  G", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shears).getItem().getRegistryName(), null, new ItemStack(gold_shears), new Object[]{"   ", " G ", "  G", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shears).getItem().getRegistryName(), null, new ItemStack(gold_shears), new Object[]{"   ", "G  ", " G ", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(gold_shears).getItem().getRegistryName(), null, new ItemStack(gold_shears), new Object[]{"G  ", " G ", "   ", 'G', Items.GOLD_INGOT});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_shears).getItem().getRegistryName(), null, new ItemStack(diamond_shears), new Object[]{" D ", "  D", "   ", 'D', Items.DIAMOND});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_shears).getItem().getRegistryName(), null, new ItemStack(diamond_shears), new Object[]{" D ", "  D", "   ", 'D', Items.DIAMOND});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_shears).getItem().getRegistryName(), null, new ItemStack(diamond_shears), new Object[]{"D  ", " D ", "   ", 'D', Items.DIAMOND});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_shears).getItem().getRegistryName(), null, new ItemStack(diamond_shears), new Object[]{"   ", "D  ", " D ", 'D', Items.DIAMOND});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_shears).getItem().getRegistryName(), null, new ItemStack(diamond_shears), new Object[]{"   ", " D ", "  D", 'D', Items.DIAMOND});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_shears).getItem().getRegistryName(), null, new ItemStack(diamond_shears), new Object[]{"   ", " D ", "  D", 'D', Items.DIAMOND});
            GameRegistry.addShapedRecipe(new ItemStack(diamond_shears).getItem().getRegistryName(), null, new ItemStack(diamond_shears), new Object[]{"   ", "D  ", " D ", 'D', Items.DIAMOND});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shears).getItem().getRegistryName(), null, new ItemStack(copper_shears), new Object[]{" C ", "  C", "   ", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shears).getItem().getRegistryName(), null, new ItemStack(copper_shears), new Object[]{" C ", "  C", "   ", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shears).getItem().getRegistryName(), null, new ItemStack(copper_shears), new Object[]{"C  ", " C ", "   ", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shears).getItem().getRegistryName(), null, new ItemStack(copper_shears), new Object[]{"   ", "C  ", " C ", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shears).getItem().getRegistryName(), null, new ItemStack(copper_shears), new Object[]{"   ", " C ", "  C", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shears).getItem().getRegistryName(), null, new ItemStack(copper_shears), new Object[]{"   ", " C ", "  C", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_shears).getItem().getRegistryName(), null, new ItemStack(copper_shears), new Object[]{"   ", "C  ", " C ", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shears).getItem().getRegistryName(), null, new ItemStack(bronze_shears), new Object[]{" B ", "  B", "   ", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shears).getItem().getRegistryName(), null, new ItemStack(bronze_shears), new Object[]{" B ", "  B", "   ", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shears).getItem().getRegistryName(), null, new ItemStack(bronze_shears), new Object[]{"B  ", " B ", "   ", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shears).getItem().getRegistryName(), null, new ItemStack(bronze_shears), new Object[]{"   ", "B  ", " B ", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shears).getItem().getRegistryName(), null, new ItemStack(bronze_shears), new Object[]{"   ", " B ", "  B", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shears).getItem().getRegistryName(), null, new ItemStack(bronze_shears), new Object[]{"   ", " B ", "  B", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_shears).getItem().getRegistryName(), null, new ItemStack(bronze_shears), new Object[]{"   ", "B  ", " B ", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shears).getItem().getRegistryName(), null, new ItemStack(jade_shears), new Object[]{" J ", "  J", "   ", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shears).getItem().getRegistryName(), null, new ItemStack(jade_shears), new Object[]{" J ", "  J", "   ", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shears).getItem().getRegistryName(), null, new ItemStack(jade_shears), new Object[]{"J  ", " J ", "   ", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shears).getItem().getRegistryName(), null, new ItemStack(jade_shears), new Object[]{"   ", "J  ", " J ", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shears).getItem().getRegistryName(), null, new ItemStack(jade_shears), new Object[]{"   ", " J ", "  J", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shears).getItem().getRegistryName(), null, new ItemStack(jade_shears), new Object[]{"   ", " J ", "  J", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_shears).getItem().getRegistryName(), null, new ItemStack(jade_shears), new Object[]{"   ", "J  ", " J ", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shears).getItem().getRegistryName(), null, new ItemStack(amethyst_shears), new Object[]{" A ", "  A", "   ", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shears).getItem().getRegistryName(), null, new ItemStack(amethyst_shears), new Object[]{" A ", "  A", "   ", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shears).getItem().getRegistryName(), null, new ItemStack(amethyst_shears), new Object[]{"A  ", " A ", "   ", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shears).getItem().getRegistryName(), null, new ItemStack(amethyst_shears), new Object[]{"   ", "A  ", " A ", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shears).getItem().getRegistryName(), null, new ItemStack(amethyst_shears), new Object[]{"   ", " A ", "  A", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shears).getItem().getRegistryName(), null, new ItemStack(amethyst_shears), new Object[]{"   ", " A ", "  A", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_shears).getItem().getRegistryName(), null, new ItemStack(amethyst_shears), new Object[]{"   ", "A  ", " A ", 'A', ModElements.amethyst});
            GameRegistry.addShapelessRecipe(new ItemStack(flint_and_wood, 1).getItem().getRegistryName(), null, new ItemStack(flint_and_wood, 1), ModUtil.objectToIngredient(new Object[]{new ItemStack(Blocks.PLANKS, 1), new ItemStack(Items.FLINT, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(flint_and_stone, 1).getItem().getRegistryName(), null, new ItemStack(flint_and_stone, 1), ModUtil.objectToIngredient(new Object[]{new ItemStack(Blocks.STONE, 1), new ItemStack(Items.FLINT, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(flint_and_gold, 1).getItem().getRegistryName(), null, new ItemStack(flint_and_gold, 1), ModUtil.objectToIngredient(new Object[]{new ItemStack(Items.GOLD_INGOT, 1), new ItemStack(Items.FLINT, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(flint_and_diamond, 1).getItem().getRegistryName(), null, new ItemStack(flint_and_diamond, 1), ModUtil.objectToIngredient(new Object[]{new ItemStack(Items.DIAMOND, 1), new ItemStack(Items.FLINT, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(flint_and_copper, 1).getItem().getRegistryName(), null, new ItemStack(flint_and_copper, 1), ModUtil.objectToIngredient(new Object[]{new ItemStack(ModElements.copper_ingot, 1), new ItemStack(Items.FLINT, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(flint_and_bronze, 1).getItem().getRegistryName(), null, new ItemStack(flint_and_bronze, 1), ModUtil.objectToIngredient(new Object[]{new ItemStack(ModElements.bronze_ingot, 1), new ItemStack(Items.FLINT, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(flint_and_jade, 1).getItem().getRegistryName(), null, new ItemStack(flint_and_jade, 1), ModUtil.objectToIngredient(new Object[]{new ItemStack(ModElements.jade, 1), new ItemStack(Items.FLINT, 1)}));
            GameRegistry.addShapelessRecipe(new ItemStack(flint_and_amethyst, 1).getItem().getRegistryName(), null, new ItemStack(flint_and_amethyst, 1), ModUtil.objectToIngredient(new Object[]{new ItemStack(ModElements.amethyst, 1), new ItemStack(Items.FLINT, 1)}));
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_helmet).getItem().getRegistryName(), null, new ItemStack(amethyst_helmet), new Object[]{"AAA", "A A", "   ", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_helmet).getItem().getRegistryName(), null, new ItemStack(amethyst_helmet), new Object[]{"   ", "AAA", "A A", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_chestplate).getItem().getRegistryName(), null, new ItemStack(amethyst_chestplate), new Object[]{"A A", "AAA", "AAA", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_leggings).getItem().getRegistryName(), null, new ItemStack(amethyst_leggings), new Object[]{"AAA", "A A", "A A", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_boots).getItem().getRegistryName(), null, new ItemStack(amethyst_boots), new Object[]{"   ", "A A", "A A", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(amethyst_boots).getItem().getRegistryName(), null, new ItemStack(amethyst_boots), new Object[]{"A A", "A A", "   ", 'A', ModElements.amethyst});
            GameRegistry.addShapedRecipe(new ItemStack(jade_helmet).getItem().getRegistryName(), null, new ItemStack(jade_helmet), new Object[]{"JJJ", "J J", "   ", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_helmet).getItem().getRegistryName(), null, new ItemStack(jade_helmet), new Object[]{"   ", "JJJ", "J J", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_chestplate).getItem().getRegistryName(), null, new ItemStack(jade_chestplate), new Object[]{"J J", "JJJ", "JJJ", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_leggings).getItem().getRegistryName(), null, new ItemStack(jade_leggings), new Object[]{"JJJ", "J J", "J J", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_boots).getItem().getRegistryName(), null, new ItemStack(jade_boots), new Object[]{"   ", "J J", "J J", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(jade_boots).getItem().getRegistryName(), null, new ItemStack(jade_boots), new Object[]{"J J", "J J", "   ", 'J', ModElements.jade});
            GameRegistry.addShapedRecipe(new ItemStack(copper_helmet).getItem().getRegistryName(), null, new ItemStack(copper_helmet), new Object[]{"CCC", "C C", "   ", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_helmet).getItem().getRegistryName(), null, new ItemStack(copper_helmet), new Object[]{"   ", "CCC", "C C", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_chestplate).getItem().getRegistryName(), null, new ItemStack(copper_chestplate), new Object[]{"C C", "CCC", "CCC", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_leggings).getItem().getRegistryName(), null, new ItemStack(copper_leggings), new Object[]{"CCC", "C C", "C C", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_boots).getItem().getRegistryName(), null, new ItemStack(copper_boots), new Object[]{"   ", "C C", "C C", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(copper_boots).getItem().getRegistryName(), null, new ItemStack(copper_boots), new Object[]{"C C", "C C", "   ", 'C', ModElements.copper_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_helmet).getItem().getRegistryName(), null, new ItemStack(bronze_helmet), new Object[]{"BBB", "B B", "   ", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_helmet).getItem().getRegistryName(), null, new ItemStack(bronze_helmet), new Object[]{"   ", "BBB", "B B", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_chestplate).getItem().getRegistryName(), null, new ItemStack(bronze_chestplate), new Object[]{"B B", "BBB", "BBB", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_leggings).getItem().getRegistryName(), null, new ItemStack(bronze_leggings), new Object[]{"BBB", "B B", "B B", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_boots).getItem().getRegistryName(), null, new ItemStack(bronze_boots), new Object[]{"   ", "B B", "B B", 'B', ModElements.bronze_ingot});
            GameRegistry.addShapedRecipe(new ItemStack(bronze_boots).getItem().getRegistryName(), null, new ItemStack(bronze_boots), new Object[]{"B B", "B B", "   ", 'B', ModElements.bronze_ingot});
        */
        }


    }

    static {

    }
}
