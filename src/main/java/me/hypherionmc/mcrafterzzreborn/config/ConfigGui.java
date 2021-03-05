/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.config;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.List;
import java.util.stream.Collectors;

public class ConfigGui extends GuiConfig {

    public ConfigGui(GuiScreen parent) {
        super(parent, getConfigElements(), ModConstants.MODID, false, false, "MCrafterzz Mod Reborn Config");
    }

    private static List<IConfigElement> getConfigElements() {
        return (List)Config.config.getCategoryNames().stream().map((categoryName) -> {
            return new ConfigElement(Config.config.getCategory(categoryName));
        }).collect(Collectors.toList());
    }
}
