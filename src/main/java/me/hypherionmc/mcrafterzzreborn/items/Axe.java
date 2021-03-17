/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;


import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;

public class Axe extends AxeItem {

    public Item repairItem;

    public Axe(String name, ItemTier tier, Item repairItem) {
        super(tier, tier.getAttackDamage(), -3.0F, new Properties());
        this.repairItem = repairItem;
        this.setRegistryName(name);

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}
