/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;

public class ModStairs extends StairsBlock {

    public ModStairs(String name, BlockState modelState, Material material) {
        super(modelState, Properties.create(material));
        this.setRegistryName(name);

    }

}