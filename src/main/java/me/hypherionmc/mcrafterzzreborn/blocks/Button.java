/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ToolType;

public class Button extends AbstractButtonBlock {

    public Button(String name, boolean wooden, SoundType stepSound, String tool, int toolLevel) {
        super(wooden, Properties.create(wooden ? Material.WOOD : Material.ROCK).harvestTool(ToolType.get(tool)).harvestLevel(toolLevel));
        this.setRegistryName(name);
    }

    @Override
    protected SoundEvent getSoundEvent(boolean isOn) {
        if (isOn) {
            return SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON;
        } else {
            return SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
        }
    }
}
