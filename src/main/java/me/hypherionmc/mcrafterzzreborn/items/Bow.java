/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Bow extends BowItem {

    public Item repairItem;

    public Bow(String name, int durability, Item repairItem) {
        super(new Properties().maxStackSize(1).maxDamage(durability));
        this.repairItem = repairItem;
        this.setRegistryName(name);

        /*this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter() {

            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
                if (entityIn == null) {
                    return 0.0F;
                } else {
                    ItemStack itemstack = entityIn.getActiveItemStack();
                    return itemstack != null ? (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F : 0.0F;
                }
            }
        });

        this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter() {

            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }

        });*/

    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == this.repairItem || super.getIsRepairable(toRepair, repair);
    }
}