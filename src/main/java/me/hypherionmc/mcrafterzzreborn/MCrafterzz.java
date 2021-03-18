/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */
package me.hypherionmc.mcrafterzzreborn;

import me.hypherionmc.mcrafterzzreborn.commands.CommandMCrafterzzMod;
import me.hypherionmc.mcrafterzzreborn.commands.CommandSetBlocks;
import me.hypherionmc.mcrafterzzreborn.commands.CommandTpDimension;
import me.hypherionmc.mcrafterzzreborn.config.Config;
import me.hypherionmc.mcrafterzzreborn.handlers.registry.RegistryHandler;
import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import me.hypherionmc.mcrafterzzreborn.world.worldgen.ModFlowerGenerator;
import me.hypherionmc.mcrafterzzreborn.world.worldgen.ModOreGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(ModConstants.MODID)
public class MCrafterzz {

    public static Logger logger = LogManager.getLogger(ModConstants.MODID);

    public MCrafterzz() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::preInit);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::postInit);
    }

    public void preInit(FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(Config.instance);
        Config.init(event.getSuggestedConfigurationFile());
        Config.syncConfig();
        RegistryHandler.registerEventHandlers();

        RegistryHandler.registerOreDictionary();
        GameRegistry.registerWorldGenerator(new ModOreGenerator(), 0);
        GameRegistry.registerWorldGenerator(new ModFlowerGenerator(), 100);

        RegistryHandler.registerTE();
        RegistryHandler.registerGuiHandlers();

        RegistryHandler.registerNetwork();
    }


    public void postInit(FMLLoadCompleteEvent event) {
        WorldSaveManager.resetAll();
        WorldSaveManager.setInstance(event.getServer().getEntityWorld());
    }

    @SubscribeEvent
    public void serverStart(RegisterCommandsEvent event) {
        CommandMCrafterzzMod.register(event.getDispatcher());
        event.registerServerCommand(new CommandSetBlocks());
        event.registerServerCommand(new CommandTpDimension());

    }

}
