/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Armour extends ItemArmor {

    public Item repairItem;

    public Armour(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, Item repairItem) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.repairItem = repairItem;

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }

}
