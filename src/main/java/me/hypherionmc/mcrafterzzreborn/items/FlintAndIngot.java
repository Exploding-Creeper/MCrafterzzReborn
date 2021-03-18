/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.item.FlintAndSteelItem;
import net.minecraft.item.ItemGroup;

public class FlintAndIngot extends FlintAndSteelItem {

    public FlintAndIngot(int durabillity, ItemGroup group) {
        super(new Properties().maxDamage(durabillity).group(group));

    }
}
