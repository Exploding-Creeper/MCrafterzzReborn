/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.network.packets;

import io.netty.buffer.ByteBuf;
import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class WorldSavePacket implements IMessage {

    private NBTTagCompound nbtTagCompound;

    public WorldSavePacket() {
    }

    public WorldSavePacket(NBTTagCompound compound) {
        this.nbtTagCompound = compound;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.nbtTagCompound = ByteBufUtils.readTag(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        ByteBufUtils.writeTag(buf, nbtTagCompound);
    }

    public void execute(MessageContext ctx) {
        if (ctx.side == Side.CLIENT && !Minecraft.getMinecraft().isSingleplayer()) {
            if (WorldSaveManager.getInstance() != null) {
                WorldSaveManager.setFurnaceNBT(nbtTagCompound);
            } else {
                WorldSaveManager.setInstance();
                WorldSaveManager.setFurnaceNBT(nbtTagCompound);
            }
        }
    }

    public static class Handler implements IMessageHandler<WorldSavePacket, IMessage> {

        public Handler() { }

        public IMessage onMessage(WorldSavePacket packet, MessageContext context) {
            packet.execute(context);
            return null;
        }
    }
}
