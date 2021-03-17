/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PressurePlate extends PressurePlateBlock {

    boolean transparent;

    public PressurePlate(String name, Material material, SoundType stepSound, String tool, int toolLevel) {
        super(Sensitivity.MOBS, Properties.create(material).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel));
        this.setRegistryName(name);

    }

    public PressurePlate(String name, Material material, boolean unbreakeble, boolean transparent) {
        super(Sensitivity.MOBS, Properties.create(material));

        this.transparent = transparent;
        this.setRegistryName(name);

    }

}