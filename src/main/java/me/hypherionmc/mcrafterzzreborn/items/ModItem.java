/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.item.Item;

public class ModItem extends Item {

    public ModItem(String name) {
        super(new Properties());
        this.setRegistryName(name);

    }
}
