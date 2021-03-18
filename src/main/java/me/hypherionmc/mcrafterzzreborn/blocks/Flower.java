/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import me.hypherionmc.mcrafterzzreborn.init.ModTabs;
import net.minecraft.block.BushBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class Flower extends BushBlock {

    public Flower(String name) {
        super(Properties.create(Material.PLANTS));
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(ModTabs.creativeTabWorld)));

    }

}
