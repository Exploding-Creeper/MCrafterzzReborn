/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.gui;

import me.hypherionmc.mcrafterzzreborn.items.PortableFurnace;
import me.hypherionmc.mcrafterzzreborn.world.storage.WorldSaveManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class PortableFurnaceGuiHandler implements IGuiHandler {

    private int guiID = 15;

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == guiID && player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof PortableFurnace) {
            ItemStack stack = player.getHeldItem(EnumHand.MAIN_HAND);
            return WorldSaveManager.getINSTANCE().getFurnaceMachine(stack.getTagCompound().getInteger(PortableFurnace.MACHINE_TAG)).createContainer(player.inventory);
        }
        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == guiID && player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof PortableFurnace) {
            ItemStack stack = player.getHeldItem(EnumHand.MAIN_HAND);
            return new GuiPortableFurnace(player.inventory, WorldSaveManager.getINSTANCE().getFurnaceMachine(stack.getTagCompound().getInteger(PortableFurnace.MACHINE_TAG)));
        }
        return null;
    }
}
