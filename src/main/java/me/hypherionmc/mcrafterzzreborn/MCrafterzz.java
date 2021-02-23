/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */
package me.hypherionmc.mcrafterzzreborn;

import me.hypherionmc.mcrafterzzreborn.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(
        modid = ModConstants.MODID,
        guiFactory = ModConstants.GUI_FACTORY,
        updateJSON = ModConstants.UPDATE_URL,
        acceptedMinecraftVersions = ModConstants.MINECRAFT_VERSIONS
)
public class MCrafterzz {

    @Mod.Instance
    public static MCrafterzz instance;

    public static Logger logger = LogManager.getLogger(ModConstants.MODID);

    @SidedProxy(clientSide = ModConstants.CLIENT_PROXY, serverSide = ModConstants.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void serverStart(FMLServerStartingEvent event) {
        proxy.serverStart(event);
    }

}
