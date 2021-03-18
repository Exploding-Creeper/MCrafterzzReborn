/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.init.ModTabs;
import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PortableFurnace extends ModItem {

    public static final String MACHINE_TAG = "MACHINE_ID";

    public PortableFurnace() {
        super(new Properties().maxStackSize(1), ModTabs.creativeTabTools);

        /*this.addPropertyOverride(new ResourceLocation("variant"), new IItemPropertyGetter() {
            @Override
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
                if (stack.hasTagCompound() && WorldSaveManager.getInstance().getFurnaceMachine(stack.getTagCompound().getInteger(MACHINE_TAG)) != null && WorldSaveManager.getInstance().getFurnaceMachine(stack.getTagCompound().getInteger(MACHINE_TAG)).isBurning()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });*/
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        if (worldIn.isRemote) {
            BlockPos pos = playerIn.getPosition();

        }

        return new ActionResult<>(ActionResultType.PASS, playerIn.getHeldItem(handIn));
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        if (!stack.hasTag()) {
            stack.setTag(new CompoundNBT());
            stack.getTag().putInt(MACHINE_TAG, WorldSaveManager.getInstance().createFurnace());
        } else {
            if (!stack.getTag().contains(MACHINE_TAG)) {
                stack.getTag().putInt(MACHINE_TAG, WorldSaveManager.getInstance().createFurnace());
            }
        }
        return true;
    }
}
