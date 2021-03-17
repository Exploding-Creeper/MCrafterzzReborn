/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class CommandMCrafterzzMod  {

    public static void register(CommandDispatcher<CommandSource> dispatcher) {

        LiteralArgumentBuilder<CommandSource> mmzreborn = Commands.literal("mmzreborn")
                .requires((commandSource) -> commandSource.hasPermissionLevel(1))
                .then(Commands.literal("").executes(CommandMCrafterzzMod::execute));
        dispatcher.register(mmzreborn);
    }

    public static int execute(CommandContext<CommandSource> ctx) throws CommandException {
        if (ctx.getSource().getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)ctx.getSource().getEntity();
            Style red = Style.EMPTY.setColor(Color.fromTextFormatting(TextFormatting.DARK_RED));
            Style green = Style.EMPTY.setColor(Color.fromTextFormatting(TextFormatting.DARK_GREEN));
            Style blue = Style.EMPTY.setColor(Color.fromTextFormatting(TextFormatting.DARK_BLUE));
            Style aqua = Style.EMPTY.setColor(Color.fromTextFormatting(TextFormatting.DARK_AQUA));
            Style purple = Style.EMPTY.setColor(Color.fromTextFormatting(TextFormatting.DARK_PURPLE));
            Style yellow = Style.EMPTY.setColor(Color.fromTextFormatting(TextFormatting.YELLOW));
            player.sendStatusMessage((new TranslationTextComponent("commands.mmzreborn.name", new Object[0])).setStyle(red), false);
            player.sendStatusMessage((new TranslationTextComponent("commands.mmzreborn.modid", new Object[0])).setStyle(green), false);
            player.sendStatusMessage((new TranslationTextComponent("commands.mmzreborn.version", new Object[0])).setStyle(blue), false);
            player.sendStatusMessage((new TranslationTextComponent("commands.mmzreborn.minecraftversion", new Object[0])).setStyle(aqua), false);
            player.sendStatusMessage((new TranslationTextComponent("commands.mmzreborn.creator", new Object[0])).setStyle(purple), false);
            player.sendStatusMessage((new TranslationTextComponent("commands.mmzreborn.updatepage", new Object[0])).setStyle(yellow), false);
        }
        return 1;
    }

}
