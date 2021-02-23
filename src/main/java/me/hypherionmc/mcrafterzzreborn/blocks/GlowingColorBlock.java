/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class GlowingColorBlock extends ColorBlock {

    public GlowingColorBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, MapColor mapColour) {
        super(name, material, stepSound, tool, toolLevel, mapColour);
        this.setLightLevel(1.0F);
    }

}
