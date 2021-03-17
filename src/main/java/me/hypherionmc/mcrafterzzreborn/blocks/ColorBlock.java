/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class ColorBlock extends Block {

    public ColorBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, MaterialColor color) {
        super(Properties.create(material, color).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel));
        this.setRegistryName(name);

    }

}
