/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Bars extends BlockPane {

    public Bars(Material material, SoundType stepSound, String tool, int toolLevel, boolean canDrop) {
        super(material, canDrop);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);

    }
}
