/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class PickAxe extends ItemPickaxe {

    public Item repairItem;

    public PickAxe(ToolMaterial material, Item repairItem) {
        super(material);
        this.repairItem = repairItem;

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}