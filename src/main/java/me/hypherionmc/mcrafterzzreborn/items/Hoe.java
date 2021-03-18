/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.item.*;

public class Hoe extends HoeItem {

    // THE TOOL, NOT MY CHEATING EX

    public Item repairItem;

    public Hoe(IItemTier material, Item repairItem, ItemGroup group) {
        super(material, (int) material.getAttackDamage(), 1.0f, new Properties().group(group));
        this.repairItem = repairItem;

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}
