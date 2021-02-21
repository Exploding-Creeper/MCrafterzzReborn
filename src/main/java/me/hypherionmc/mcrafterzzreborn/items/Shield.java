/*
 * Copyright (c) 2021. All Rights Reserved License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import me.hypherionmc.mcrafterzzreborn.ModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class Shield extends ItemShield {

    public String name;
    public CreativeTabs tab;

    public Shield(int durability, String name, CreativeTabs tab) {
        this.setMaxDamage(durability);
        this.name = name;
        this.tab = tab;

        this.addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter() {

            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }

        });
        this.setCreativeTab(tab);
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return I18n.translateToLocal("item." + this.name + ".name");
    }

    @Nullable
    @Override
    public CreativeTabs getCreativeTab() {
        return this.tab;
    }

    @SubscribeEvent
    public void attackEvent(LivingAttackEvent e) {
        float damage = e.getAmount();
        if (e.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)e.getEntityLiving();
            if (player.getActiveItemStack() != null) {
                ItemStack activeItemStack = player.getActiveItemStack();
                if (damage > 0.0F && activeItemStack != null && activeItemStack.getItem() instanceof ItemShield) {
                    int i = 1 + MathHelper.floor(damage);
                    activeItemStack.damageItem(i, player);
                    if (activeItemStack.getCount() <= 0) {
                        EnumHand enumhand = player.getActiveHand();
                        ForgeEventFactory.onPlayerDestroyItem(player, activeItemStack, enumhand);
                        if (enumhand == EnumHand.MAIN_HAND) {
                            player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, ItemStack.EMPTY);
                        } else {
                            player.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, ItemStack.EMPTY);
                        }

                        activeItemStack = null;
                        if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
                            player.playSound(SoundEvents.ITEM_SHIELD_BREAK, 0.8F, 0.8F + player.world.rand.nextFloat() * 0.4F);
                        }
                    }
                }

            }
        }
    }
}