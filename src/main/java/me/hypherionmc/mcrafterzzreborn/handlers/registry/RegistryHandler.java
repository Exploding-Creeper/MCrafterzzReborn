/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.handlers.registry;

import me.hypherionmc.mcrafterzzreborn.MCrafterzz;
import me.hypherionmc.mcrafterzzreborn.config.Config;
import me.hypherionmc.mcrafterzzreborn.gui.PortableFurnaceGuiHandler;
import me.hypherionmc.mcrafterzzreborn.handlers.event.ServerTickHandler;
import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import me.hypherionmc.mcrafterzzreborn.init.ModTabs;
import me.hypherionmc.mcrafterzzreborn.items.Shield;
import me.hypherionmc.mcrafterzzreborn.network.NetworkHandler;
import me.hypherionmc.mcrafterzzreborn.recipes.RecipeRemover;
import me.hypherionmc.mcrafterzzreborn.util.IHasCustomRender;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        MCrafterzz.logger.info("Registering Items...");
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        MCrafterzz.logger.info("Registering Blocks...");
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        MCrafterzz.logger.info("Registering Item Models");
        for (Item item : ModItems.ITEMS) {
            if (item instanceof IHasCustomRender) {
                ((IHasCustomRender)item).registerRenderers();
            } else {
                ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
            }
        }

        MCrafterzz.logger.info("Registering Block Models");
        for (Block block : ModBlocks.BLOCKS) {
            if (block instanceof IHasCustomRender) {
                ((IHasCustomRender)block).registerRenderers();
            } else {
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
            }
        }

    }

    public static void registerTE() {

    }

    public static void registerNetwork() {
        new NetworkHandler();
    }

    public static void registerOreDictionary() {
        OreDictionary.registerOre("copperIngot", ModItems.copper_ingot);
        OreDictionary.registerOre("tinIngot", ModItems.tin_ingot);
        OreDictionary.registerOre("bronzeIngot", ModItems.bronze_ingot);
        OreDictionary.registerOre("jade", ModItems.jade);
        OreDictionary.registerOre("copperOre", ModBlocks.copper_ore);
        OreDictionary.registerOre("tinOre", ModBlocks.tin_ore);
        OreDictionary.registerOre("jadeOre", ModBlocks.jade_ore);
        OreDictionary.registerOre("amethystOre", ModBlocks.amethyst_ore);
    }

    public static void removeCrafting() {
        if (Config.crafting) {
            RecipeRemover.removeCraftingRecipeBlockWithMetadata(Blocks.STONE, 2);
            RecipeRemover.removeCraftingRecipeBlockWithMetadata(Blocks.STONE, 4);
            RecipeRemover.removeCraftingRecipeBlockWithMetadata(Blocks.STONE, 6);
        }

    }

    public static void registerGuiHandlers() {
        NetworkRegistry.INSTANCE.registerGuiHandler(MCrafterzz.instance, new PortableFurnaceGuiHandler());
    }

    public static void registerEventHandlers() {
        MinecraftForge.EVENT_BUS.register(new Shield(0, "", ModTabs.creativeTab));
        MinecraftForge.EVENT_BUS.register(new ServerTickHandler());
    }

}
