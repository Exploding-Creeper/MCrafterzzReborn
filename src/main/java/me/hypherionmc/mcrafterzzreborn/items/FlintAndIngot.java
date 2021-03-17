/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.item.FlintAndSteelItem;

public class FlintAndIngot extends FlintAndSteelItem {

    public FlintAndIngot(String name, int durabillity) {
        super(new Properties().maxDamage(durabillity));
        this.setRegistryName(name);

    }
}
