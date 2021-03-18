/*
 * Copyright (c) 2021. MIT License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class NullBlock extends Block {

    public NullBlock(String name, ItemGroup group, float hard) {
        super(Properties.create(Material.BARRIER).hardnessAndResistance(hard));
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));
    }
}
