/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class PressurePlate extends BlockPressurePlate {

    boolean transparent;

    public PressurePlate(Material material, SoundType stepSound, String tool, int toolLevel) {
        super(material, Sensitivity.MOBS);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);

    }

    public PressurePlate(Material material, boolean unbreakeble, boolean transparent) {
        super(material, Sensitivity.MOBS);
        if (unbreakeble) {
            this.setBlockUnbreakable();
        }

        this.transparent = transparent;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return this.transparent ? BlockRenderLayer.CUTOUT_MIPPED : BlockRenderLayer.CUTOUT;
    }
}