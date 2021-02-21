/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.block.BlockButton;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Button extends BlockButton {

    public Button(boolean wooden, SoundType stepSound, String tool, int toolLevel) {
        super(wooden);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);

    }

    @Override
    protected void playClickSound(@Nullable EntityPlayer player, World worldIn, BlockPos pos) {
        worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 0.5F, 0.5F);
    }

    @Override
    protected void playReleaseSound(World worldIn, BlockPos pos) {
        worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 0.5F, 0.5F);
    }
}
