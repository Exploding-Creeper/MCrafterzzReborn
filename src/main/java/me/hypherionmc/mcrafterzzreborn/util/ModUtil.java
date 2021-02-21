/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class ModUtil {

    public static Ingredient objectToIngredient(Object[] ingredients) {

        List<ItemStack> ingredientList = new ArrayList<>();

        for (Object ingredient : ingredients) {

            if (ingredient instanceof ItemStack) {
                ingredientList.add((ItemStack) ingredient);
            } else if (ingredient instanceof Block) {
                ingredientList.add(new ItemStack(Item.getItemFromBlock((Block) ingredient)));
            } else if (ingredient instanceof Item) {
                ingredientList.add(new ItemStack((Item) ingredient));
            }

        }

        return Ingredient.fromStacks(ingredientList.toArray(new ItemStack[] {}));
    }

}
