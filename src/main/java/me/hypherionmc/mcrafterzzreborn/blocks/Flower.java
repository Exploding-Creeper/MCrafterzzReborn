/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.blocks;

import net.minecraft.block.BushBlock;
import net.minecraft.block.material.Material;

public class Flower extends BushBlock {

    public Flower(String name) {
        super(Properties.create(Material.PLANTS));
        this.setRegistryName(name);

    }

}
