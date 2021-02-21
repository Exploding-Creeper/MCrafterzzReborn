/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class Axe extends ItemAxe {

    public Item repairItem;

    public Axe(ToolMaterial material, Item repairItem) {
        super(material, material.getAttackDamage(), -3.0F);
        this.repairItem = repairItem;

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}
