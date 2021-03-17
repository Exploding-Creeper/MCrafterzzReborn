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
import net.minecraftforge.common.extensions.IForgeBlockState;

public class SimpleBlock extends Block {
    public boolean transparent;

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, MaterialColor mapColour) {
        super(Properties.create(material, mapColour).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel));
        this.setRegistryName(name);

    }

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, boolean unbreakeble) {
        super(Properties.create(material).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel));
        if (unbreakeble) {
            //this.setBlockUnbreakable();
        }
        this.setRegistryName(name);

    }

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, boolean transparent, MaterialColor mapColour) {
        super(Properties.create(material, mapColour).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel).setOpaque(IForgeBlockState::isAir));
        this.transparent = transparent;
        this.setRegistryName(name);
    }

    public SimpleBlock(String name, Material material, SoundType stepSound, boolean transparent, MaterialColor mapColour) {
        super(Properties.create(material, mapColour).sound(stepSound).setOpaque(IForgeBlockState::isAir));
        this.transparent = transparent;
        this.setRegistryName(name);

    }

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, boolean unbreakeble, float glowing, boolean transparent) {
        super(Properties.create(material).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel)/*.setLightLevel(1)*/);
        if (unbreakeble) {
            //this.setBlockUnbreakable();
        }
        this.transparent = transparent;
        this.setRegistryName(name);

    }

    /*@SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getRenderLayer() {
        return this.transparent ? BlockRenderLayer.CUTOUT : BlockRenderLayer.SOLID;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return !this.transparent;
    }*/
}