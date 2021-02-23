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
import me.hypherionmc.mcrafterzzreborn.handlers.event.ServerTickHandler;
import me.hypherionmc.mcrafterzzreborn.handlers.registry.RegistryHandler;
import me.hypherionmc.mcrafterzzreborn.init.ModBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModElementsSmallerBlocks;
import me.hypherionmc.mcrafterzzreborn.init.ModElementsToolsArmour;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import me.hypherionmc.mcrafterzzreborn.network.NetworkHandler;
import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import me.hypherionmc.mcrafterzzreborn.world.worldgen.ModFlowerGenerator;
import me.hypherionmc.mcrafterzzreborn.world.worldgen.ModOreGenerator;
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

        ModItems.setupRepairItemForToolsAndArmour();

        ModBlocks.crafting();

        RegistryHandler.registerEventHandlers();
        ModElementsSmallerBlocks.crafting();
        ModElementsToolsArmour.crafting();
    }

    public void init(FMLInitializationEvent event) {
        RegistryHandler.registerOreDictionary();
        GameRegistry.registerWorldGenerator(new ModOreGenerator(), 0);
        GameRegistry.registerWorldGenerator(new ModFlowerGenerator(), 100);

        RegistryHandler.registerTE();
        RegistryHandler.registerGuiHandlers();
    }

    public void postInit(FMLPostInitializationEvent event) {
        RegistryHandler.registerNetwork();
        RegistryHandler.removeCrafting();
    }

    public void serverStart(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandMCrafterzzMod());
        event.registerServerCommand(new CommandSetBlocks());
        event.registerServerCommand(new CommandTpDimension());

        WorldSaveManager.resetAll();
        WorldSaveManager.setINSTANCE(event.getServer().getEntityWorld());
    }
}
