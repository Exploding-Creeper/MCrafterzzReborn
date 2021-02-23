/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class Bars extends BlockPane {

    public Bars(String name, Material material, SoundType stepSound, String tool, int toolLevel, boolean canDrop) {
        super(material, canDrop);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }
}
