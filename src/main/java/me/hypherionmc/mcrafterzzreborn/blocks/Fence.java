/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class Fence extends BlockFence {


    public Fence(Material material, SoundType stepSound, String tool, int toolLevel, MapColor mapColour) {
        super(material, mapColour);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);

    }
}
