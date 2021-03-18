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
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlockState;

public class SimpleBlock extends Block {
    public boolean transparent;

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, MaterialColor mapColour, ItemGroup group, float hardness, float rest) {
        super(Properties.create(material, mapColour).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel).hardnessAndResistance(hardness, rest));
        this.setRegistryName(name);

        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));
    }

    public SimpleBlock(String name, Material material, SoundType stepSound, boolean transparent, MaterialColor mapColour, ItemGroup group) {
        super(Properties.create(material, mapColour).sound(stepSound).setOpaque(IForgeBlockState::isAir));
        this.transparent = transparent;
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));

    }

    public SimpleBlock(String name, Material material, SoundType stepSound, String tool, int toolLevel, boolean unbreakeble, float glowing, boolean transparent, ItemGroup group, float hardness) {
        super(Properties.create(material).sound(stepSound).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel).setLightLevel((state) -> { return (int) glowing; }).hardnessAndResistance(hardness));
        if (unbreakeble) {
            //this.setBlockUnbreakable();
        }
        this.transparent = transparent;
        ModItems.ITEMS.register(name, () -> new BlockItem(this, new Item.Properties().group(group)));

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