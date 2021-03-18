/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItem extends Item {

    public ModItem(ItemGroup group) {
        super(new Properties().group(group));

    }

    public ModItem(Properties properties, ItemGroup group) {
        super(properties.group(group));

    }
}
