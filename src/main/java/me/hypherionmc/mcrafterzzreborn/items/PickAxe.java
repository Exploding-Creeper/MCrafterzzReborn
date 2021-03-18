/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.item.*;

public class PickAxe extends PickaxeItem {

    public Item repairItem;

    public PickAxe(IItemTier material, Item repairItem, ItemGroup group) {
        super(material, (int) material.getAttackDamage(), 1, new Properties().group(group));
        this.repairItem = repairItem;

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}