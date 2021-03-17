/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.block.material.Material;

public class ModTrapDoor extends TrapDoorBlock {

    public ModTrapDoor(String name, Material material, SoundType stepSound, String tool, int toolLevel) {
        super(Properties.create(material).sound(stepSound));
        this.setRegistryName(name);

    }

}