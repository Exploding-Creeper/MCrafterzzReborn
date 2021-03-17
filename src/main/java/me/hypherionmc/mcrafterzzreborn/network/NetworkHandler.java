/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.network;

import me.hypherionmc.mcrafterzzreborn.network.packets.WorldSavePacket;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;


public class NetworkHandler {

    public static SimpleChannel network;

    public NetworkHandler() {
        network = NetworkRegistry.newSimpleChannel(new ResourceLocation("mmreborn", "main"), () -> "1", "1"::equals, "1"::equals);
        
        network.messageBuilder(WorldSavePacket.class, 10).encoder(WorldSavePacket::toBytes).decoder(WorldSavePacket::new).consumer(WorldSavePacket::handle).add();
    }
}
