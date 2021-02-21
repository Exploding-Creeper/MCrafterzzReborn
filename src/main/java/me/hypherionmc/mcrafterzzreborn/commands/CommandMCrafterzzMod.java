/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;

public class CommandMCrafterzzMod extends CommandBase {


    @Override
    public String getName() {
        return "mm";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "mm";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (sender instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)sender;
            Style red = (new Style()).setColor(TextFormatting.DARK_RED);
            Style green = (new Style()).setColor(TextFormatting.DARK_GREEN);
            Style blue = (new Style()).setColor(TextFormatting.DARK_BLUE);
            Style aqua = (new Style()).setColor(TextFormatting.DARK_AQUA);
            Style purple = (new Style()).setColor(TextFormatting.DARK_PURPLE);
            Style yellow = (new Style()).setColor(TextFormatting.YELLOW);
            player.sendStatusMessage((new TextComponentTranslation("commands.mm.name", new Object[0])).setStyle(red), false);
            player.sendStatusMessage((new TextComponentTranslation("commands.mm.modid", new Object[0])).setStyle(green), false);
            player.sendStatusMessage((new TextComponentTranslation("commands.mm.version", new Object[0])).setStyle(blue), false);
            player.sendStatusMessage((new TextComponentTranslation("commands.mm.minecraftversion", new Object[0])).setStyle(aqua), false);
            player.sendStatusMessage((new TextComponentTranslation("commands.mm.creator", new Object[0])).setStyle(purple), false);
            player.sendStatusMessage((new TextComponentTranslation("commands.mm.updatepage", new Object[0])).setStyle(yellow), false);
        }
    }

}
