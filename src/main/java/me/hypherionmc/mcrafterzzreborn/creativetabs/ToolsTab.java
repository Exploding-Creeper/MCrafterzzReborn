/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.creativetabs;

import me.hypherionmc.mcrafterzzreborn.modelements.ModElementsToolsArmour;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToolsTab extends CreativeTabs {

    public ToolsTab(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModElementsToolsArmour.amethyst_axe);
    }
}