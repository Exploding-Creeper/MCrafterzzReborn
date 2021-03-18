/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.init;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import me.hypherionmc.mcrafterzzreborn.items.*;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModConstants.MODID);
    
    /**
     * Items
     */
    public static RegistryObject<Item> amethyst = ITEMS.register("amethyst", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> jade = ITEMS.register("jade", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> copper_ingot = ITEMS.register("copper_ingot", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> tin_ingot = ITEMS.register("tin_ingot", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> bronze_ingot = ITEMS.register("bronze_ingot", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> wooden_pattern = ITEMS.register("wooden_pattern", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> wooden_pattern_bars = ITEMS.register("wooden_pattern_bars", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> wooden_pattern_button = ITEMS.register("wooden_pattern_button", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> wooden_pattern_pressure_plate = ITEMS.register("wooden_pattern_pressure_plate", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> wooden_pattern_trapdoor = ITEMS.register("wooden_pattern_trapdoor", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> wooden_pattern_wall = ITEMS.register("wooden_pattern_wall", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> wooden_pattern_fence = ITEMS.register("wooden_pattern_fence", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> wooden_pattern_fence_gate = ITEMS.register("wooden_pattern_fence_gate", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> wooden_pattern_stairs = ITEMS.register("wooden_pattern_stairs", () -> new ModItem(ModTabs.creativeTab));
    public static RegistryObject<Item> portable_furnace = ITEMS.register("portable_furnace", PortableFurnace::new);

    /**
     * Weapons
     */
    public static RegistryObject<Item> copper_sword = ITEMS.register("copper_sword", () -> new Sword(ItemTiers.COPPER, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_sword = ITEMS.register("bronze_sword", () -> new Sword(ItemTiers.BRONZE, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_sword = ITEMS.register("jade_sword", () -> new Sword(ItemTiers.JADE, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_sword = ITEMS.register("amethyst_sword", () -> new Sword(ItemTiers.AMETHYST, ModItems.amethyst.get(), ModTabs.creativeTabTools));

    public static RegistryObject<Item> stone_bow = ITEMS.register("stone_bow", () -> new Bow(132, Item.getItemFromBlock(Blocks.STONE), ModTabs.creativeTabTools));
    public static RegistryObject<Item> iron_bow = ITEMS.register("iron_bow", () -> new Bow(238, Items.IRON_INGOT, ModTabs.creativeTabTools));
    public static RegistryObject<Item> gold_bow = ITEMS.register("gold_bow", () -> new Bow(275, Items.GOLD_INGOT, ModTabs.creativeTabTools));
    public static RegistryObject<Item> diamond_bow = ITEMS.register("diamond_bow", () -> new Bow(1562, Items.DIAMOND, ModTabs.creativeTabTools));
    public static RegistryObject<Item> copper_bow = ITEMS.register("copper_bow", () -> new Bow(170, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_bow = ITEMS.register("bronze_bow", () -> new Bow(250, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_bow = ITEMS.register("jade_bow", () -> new Bow(2000, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_bow = ITEMS.register("amethyst_bow", () -> new Bow(2000, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> op_bow = ITEMS.register("op_bow", () -> new Bow(0, ModItems.amethyst.get(), ModTabs.creativeTabTools));

    /**
     * Armor
     */
    public static RegistryObject<Item> stone_shield = ITEMS.register("stone_shield", () -> new Shield(132, ModTabs.creativeTabTools));
    public static RegistryObject<Item> iron_shield = ITEMS.register("iron_shield", () -> new Shield(238, ModTabs.creativeTabTools));
    public static RegistryObject<Item> gold_shield = ITEMS.register("gold_shield", () -> new Shield(275, ModTabs.creativeTabTools));
    public static RegistryObject<Item> diamond_shield = ITEMS.register("diamond_shield", () -> new Shield(1562, ModTabs.creativeTabTools));
    public static RegistryObject<Item> copper_shield = ITEMS.register("copper_shield", () -> new Shield(170, ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_shield = ITEMS.register("bronze_shield", () -> new Shield(250, ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_shield = ITEMS.register("jade_shield", () -> new Shield(2000, ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_shield = ITEMS.register("amethyst_shield", () -> new Shield(2000, ModTabs.creativeTabTools));

    public static RegistryObject<Item> copper_helmet = ITEMS.register("copper_helmet", () -> new Armour(ArmorMaterials.COPPER, 1, EquipmentSlotType.HEAD, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> copper_chestplate = ITEMS.register("copper_chestplate", () -> new Armour(ArmorMaterials.COPPER, 1, EquipmentSlotType.CHEST, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> copper_leggings = ITEMS.register("copper_leggings", () -> new Armour(ArmorMaterials.COPPER, 2, EquipmentSlotType.LEGS, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> copper_boots = ITEMS.register("copper_boots", () -> new Armour(ArmorMaterials.COPPER, 1, EquipmentSlotType.FEET, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_helmet = ITEMS.register("bronze_helmet", () -> new Armour(ArmorMaterials.BRONZE, 1, EquipmentSlotType.HEAD, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_chestplate = ITEMS.register("bronze_chestplate", () -> new Armour(ArmorMaterials.BRONZE, 1, EquipmentSlotType.CHEST, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_leggings = ITEMS.register("bronze_leggings", () -> new Armour(ArmorMaterials.BRONZE, 2, EquipmentSlotType.LEGS, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_boots = ITEMS.register("bronze_boots", () -> new Armour(ArmorMaterials.BRONZE, 1, EquipmentSlotType.FEET, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_helmet = ITEMS.register("jade_helmet", () -> new Armour(ArmorMaterials.JADE, 1, EquipmentSlotType.HEAD, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_chestplate = ITEMS.register("jade_chestplate", () -> new Armour(ArmorMaterials.JADE, 1, EquipmentSlotType.CHEST, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_leggings = ITEMS.register("jade_leggings", () -> new Armour(ArmorMaterials.JADE, 2, EquipmentSlotType.LEGS, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_boots = ITEMS.register("jade_boots", () -> new Armour(ArmorMaterials.JADE, 1, EquipmentSlotType.FEET, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_helmet = ITEMS.register("amethyst_helmet", () -> new Armour(ArmorMaterials.AMETHYST, 1, EquipmentSlotType.HEAD, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_chestplate = ITEMS.register("amethyst_chestplate", () -> new Armour(ArmorMaterials.AMETHYST, 1, EquipmentSlotType.CHEST, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_leggings = ITEMS.register("amethyst_leggings", () -> new Armour(ArmorMaterials.AMETHYST, 2, EquipmentSlotType.LEGS, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_boots = ITEMS.register("amethyst_boots", () -> new Armour(ArmorMaterials.AMETHYST, 1, EquipmentSlotType.FEET, ModItems.amethyst.get(), ModTabs.creativeTabTools));

    /**
     * Tools
     */
    public static RegistryObject<Item> copper_PickAxe = ITEMS.register("copper_PickAxe", () -> new PickAxe(ItemTiers.COPPER, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_PickAxe = ITEMS.register("bronze_PickAxe", () -> new PickAxe(ItemTiers.BRONZE, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_PickAxe = ITEMS.register("jade_PickAxe", () -> new PickAxe(ItemTiers.JADE, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_PickAxe = ITEMS.register("amethyst_PickAxe", () -> new PickAxe(ItemTiers.AMETHYST, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    
    public static RegistryObject<Item> flint_and_wood = ITEMS.register("flint_and_wood", () -> new FlintAndIngot(59, ModTabs.creativeTabTools));
    public static RegistryObject<Item> flint_and_stone = ITEMS.register("flint_and_stone", () -> new FlintAndIngot(132, ModTabs.creativeTabTools));
    public static RegistryObject<Item> flint_and_gold = ITEMS.register("flint_and_gold", () -> new FlintAndIngot(275, ModTabs.creativeTabTools));
    public static RegistryObject<Item> flint_and_diamond = ITEMS.register("flint_and_diamond", () -> new FlintAndIngot(1562, ModTabs.creativeTabTools));
    public static RegistryObject<Item> flint_and_copper = ITEMS.register("flint_and_copper", () -> new FlintAndIngot(170, ModTabs.creativeTabTools));
    public static RegistryObject<Item> flint_and_bronze = ITEMS.register("flint_and_bronze", () -> new FlintAndIngot(250, ModTabs.creativeTabTools));
    public static RegistryObject<Item> flint_and_jade = ITEMS.register("flint_and_jade", () -> new FlintAndIngot(2000, ModTabs.creativeTabTools));
    public static RegistryObject<Item> flint_and_amethyst = ITEMS.register("flint_and_amethyst", () -> new FlintAndIngot(2000, ModTabs.creativeTabTools));
    
    public static RegistryObject<Item> copper_axe = ITEMS.register("copper_axe", () -> new Axe(ItemTiers.COPPER, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_axe = ITEMS.register("bronze_axe", () -> new Axe(ItemTiers.BRONZE, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_axe = ITEMS.register("jade_axe", () -> new Axe(ItemTiers.JADE, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_axe = ITEMS.register("amethyst_axe", () -> new Axe(ItemTiers.AMETHYST, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    
    public static RegistryObject<Item> copper_shovel = ITEMS.register("copper_shovel", () -> new Shovel(ItemTiers.COPPER, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_shovel = ITEMS.register("bronze_shovel", () -> new Shovel(ItemTiers.BRONZE, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_shovel = ITEMS.register("jade_shovel", () -> new Shovel(ItemTiers.JADE, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_shovel = ITEMS.register("amethyst_shovel", () -> new Shovel(ItemTiers.AMETHYST, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    
    public static RegistryObject<Item> copper_hoe = ITEMS.register("copper_hoe", () -> new Hoe(ItemTiers.COPPER, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_hoe = ITEMS.register("bronze_hoe", () -> new Hoe(ItemTiers.BRONZE, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_hoe = ITEMS.register("jade_hoe", () -> new Hoe(ItemTiers.JADE, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_hoe = ITEMS.register("amethyst_hoe", () -> new Hoe(ItemTiers.AMETHYST, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    
    public static RegistryObject<Item> diamond_multitool = ITEMS.register("diamond_multitool", () -> new MultiTool(ItemTier.DIAMOND, Items.DIAMOND, ModTabs.creativeTabTools));
    public static RegistryObject<Item> copper_multitool = ITEMS.register("copper_multitool", () -> new MultiTool(ItemTiers.COPPER, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_multitool = ITEMS.register("bronze_multitool", () -> new MultiTool(ItemTiers.BRONZE, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_multitool = ITEMS.register("jade_multitool", () -> new MultiTool(ItemTiers.JADE, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_multitool = ITEMS.register("amethyst_multitool", () -> new MultiTool(ItemTiers.AMETHYST, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> op_multitool = ITEMS.register("op_multitool", () -> new MultiTool(ItemTiers.OPTOOL, ModItems.amethyst.get(), ModTabs.creativeTabTools));
    
    public static RegistryObject<Item> wooden_hammer = ITEMS.register("wooden_hammer", () -> new Hammer(ItemTier.WOOD, 59, ModTabs.creativeTabTools));
    public static RegistryObject<Item> stone_hammer = ITEMS.register("stone_hammer", () -> new Hammer(ItemTier.STONE, 132, ModTabs.creativeTabTools));
    public static RegistryObject<Item> iron_hammer = ITEMS.register("iron_hammer", () -> new Hammer(ItemTier.IRON, 238, ModTabs.creativeTabTools));
    public static RegistryObject<Item> gold_hammer = ITEMS.register("gold_hammer", () -> new Hammer(ItemTier.GOLD, 275, ModTabs.creativeTabTools));
    public static RegistryObject<Item> diamond_hammer = ITEMS.register("diamond_hammer", () -> new Hammer(ItemTier.DIAMOND, 1562, ModTabs.creativeTabTools));
    public static RegistryObject<Item> copper_hammer = ITEMS.register("copper_hammer", () -> new Hammer(ItemTiers.COPPER, 170, ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_hammer = ITEMS.register("bronze_hammer", () -> new Hammer(ItemTiers.BRONZE, 250, ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_hammer = ITEMS.register("jade_hammer", () -> new Hammer(ItemTiers.BRONZE, 2000, ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_hammer = ITEMS.register("amethyst_hammer", () -> new Hammer(ItemTiers.BRONZE, 2000, ModTabs.creativeTabTools));
    
    public static RegistryObject<Item> wooden_scythe = ITEMS.register("wooden_scythe", () -> new Scythe(ItemTier.WOOD, 59, ModTabs.creativeTabTools));
    public static RegistryObject<Item> stone_scythe = ITEMS.register("stone_scythe", () -> new Scythe(ItemTier.STONE, 132, ModTabs.creativeTabTools));
    public static RegistryObject<Item> iron_scythe = ITEMS.register("iron_scythe", () -> new Scythe(ItemTier.IRON, 238, ModTabs.creativeTabTools));
    public static RegistryObject<Item> gold_scythe = ITEMS.register("gold_scythe", () -> new Scythe(ItemTier.GOLD, 275, ModTabs.creativeTabTools));
    public static RegistryObject<Item> diamond_scythe = ITEMS.register("diamond_scythe", () -> new Scythe(ItemTier.DIAMOND, 1562, ModTabs.creativeTabTools));
    public static RegistryObject<Item> copper_scythe = ITEMS.register("copper_scythe", () -> new Scythe(ItemTiers.COPPER, 170, ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_scythe = ITEMS.register("bronze_scythe", () -> new Scythe(ItemTiers.BRONZE, 250, ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_scythe = ITEMS.register("jade_scythe", () -> new Scythe(ItemTiers.BRONZE, 2000, ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_scythe = ITEMS.register("amethyst_scythe", () -> new Scythe(ItemTiers.BRONZE, 2000, ModTabs.creativeTabTools));
    
    public static RegistryObject<Item> wooden_shears = ITEMS.register("wooden_shears", () -> new Shears(0, 59, Item.getItemFromBlock(Blocks.ACACIA_PLANKS), ModTabs.creativeTabTools));
    public static RegistryObject<Item> stone_shears = ITEMS.register("stone_shears", () -> new Shears(0, 132, Item.getItemFromBlock(Blocks.STONE), ModTabs.creativeTabTools));
    public static RegistryObject<Item> gold_shears = ITEMS.register("gold_shears", () -> new Shears(1, 275, Items.GOLD_INGOT, ModTabs.creativeTabTools));
    public static RegistryObject<Item> diamond_shears = ITEMS.register("diamond_shears", () -> new Shears(2, 1562, Items.DIAMOND, ModTabs.creativeTabTools));
    public static RegistryObject<Item> copper_shears = ITEMS.register("copper_shears", () -> new Shears(1, 170, ModItems.copper_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> bronze_shears = ITEMS.register("bronze_shears", () -> new Shears(1, 250, ModItems.bronze_ingot.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> jade_shears = ITEMS.register("jade_shears", () -> new Shears(3, 2000, ModItems.jade.get(), ModTabs.creativeTabTools));
    public static RegistryObject<Item> amethyst_shears = ITEMS.register("amethyst_shears", () -> new Shears(3, 2000, ModItems.amethyst.get(), ModTabs.creativeTabTools));

   
}
