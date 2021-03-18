/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.item.*;

public class Shovel extends ShovelItem {

    public Item repairItem;

    public Shovel(IItemTier material, Item repairItem, ItemGroup group) {
        super(material, material.getAttackDamage(), 1f, new Properties().group(group));
        this.repairItem = repairItem;

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}
