/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.Teleporter;

public class CommandTpDimension extends CommandBase {

    @Override
    public int getRequiredPermissionLevel() {
        return 2;
    }

    @Override
    public String getName() {
        return "tpdimension";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "commands.tpdimension.usage";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        EntityPlayerMP player = (EntityPlayerMP)sender.getCommandSenderEntity();
        Entity entity = sender.getCommandSenderEntity();
        int i = 0;
        if (args.length < 1) {
            throw new WrongUsageException("commands.tpdimension.usage", new Object[0]);
        } else if (args.length < i + 1) {
            throw new WrongUsageException("commands.tpdimension.usage", new Object[0]);
        } else {
            if (entity.world != null) {
                int j;
                if (args.length > 1) {
                    j = parseInt(args[1]);
                    player.server.getPlayerList().transferPlayerToDimension(player, j, new Teleporter(player.server.getWorld(j)));
                    notifyCommandListener(sender, this, "commands.tpdimension.success", new Object[]{Integer.valueOf(i)});
                } else {
                    j = parseInt(args[0]);
                    player.server.getPlayerList().transferPlayerToDimension(player, j, new Teleporter(player.server.getWorld(j)));
                    notifyCommandListener(sender, this, "commands.tpdimension.success", new Object[]{Integer.valueOf(i)});
                }
            }

        }
    }
}
