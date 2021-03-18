/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.loading.FMLEnvironment;

public class Shield extends ShieldItem {

    public String name;
    public ItemGroup tab;

    public Shield(int durability, ItemGroup tab) {
        super(new Properties().maxDamage(durability).group(tab));
        this.name = name;

        /*this.addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter() {

            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn) {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }

        });*/

    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        float damage = stack.getDamage();
        if (attacker instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) attacker;
            if (player.getActiveItemStack() != null) {
                ItemStack activeItemStack = player.getActiveItemStack();
                if (damage > 0.0F && activeItemStack.getItem() instanceof ShieldItem) {
                    int i = 1 + MathHelper.floor(damage);

                    stack.damageItem(i, player, (entity) -> {
                        entity.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                    });

                    if (activeItemStack.getCount() <= 0) {
                        Hand enumhand = player.getActiveHand();
                        ForgeEventFactory.onPlayerDestroyItem(player, activeItemStack, enumhand);
                        if (enumhand == Hand.MAIN_HAND) {
                            player.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
                        } else {
                            player.setItemStackToSlot(EquipmentSlotType.OFFHAND, ItemStack.EMPTY);
                        }

                        activeItemStack = null;
                        if (FMLEnvironment.dist.isClient()) {
                            player.playSound(SoundEvents.ITEM_SHIELD_BREAK, 0.8F, 0.8F + player.world.rand.nextFloat() * 0.4F);
                        }
                    }
                }

            }
        }
        return true;
    }
}