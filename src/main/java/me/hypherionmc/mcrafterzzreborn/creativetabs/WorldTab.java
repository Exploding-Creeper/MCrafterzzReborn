/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.creativetabs;

import me.hypherionmc.mcrafterzzreborn.modelements.ModElements;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WorldTab extends CreativeTabs {

    public WorldTab(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Item.getItemFromBlock(ModElements.purple_tulip));
    }
}