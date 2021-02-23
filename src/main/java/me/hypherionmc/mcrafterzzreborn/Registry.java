/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn;

import com.google.common.base.Strings;
import me.hypherionmc.mcrafterzzreborn.util.IHasCustomRender;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;

public class Registry {

    public static Block registerBlock(Block block, String name) {
        if (block.getRegistryName() == null && Strings.isNullOrEmpty(name)) {
            throw new IllegalArgumentException("Attempted to register a Block with no name: " + block);
        } else if (block.getRegistryName() != null && !block.getRegistryName().toString().equals(name)) {
            throw new IllegalArgumentException("Attempted to register a Block with conflicting names. Old: " + block.getRegistryName() + " New: " + name);
        } else {
            return registerBlockAndItemBlock(block.getRegistryName() != null ? block : (Block)block.setRegistryName(name));
        }
    }

    public static Block registerBlockAndItemBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register((new ItemBlock(block)).setRegistryName(block.getRegistryName()));
        return block;
    }

    public static void registerItem(Item item, String name) {
        if (item.getRegistryName() == null && Strings.isNullOrEmpty(name)) {
            throw new IllegalArgumentException("Attempted to register a item with no name: " + item);
        } else if (item.getRegistryName() != null && !item.getRegistryName().toString().equals(name)) {
            throw new IllegalArgumentException("Attempted to register a item with conflicting names. Old: " + item.getRegistryName() + " New: " + name);
        } else {
            ForgeRegistries.ITEMS.register(item.getRegistryName() == null ? (Item)item.setRegistryName(name) : item);
        }
    }

    public static void registerRenderItem(Item item) {
        if (item instanceof IHasCustomRender) {
            ((IHasCustomRender)item).registerRenderers();
        } else if (!(item instanceof IHasCustomRender)) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("mm:" + item.getTranslationKey().substring(5), "inventory"));
        }
    }

    public static void registerRenderBlock(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("mm:" + Item.getItemFromBlock(block).getTranslationKey().substring(5), "inventory"));
    }

    public static void registerOreOreDictionary(String name, Item item) {
        OreDictionary.registerOre(name, item);
    }

    public static void registerOreOreDictionary(String name, Block block) {
        OreDictionary.registerOre(name, block);
    }

}
