/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Door extends BlockDoor {

    public Item doorItem;

    public Door(Material material, SoundType stepSound, String tool, int toolLevel, Item doorItem) {
        super(material);
        this.setSoundType(stepSound);
        this.setHarvestLevel(tool, toolLevel);
        this.doorItem = doorItem;

    }
}
