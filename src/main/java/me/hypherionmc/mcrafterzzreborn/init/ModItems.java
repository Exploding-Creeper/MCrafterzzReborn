/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.init;

import me.hypherionmc.mcrafterzzreborn.items.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static Item.ToolMaterial opTool = EnumHelper.addToolMaterial("op", 4, 0, 100.0F, 96.0F, 100);
    public static Item.ToolMaterial amethystTool = EnumHelper.addToolMaterial("amethyst", 4, 2000, 9.0F, 4.0F, 15);
    public static Item.ToolMaterial jadeTool = EnumHelper.addToolMaterial("jade", 4, 2000, 9.0F, 4.0F, 15);
    public static Item.ToolMaterial copperTool = EnumHelper.addToolMaterial("copper", 1, 170, 5.0F, 1.0F, 15);
    public static Item.ToolMaterial bronzeTool = EnumHelper.addToolMaterial("bronze", 2, 250, 6.5F, 2.0F, 15);
    
    public static ItemArmor.ArmorMaterial amethystArmour = EnumHelper.addArmorMaterial("amethyst", "mm:amethyst", 42, new int[]{4, 9, 5, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    public static ItemArmor.ArmorMaterial jadeArmour = EnumHelper.addArmorMaterial("jade", "mm:jade", 42, new int[]{4, 9, 5, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    public static ItemArmor.ArmorMaterial copperArmour = EnumHelper.addArmorMaterial("copper", "mm:copper", 13, new int[]{2, 7, 4, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static ItemArmor.ArmorMaterial bronzeArmour = EnumHelper.addArmorMaterial("bronze", "mm:bronze", 16, new int[]{3, 6, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    
    /**
     * Items
     */
    public static Item amethyst = new ModItem("amethyst").setCreativeTab(ModTabs.creativeTab);
    public static Item jade = new ModItem("jade").setCreativeTab(ModTabs.creativeTab);
    public static Item copper_ingot = new ModItem("copper_ingot").setCreativeTab(ModTabs.creativeTab);
    public static Item tin_ingot = new ModItem("tin_ingot").setCreativeTab(ModTabs.creativeTab);
    public static Item bronze_ingot = new ModItem("bronze_ingot").setCreativeTab(ModTabs.creativeTab);
    public static Item copper_door_item = new ModItem("copper_door_item").setCreativeTab(ModTabs.creativeTabBuilding);
    public static Item tin_door_item = new ModItem("tin_door_item").setCreativeTab(ModTabs.creativeTabBuilding);
    public static Item bronze_door_item = new ModItem("bronze_door_item").setCreativeTab(ModTabs.creativeTabBuilding);
    public static Item amethyst_door_item = new ModItem("amethyst_door_item").setCreativeTab(ModTabs.creativeTabBuilding);
    public static Item wooden_pattern = new ModItem("wooden_pattern").setCreativeTab(ModTabs.creativeTab);
    public static Item wooden_pattern_bars = new ModItem("wooden_pattern_bars").setCreativeTab(ModTabs.creativeTab);
    public static Item wooden_pattern_button = new ModItem("wooden_pattern_button").setCreativeTab(ModTabs.creativeTab);
    public static Item wooden_pattern_pressure_plate = new ModItem("wooden_pattern_pressure_plate").setCreativeTab(ModTabs.creativeTab);
    public static Item wooden_pattern_trapdoor = new ModItem("wooden_pattern_trapdoor").setCreativeTab(ModTabs.creativeTab);
    public static Item wooden_pattern_wall = new ModItem("wooden_pattern_wall").setCreativeTab(ModTabs.creativeTab);
    public static Item wooden_pattern_fence = new ModItem("wooden_pattern_fence").setCreativeTab(ModTabs.creativeTab);
    public static Item wooden_pattern_fence_gate = new ModItem("wooden_pattern_fence_gate").setCreativeTab(ModTabs.creativeTab);
    public static Item wooden_pattern_stairs = new ModItem("wooden_pattern_stairs").setCreativeTab(ModTabs.creativeTab);
    public static Item portable_furnace = (new PortableFurnace("portable_furnace"));

    /**
     * Weapons
     */
    public static Item copper_sword = new Sword("copper_sword", copperTool, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_sword = new Sword("bronze_sword", bronzeTool, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_sword = new Sword("jade_sword", jadeTool, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_sword = new Sword("amethyst_sword", amethystTool, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);

    public static Item stone_bow = new Bow("stone_bow", 132, Item.getItemFromBlock(Blocks.STONE)).setCreativeTab(ModTabs.creativeTabTools);
    public static Item iron_bow = new Bow("iron_bow", 238, Items.IRON_INGOT).setCreativeTab(ModTabs.creativeTabTools);
    public static Item gold_bow = new Bow("gold_bow", 275, Items.GOLD_INGOT).setCreativeTab(ModTabs.creativeTabTools);
    public static Item diamond_bow = new Bow("diamond_bow", 1562, Items.DIAMOND).setCreativeTab(ModTabs.creativeTabTools);
    public static Item copper_bow = new Bow("copper_bow", 170, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_bow = new Bow("bronze_bow", 250, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_bow = new Bow("jade_bow", 2000, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_bow = new Bow("amethyst_bow", 2000, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    public static Item op_bow = new Bow("op_bow", 0, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);

    /**
     * Armor
     */
    public static Item stone_shield = new Shield(132, "stone_shield", ModTabs.creativeTabTools);
    public static Item iron_shield = new Shield(238, "iron_shield", ModTabs.creativeTabTools);
    public static Item gold_shield = new Shield(275, "gold_shield", ModTabs.creativeTabTools);
    public static Item diamond_shield = new Shield(1562, "diamond_shield", ModTabs.creativeTabTools);
    public static Item copper_shield = new Shield(170, "copper_shield", ModTabs.creativeTabTools);
    public static Item bronze_shield = new Shield(250, "bronze_shield", ModTabs.creativeTabTools);
    public static Item jade_shield = new Shield(2000, "jade_shield", ModTabs.creativeTabTools);
    public static Item amethyst_shield = new Shield(2000, "amethyst_shield", ModTabs.creativeTabTools);

    public static Item copper_helmet = new Armour("copper_helmet", copperArmour, 1, EntityEquipmentSlot.HEAD, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item copper_chestplate = new Armour("copper_chestplate", copperArmour, 1, EntityEquipmentSlot.CHEST, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item copper_leggings = new Armour("copper_leggings", copperArmour, 2, EntityEquipmentSlot.LEGS, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item copper_boots = new Armour("copper_boots", copperArmour, 1, EntityEquipmentSlot.FEET, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_helmet = new Armour("bronze_helmet", bronzeArmour, 1, EntityEquipmentSlot.HEAD, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_chestplate = new Armour("bronze_chestplate", bronzeArmour, 1, EntityEquipmentSlot.CHEST, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_leggings = new Armour("bronze_leggings", bronzeArmour, 2, EntityEquipmentSlot.LEGS, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_boots = new Armour("bronze_boots", bronzeArmour, 1, EntityEquipmentSlot.FEET, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_helmet = new Armour("jade_helmet", jadeArmour, 1, EntityEquipmentSlot.HEAD, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_chestplate = new Armour("jade_chestplate", jadeArmour, 1, EntityEquipmentSlot.CHEST, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_leggings = new Armour("jade_leggings", jadeArmour, 2, EntityEquipmentSlot.LEGS, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_boots = new Armour("jade_boots", jadeArmour, 1, EntityEquipmentSlot.FEET, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_helmet = new Armour("amethyst_helmet", amethystArmour, 1, EntityEquipmentSlot.HEAD, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_chestplate = new Armour("amethyst_chestplate", amethystArmour, 1, EntityEquipmentSlot.CHEST, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_leggings = new Armour("amethyst_leggings", amethystArmour, 2, EntityEquipmentSlot.LEGS, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_boots = new Armour("amethyst_boots", amethystArmour, 1, EntityEquipmentSlot.FEET, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);

    /**
     * Tools
     */
    public static Item copper_PickAxe = new PickAxe("copper_PickAxe", copperTool, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_PickAxe = new PickAxe("bronze_PickAxe", bronzeTool, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_PickAxe = new PickAxe("jade_PickAxe", jadeTool, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_PickAxe = new PickAxe("amethyst_PickAxe", amethystTool, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    
    public static Item flint_and_wood = new FlintAndIngot("flint_and_wood", 59).setCreativeTab(ModTabs.creativeTabTools);
    public static Item flint_and_stone = new FlintAndIngot("flint_and_stone", 132).setCreativeTab(ModTabs.creativeTabTools);
    public static Item flint_and_gold = new FlintAndIngot("flint_and_gold", 275).setCreativeTab(ModTabs.creativeTabTools);
    public static Item flint_and_diamond = new FlintAndIngot("flint_and_diamond", 1562).setCreativeTab(ModTabs.creativeTabTools);
    public static Item flint_and_copper = new FlintAndIngot("flint_and_copper", 170).setCreativeTab(ModTabs.creativeTabTools);
    public static Item flint_and_bronze = new FlintAndIngot("flint_and_bronze", 250).setCreativeTab(ModTabs.creativeTabTools);
    public static Item flint_and_jade = new FlintAndIngot("flint_and_jade", 2000).setCreativeTab(ModTabs.creativeTabTools);
    public static Item flint_and_amethyst = new FlintAndIngot("flint_and_amethyst", 2000).setCreativeTab(ModTabs.creativeTabTools);
    
    public static Item copper_axe = new Axe("copper_axe", copperTool, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_axe = new Axe("bronze_axe", bronzeTool, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_axe = new Axe("jade_axe", jadeTool, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_axe = new Axe("amethyst_axe", amethystTool, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    
    public static Item copper_shovel = new Shovel("copper_shovel", copperTool, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_shovel = new Shovel("bronze_shovel", bronzeTool, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_shovel = new Shovel("jade_shovel", jadeTool, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_shovel = new Shovel("amethyst_shovel", amethystTool, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    
    public static Item copper_hoe = new Hoe("copper_hoe", copperTool, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_hoe = new Hoe("bronze_hoe", bronzeTool, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_hoe = new Hoe("jade_hoe", jadeTool, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_hoe = new Hoe("amethyst_hoe", amethystTool, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    
    public static Item diamond_MultiTool = new MultiTool("diamond_MultiTool", Item.ToolMaterial.DIAMOND, Items.DIAMOND).setCreativeTab(ModTabs.creativeTabTools);
    public static Item copper_MultiTool = new MultiTool("copper_MultiTool", copperTool, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_MultiTool = new MultiTool("bronze_MultiTool", bronzeTool, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_MultiTool = new MultiTool("jade_MultiTool", jadeTool, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_MultiTool = new MultiTool("amethyst_MultiTool", amethystTool, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    public static Item op_MultiTool = new MultiTool("op_MultiTool", opTool, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);
    
    public static Item wooden_hammer = new Hammer("wooden_hammer", Item.ToolMaterial.WOOD, 59).setCreativeTab(ModTabs.creativeTabTools);
    public static Item stone_hammer = new Hammer("stone_hammer", Item.ToolMaterial.STONE, 132).setCreativeTab(ModTabs.creativeTabTools);
    public static Item iron_hammer = new Hammer("iron_hammer", Item.ToolMaterial.IRON, 238).setCreativeTab(ModTabs.creativeTabTools);
    public static Item gold_hammer = new Hammer("gold_hammer", Item.ToolMaterial.GOLD, 275).setCreativeTab(ModTabs.creativeTabTools);
    public static Item diamond_hammer = new Hammer("diamond_hammer", Item.ToolMaterial.DIAMOND, 1562).setCreativeTab(ModTabs.creativeTabTools);
    public static Item copper_hammer = new Hammer("copper_hammer", copperTool, 170).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_hammer = new Hammer("bronze_hammer", bronzeTool, 250).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_hammer = new Hammer("jade_hammer", bronzeTool, 2000).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_hammer = new Hammer("amethyst_hammer", bronzeTool, 2000).setCreativeTab(ModTabs.creativeTabTools);
    
    public static Item wooden_scythe = new Scythe("wooden_scythe", Item.ToolMaterial.WOOD, 59).setCreativeTab(ModTabs.creativeTabTools);
    public static Item stone_scythe = new Scythe("stone_scythe", Item.ToolMaterial.STONE, 132).setCreativeTab(ModTabs.creativeTabTools);
    public static Item iron_scythe = new Scythe("iron_scythe", Item.ToolMaterial.IRON, 238).setCreativeTab(ModTabs.creativeTabTools);
    public static Item gold_scythe = new Scythe("gold_scythe", Item.ToolMaterial.GOLD, 275).setCreativeTab(ModTabs.creativeTabTools);
    public static Item diamond_scythe = new Scythe("diamond_scythe", Item.ToolMaterial.DIAMOND, 1562).setCreativeTab(ModTabs.creativeTabTools);
    public static Item copper_scythe = new Scythe("copper_scythe", copperTool, 170).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_scythe = new Scythe("bronze_scythe", bronzeTool, 250).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_scythe = new Scythe("jade_scythe", bronzeTool, 2000).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_scythe = new Scythe("amethyst_scythe", bronzeTool, 2000).setCreativeTab(ModTabs.creativeTabTools);
    
    public static Item wooden_shears = new Shears("wooden_shears", 0, 59, Item.getItemFromBlock(Blocks.PLANKS)).setCreativeTab(ModTabs.creativeTabTools);
    public static Item stone_shears = new Shears("stone_shears", 0, 132, Item.getItemFromBlock(Blocks.STONE)).setCreativeTab(ModTabs.creativeTabTools);
    public static Item gold_shears = new Shears("gold_shears", 1, 275, Items.GOLD_INGOT).setCreativeTab(ModTabs.creativeTabTools);
    public static Item diamond_shears = new Shears("diamond_shears", 2, 1562, Items.DIAMOND).setCreativeTab(ModTabs.creativeTabTools);
    public static Item copper_shears = new Shears("copper_shears", 1, 170, ModItems.copper_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item bronze_shears = new Shears("bronze_shears", 1, 250, ModItems.bronze_ingot).setCreativeTab(ModTabs.creativeTabTools);
    public static Item jade_shears = new Shears("jade_shears", 3, 2000, ModItems.jade).setCreativeTab(ModTabs.creativeTabTools);
    public static Item amethyst_shears = new Shears("amethyst_shears", 3, 2000, ModItems.amethyst).setCreativeTab(ModTabs.creativeTabTools);

    public static void setupRepairItemForToolsAndArmour() {
        copperTool.setRepairItem(new ItemStack(copper_ingot));
        copperArmour.repairMaterial = new ItemStack(copper_ingot);
        bronzeTool.setRepairItem(new ItemStack(bronze_ingot));
        bronzeArmour.repairMaterial = new ItemStack(bronze_ingot);
        jadeTool.setRepairItem(new ItemStack(jade));
        jadeArmour.repairMaterial = new ItemStack(jade);
        amethystTool.setRepairItem(new ItemStack(amethyst));
        amethystArmour.repairMaterial = new ItemStack(amethyst);
    }
}
