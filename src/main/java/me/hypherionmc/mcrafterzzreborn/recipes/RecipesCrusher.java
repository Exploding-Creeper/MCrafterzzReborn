/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.recipes;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLLog;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;

public class RecipesCrusher {

    private static final RecipesCrusher crushing_base = new RecipesCrusher();
    private Map<ItemStack, ItemStack> crushingList = Maps.newHashMap();
    private Map<ItemStack, Float> experienceList = Maps.newHashMap();

    public static RecipesCrusher instance() {
        return crushing_base;
    }

    public RecipesCrusher() {
        this.addCrushingRecipeForBlock(Blocks.STONE, new ItemStack(Blocks.COBBLESTONE), 0.5F);
        this.addCrushingRecipeForBlock(Blocks.COBBLESTONE, new ItemStack(Blocks.GRAVEL), 0.5F);
        this.addCrushingRecipeForBlock(Blocks.GRAVEL, new ItemStack(Blocks.SAND), 0.5F);
        this.addCrushingRecipeForBlock(Blocks.GRASS, new ItemStack(Blocks.DIRT), 0.5F);
        this.addCrushingRecipeForBlock(Blocks.GRASS_PATH, new ItemStack(Blocks.DIRT), 0.5F);
        this.addCrushingRecipeForBlock(Blocks.MYCELIUM, new ItemStack(Blocks.DIRT), 0.5F);
        this.addCrushingRecipeForBlock(Blocks.MOSSY_COBBLESTONE, new ItemStack(Blocks.COBBLESTONE), 0.5F);
        this.addCrushingRecipeForBlock(new ItemStack(Blocks.COBBLESTONE_WALL, 1, 1), new ItemStack(Blocks.COBBLESTONE_WALL), 0.5F);
        this.addCrushingRecipeForBlock(new ItemStack(Blocks.STONEBRICK, 1, 1), new ItemStack(Blocks.STONEBRICK), 0.5F);
        this.addCrushingRecipeForBlock(new ItemStack(Blocks.STONEBRICK, 1, 0), new ItemStack(Blocks.STONEBRICK, 1, 2), 0.5F);
        this.addCrushingRecipeForBlock(new ItemStack(Blocks.STONEBRICK, 1, 3), new ItemStack(Blocks.STONEBRICK), 0.5F);
        this.addCrushingRecipeForBlock(new ItemStack(Blocks.DIRT, 1, 1), new ItemStack(Blocks.DIRT), 0.5F);
        this.addCrushingRecipeForBlock(new ItemStack(Blocks.DIRT, 1, 2), new ItemStack(Blocks.DIRT), 0.5F);
    }

    public void addCrushingRecipeForBlock(Block input, ItemStack stack, float experience) {
        this.addCrushing(Item.getItemFromBlock(input), stack, experience);
    }

    public void addCrushingRecipeForBlock(ItemStack itemStack, ItemStack stack, float experience) {
        this.addCrushingRecipe(itemStack, stack, experience);
    }

    public void addCrushing(Item input, ItemStack stack, float experience) {
        this.addCrushingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    public void addCrushingRecipe(ItemStack input, ItemStack stack, float experience) {
        if (this.getCrushingResult(input) != null) {
            FMLLog.info("Ignored smelting recipe with conflicting input: " + input + " = " + stack, new Object[0]);
        } else {
            this.crushingList.put(input, stack);
            this.experienceList.put(stack, experience);
        }
    }

    @Nullable
    public ItemStack getCrushingResult(ItemStack stack) {
        Iterator var2 = this.crushingList.entrySet().iterator();

        Map.Entry entry;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            entry = (Map.Entry)var2.next();
        } while(!this.compareItemStacks(stack, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getCrusherList() {
        return this.crushingList;
    }

    public float getCrushingExperience(ItemStack stack) {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1.0F) {
            return ret;
        } else {
            Iterator var3 = this.experienceList.entrySet().iterator();

            Map.Entry entry;
            do {
                if (!var3.hasNext()) {
                    return 0.0F;
                }

                entry = (Map.Entry)var3.next();
            } while(!this.compareItemStacks(stack, (ItemStack)entry.getKey()));

            return (Float)entry.getValue();
        }
    }

}
