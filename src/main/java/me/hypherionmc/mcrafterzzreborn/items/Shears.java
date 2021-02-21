/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

public class Shears extends ItemShears {

    public Item repairItem;

    public Shears(int level, int durability, Item repairItem) {
        this.setHarvestLevel("shears", level);
        this.setMaxDamage(durability);
        this.repairItem = repairItem;

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}