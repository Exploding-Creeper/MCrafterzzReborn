/*
 * Copyright (c) 2021. MIT License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ItemTiers implements IItemTier {

    OPTOOL(4, 0, 100.0F, 96.0F, 100, () -> {
       return Ingredient.EMPTY;
    }),
    AMETHYST(4, 2000, 9.0F, 4.0F, 15, () -> {
       return Ingredient.fromItems(ModItems.amethyst.get());
    }),
    JADE(4, 2000, 9.0F, 4.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.jade.get());
    }),
    COPPER(1, 170, 5.0F, 1.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.copper_ingot.get());
    }),
    BRONZE(2, 250, 6.5F, 2.0F, 15, () -> {
        return Ingredient.fromItems(ModItems.bronze_ingot.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    private ItemTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
