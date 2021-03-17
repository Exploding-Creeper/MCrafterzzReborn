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

public class ColorChangingClass extends Block {

    public ColorChangingClass(String name, Material material, SoundType stepSound, MaterialColor mapColor) {
        super(Properties.create(material, mapColor).sound(stepSound));
        this.setRegistryName(name);

    }

    /*@SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }*/

}
