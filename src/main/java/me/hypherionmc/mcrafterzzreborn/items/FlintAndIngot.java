/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.item.ItemFlintAndSteel;

public class FlintAndIngot extends ItemFlintAndSteel {

    public FlintAndIngot(String name, int durabillity) {
        this.setMaxDamage(durabillity);
        this.setRegistryName(name);
        this.setTranslationKey(name);

        ModItems.ITEMS.add(this);

    }
}
