/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.handlers.event;

import me.hypherionmc.mcrafterzzreborn.network.NetworkHandler;
import me.hypherionmc.mcrafterzzreborn.network.packets.WorldSavePacket;
import me.hypherionmc.mcrafterzzreborn.portable.PortableFurnaceMachine;
import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.List;

public class ServerTickHandler {

    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            WorldSaveManager.getINSTANCE();

            List<PortableFurnaceMachine> portableFurnaceMachines = WorldSaveManager.portableFurnaces;

            NBTTagCompound compound;
            for (PortableFurnaceMachine machine : portableFurnaceMachines) {
                machine.update();
                compound = new NBTTagCompound();
                machine.writeToNBT(compound);

                if (FMLCommonHandler.instance().getMinecraftServerInstance().getCurrentPlayerCount() != 0) {
                    NetworkHandler.network.sendToAll(new WorldSavePacket(compound));
                }
            }
        }
    }
}
