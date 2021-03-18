/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModWall extends WallBlock {

    public ModWall(String name, Block modelBlock, float hardness, float resistance, MaterialColor mapColour, ItemGroup group) {
        super(Properties.create(modelBlock.getDefaultState().getMaterial(), mapColour)
                .hardnessAndResistance(hardness, resistance)
                .sound(modelBlock.getSoundType(modelBlock.getDefaultState())));
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));

    }

}