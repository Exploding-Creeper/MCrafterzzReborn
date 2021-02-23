/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SimpleBlock extends Block {
    public boolean transparent;

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, MapColor mapColour) {
        super(material, mapColour);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));

    }

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, boolean unbreakeble) {
        super(material);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);
        if (unbreakeble) {
            this.setBlockUnbreakable();
        }
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));

    }

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, boolean transparent, MapColor mapColour) {
        super(material, mapColour);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);
        this.setLightOpacity(1);
        this.transparent = transparent;
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    public SimpleBlock(String name, Material material, SoundType stepSound, boolean transparent, MapColor mapColour) {
        super(material, mapColour);
        this.setSoundType(stepSound);
        this.setLightOpacity(1);
        this.transparent = transparent;
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, boolean unbreakeble, float glowing, boolean transparent) {
        super(material);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);
        this.setLightOpacity(1);
        if (unbreakeble) {
            this.setBlockUnbreakable();
        }

        this.setLightLevel(glowing);
        this.transparent = transparent;
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getRenderLayer() {
        return this.transparent ? BlockRenderLayer.CUTOUT : BlockRenderLayer.SOLID;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return !this.transparent;
    }
}