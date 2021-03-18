/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;


import net.minecraft.item.*;

public class Axe extends AxeItem {

    public Item repairItem;

    public Axe(IItemTier tier, Item repairItem, ItemGroup group) {
        super(tier, tier.getAttackDamage(), -3.0F, new Properties().group(group));
        this.repairItem = repairItem;

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}
