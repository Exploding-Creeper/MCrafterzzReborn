/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;

public class PressurePlate extends BlockPressurePlate {

    boolean transparent;

    public PressurePlate(String name, Material material, SoundType stepSound, String tool, int toolLevel) {
        super(material, Sensitivity.MOBS);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    public PressurePlate(String name, Material material, boolean unbreakeble, boolean transparent) {
        super(material, Sensitivity.MOBS);
        if (unbreakeble) {
            this.setBlockUnbreakable();
        }

        this.transparent = transparent;
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return this.transparent ? BlockRenderLayer.CUTOUT_MIPPED : BlockRenderLayer.CUTOUT;
    }
}