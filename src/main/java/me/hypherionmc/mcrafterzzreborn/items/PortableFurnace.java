/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.init.ModTabs;
import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class PortableFurnace extends ModItem {

    public static final String MACHINE_TAG = "MACHINE_ID";

    public PortableFurnace(String name) {
        super(name);
        this.setCreativeTab(ModTabs.creativeTabTools);
        this.maxStackSize = 1;

        this.addPropertyOverride(new ResourceLocation("variant"), new IItemPropertyGetter() {
            @Override
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
                if (stack.hasTagCompound() && WorldSaveManager.getINSTANCE().getFurnaceMachine(stack.getTagCompound().getInteger(MACHINE_TAG)) != null && WorldSaveManager.getINSTANCE().getFurnaceMachine(stack.getTagCompound().getInteger(MACHINE_TAG)).isBurning()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote) {
            BlockPos pos = playerIn.getPosition();
            playerIn.openGui("mm", 15, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }
        return ActionResult.newResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {

        if (!worldIn.isRemote) {
            if (!stack.hasTagCompound()) {
                stack.setTagCompound(new NBTTagCompound());
                stack.getTagCompound().setInteger(MACHINE_TAG, WorldSaveManager.getINSTANCE().createFurnace());
            } else {
                if (!stack.getTagCompound().hasKey(MACHINE_TAG)) {
                    stack.getTagCompound().setInteger(MACHINE_TAG, WorldSaveManager.getINSTANCE().createFurnace());
                }
            }

        }

    }

}
