/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ShovelItem;

public class Shovel extends ShovelItem {

    public Item repairItem;

    public Shovel(String name, ItemTier material, Item repairItem) {
        super(material, material.getAttackDamage(), 1f, new Properties());
        this.repairItem = repairItem;
        this.setRegistryName(name);

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}
