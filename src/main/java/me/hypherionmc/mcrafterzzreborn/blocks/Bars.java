/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.PaneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Bars extends PaneBlock {

    public Bars(String name, Material material, SoundType stepSound, String tool, int toolLevel, boolean canDrop) {
        super(Properties.create(material).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel));
        this.setRegistryName(name);

    }
}
