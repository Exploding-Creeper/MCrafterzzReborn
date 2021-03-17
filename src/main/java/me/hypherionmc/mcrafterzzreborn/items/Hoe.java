/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;

public class Hoe extends HoeItem {

    // THE TOOL, NOT MY CHEATING EX

    public Item repairItem;

    public Hoe(String name, ItemTier material, Item repairItem) {
        super(material, (int) material.getAttackDamage(), 1.0f, new Properties());
        this.repairItem = repairItem;
        this.setRegistryName(name);

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}
