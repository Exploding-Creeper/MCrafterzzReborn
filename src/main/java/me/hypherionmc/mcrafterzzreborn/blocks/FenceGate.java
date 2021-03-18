/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class FenceGate extends FenceGateBlock {

    public FenceGate(String name, Material material, SoundType stepSound, String tool, int toolLevel, MaterialColor mapColour, ItemGroup group, float hardness, float resist) {
        super(Properties.create(material, mapColour).harvestLevel(Integer.parseInt(tool)).harvestLevel(toolLevel).sound(stepSound).hardnessAndResistance(hardness, resist));
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));

    }

}
