/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class FenceGate extends FenceGateBlock {

    public FenceGate(String name, Material material, SoundType stepSound, String tool, int toolLevel, MaterialColor mapColour) {
        super(Properties.create(material, mapColour).harvestLevel(Integer.parseInt(tool)).harvestLevel(toolLevel).sound(stepSound));
        this.setRegistryName(name);

    }

}
