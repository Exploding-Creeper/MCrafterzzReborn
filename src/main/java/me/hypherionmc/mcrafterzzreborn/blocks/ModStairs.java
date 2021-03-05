/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

public class ModStairs extends BlockStairs {

    public ModStairs(String name, IBlockState modelState, Material material) {
        super(modelState);
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

}