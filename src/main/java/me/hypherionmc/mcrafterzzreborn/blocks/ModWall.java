/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.MaterialColor;

public class ModWall extends WallBlock {

    public ModWall(String name, Block modelBlock, float hardness, float resistance, MaterialColor mapColour) {
        super(Properties.create(modelBlock.getDefaultState().getMaterial(), mapColour)
                .hardnessAndResistance(hardness, resistance)
                .sound(modelBlock.getSoundType(modelBlock.getDefaultState())));
        this.setRegistryName(name);

    }

}