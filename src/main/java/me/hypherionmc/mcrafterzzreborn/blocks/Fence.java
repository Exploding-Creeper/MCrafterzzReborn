/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class Fence extends FenceBlock {

    public Fence(String name, Material material, SoundType stepSound, String tool, int toolLevel, MaterialColor mapColour) {
        super(Properties.create(material, mapColour).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel));
        this.setRegistryName(name);

    }
}
