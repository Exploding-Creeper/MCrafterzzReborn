/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */
package me.hypherionmc.mcrafterzzreborn.proxy;

import me.hypherionmc.mcrafterzzreborn.commands.CommandMCrafterzzMod;
import me.hypherionmc.mcrafterzzreborn.commands.CommandSetBlocks;
import me.hypherionmc.mcrafterzzreborn.commands.CommandTpDimension;
import me.hypherionmc.mcrafterzzreborn.config.Config;
import me.hypherionmc.mcrafterzzreborn.eventhandlers.ServerTickHandler;
import me.hypherionmc.mcrafterzzreborn.modelements.ModElements;
import me.hypherionmc.mcrafterzzreborn.modelements.ModElementsSmallerBlocks;
import me.hypherionmc.mcrafterzzreborn.modelements.ModElementsToolsArmour;
import me.hypherionmc.mcrafterzzreborn.network.NetworkHandler;
import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import me.hypherionmc.mcrafterzzreborn.worldgen.ModFlowerGenerator;
import me.hypherionmc.mcrafterzzreborn.worldgen.ModOreGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(Config.instance);
        Config.init(event.getSuggestedConfigurationFile());
        Config.syncConfig();

        ModElements.createBlocksAndItems();
        ModElements.registerItemsAndBlocks();

        ModElementsSmallerBlocks.createBlocksAndItems();
        ModElementsSmallerBlocks.registerItemsAndBlocks();

        ModElementsToolsArmour.createBlocksAndItems();
        ModElementsToolsArmour.registerItemsAndBlocks();
        ModElementsToolsArmour.setupRepairItemForToolsAndArmour();
        ModElements.removeCrafting();
        ModElements.crafting();
        ModElements.registerAchievements();
        ModElements.registerStats();

        ModElements.registerEventHandlers();
        ModElementsSmallerBlocks.crafting();
        ModElementsToolsArmour.crafting();
    }

    public void init(FMLInitializationEvent event) {
        ModElements.registerRenders();
        ModElements.registerOreDictionary();
        ModElementsSmallerBlocks.registerRenders();
        ModElementsToolsArmour.registerRenders();
        GameRegistry.registerWorldGenerator(new ModOreGenerator(), 0);
        GameRegistry.registerWorldGenerator(new ModFlowerGenerator(), 100);
        //GameRegistry.registerTileEntity(TileEntityCrusher.class, "mm:tecrusher");
        MinecraftForge.EVENT_BUS.register(new ServerTickHandler());

        ModElements.registerGuiHandlers();
    }

    public void postInit(FMLPostInitializationEvent event) {
        new NetworkHandler();
    }

    public void serverStart(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandMCrafterzzMod());
        event.registerServerCommand(new CommandSetBlocks());
        event.registerServerCommand(new CommandTpDimension());

        WorldSaveManager.resetAll();
        WorldSaveManager.setINSTANCE(event.getServer().getEntityWorld());
    }
}
