/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

public class Armour extends ArmorItem {

    public Item repairItem;

    public Armour(IArmorMaterial materialIn, int renderIndexIn, EquipmentSlotType equipmentSlotIn, Item repairItem, ItemGroup group) {
        super(materialIn, equipmentSlotIn, new Properties().group(group));
        this.repairItem = repairItem;

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }

}
