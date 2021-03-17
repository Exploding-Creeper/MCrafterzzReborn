/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.handlers.event;

import me.hypherionmc.mcrafterzzreborn.network.NetworkHandler;
import me.hypherionmc.mcrafterzzreborn.network.packets.WorldSavePacket;
import me.hypherionmc.mcrafterzzreborn.machines.portable.PortableFurnaceMachine;
import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.network.PacketDistributor;

import java.util.List;

public class ServerTickHandler {

    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            WorldSaveManager.getInstance();

            List<PortableFurnaceMachine> portableFurnaceMachines = WorldSaveManager.portableFurnaces;

            CompoundNBT compound;
            for (PortableFurnaceMachine machine : portableFurnaceMachines) {
                machine.update();
                compound = new CompoundNBT();
                machine.writeToNBT(compound);

                if (FMLCommonHandler.instance().getMinecraftServerInstance().getCurrentPlayerCount() != 0) {
                    NetworkHandler.network.send(PacketDistributor.PLAYER.noArg(), new WorldSavePacket(compound));
                }
            }
        }
    }
}
