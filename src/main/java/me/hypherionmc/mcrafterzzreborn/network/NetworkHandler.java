/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.network;

import me.hypherionmc.mcrafterzzreborn.network.packets.WorldSavePacket;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {

    public static SimpleNetworkWrapper network;

    public NetworkHandler() {
        network = NetworkRegistry.INSTANCE.newSimpleChannel("mmreborn");
        network.registerMessage(WorldSavePacket.Handler.class, WorldSavePacket.class, 10, Side.CLIENT);
    }
}
