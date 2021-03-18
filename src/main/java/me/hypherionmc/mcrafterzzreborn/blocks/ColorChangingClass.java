/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ColorChangingClass extends Block {

    public ColorChangingClass(String name, Material material, SoundType stepSound, MaterialColor mapColor, ItemGroup group, float hardness, float rest) {
        super(Properties.create(material, mapColor).sound(stepSound).hardnessAndResistance(hardness, rest));
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));

    }

    /*@SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }*/

}
