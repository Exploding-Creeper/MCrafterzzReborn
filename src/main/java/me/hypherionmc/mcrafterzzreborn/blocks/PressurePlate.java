/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class PressurePlate extends PressurePlateBlock {

    boolean transparent;

    public PressurePlate(String name, Material material, SoundType stepSound, String tool, int toolLevel, ItemGroup group, float hardness, float resistance) {
        super(Sensitivity.MOBS, Properties.create(material).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel).hardnessAndResistance(hardness, resistance));
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));
    }

    public PressurePlate(String name, Material material, boolean unbreakeble, boolean transparent, ItemGroup group, float hardness, float resistance) {
        super(Sensitivity.MOBS, Properties.create(material).hardnessAndResistance(hardness, resistance));

        this.transparent = transparent;
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));

    }

}