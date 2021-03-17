/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.network.packets;

import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;


public class WorldSavePacket {

    private CompoundNBT nbtTagCompound;

    public WorldSavePacket(PacketBuffer buffer) {
        nbtTagCompound = buffer.readCompoundTag();
    }

    public WorldSavePacket(CompoundNBT compound) {
        this.nbtTagCompound = compound;
    }

    public void toBytes(PacketBuffer buf) {
        buf.writeCompoundTag(nbtTagCompound);
    }

    public boolean handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            if (WorldSaveManager.getInstance() != null) {
                WorldSaveManager.setFurnaceNBT(nbtTagCompound);
            } else {
                WorldSaveManager.setInstance();
                WorldSaveManager.setFurnaceNBT(nbtTagCompound);
            }
        });
        return true;
    }
}
