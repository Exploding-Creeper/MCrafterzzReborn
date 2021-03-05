/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.recipes;

import net.minecraft.block.Block;
import net.minecraft.client.gui.recipebook.RecipeList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.Iterator;
import java.util.List;

public class RecipeRemover {

    public static void removeCraftingRecipeItemWithoutMetadata(Item item) {
        List<IRecipe> recipes = new RecipeList().getRecipes();

        Iterator remover = recipes.iterator();

        while(remover.hasNext()) {
            ItemStack itemStack = ((IRecipe)remover.next()).getRecipeOutput();
            if (itemStack != null && itemStack.getItem() == item) {
                remover.remove();
            }
        }

    }

    public static void removeCraftingRecipeItemWithMetadata(Item item, int metaData) {
        List<IRecipe> recipes = new RecipeList().getRecipes();
        Iterator remover = recipes.iterator();

        while(remover.hasNext()) {
            ItemStack itemStack = ((IRecipe)remover.next()).getRecipeOutput();
            if (itemStack != null && itemStack.getItem() == item && itemStack.getMetadata() == item.getMetadata(metaData)) {
                remover.remove();
            }
        }

    }

    public static void removeCraftingRecipeBlockWithoutMetadata(Block block) {
        List<IRecipe> recipes = new RecipeList().getRecipes();
        Iterator remover = recipes.iterator();

        while(remover.hasNext()) {
            ItemStack itemStack = ((IRecipe)remover.next()).getRecipeOutput();
            if (itemStack != null && itemStack.getItem() == Item.getItemFromBlock(block)) {
                remover.remove();
            }
        }

    }

    public static void removeCraftingRecipeBlockWithMetadata(Block block, int metaData) {
        List<IRecipe> recipes = new RecipeList().getRecipes();
        Iterator remover = recipes.iterator();

        while(remover.hasNext()) {
            ItemStack itemStack = ((IRecipe)remover.next()).getRecipeOutput();
            if (itemStack != null && itemStack.getItem() == Item.getItemFromBlock(block) && itemStack.getMetadata() == Item.getItemFromBlock(block).getMetadata(metaData)) {
                remover.remove();
            }
        }

    }
}
