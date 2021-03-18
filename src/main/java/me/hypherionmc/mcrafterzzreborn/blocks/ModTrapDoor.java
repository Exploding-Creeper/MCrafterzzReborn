/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class ModTrapDoor extends TrapDoorBlock {

    public ModTrapDoor(String name, Material material, SoundType stepSound, String tool, int toolLevel, ItemGroup group, float hardness, float resistance) {
        super(Properties.create(material).sound(stepSound).hardnessAndResistance(hardness, resistance).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel));
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));

    }

}