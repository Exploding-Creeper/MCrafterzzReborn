/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.world.storage;

import me.hypherionmc.mcrafterzzreborn.portable.PortableFurnaceMachine;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapStorage;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorldSaveManager extends WorldSavedData {

    private static final String PORTABLE_FURNACE = "PORTABLE_FURNACE";
    private static final String tag = "mmreborn";

    public static List<PortableFurnaceMachine> portableFurnaces = new ArrayList<>();
    private static int furnaceCount = 0;

    private static WorldSaveManager INSTANCE;

    public WorldSaveManager(String name) {
        super(name);
    }

    public WorldSaveManager(String name, NBTTagCompound compound) {
        super(name);
        this.readFromNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        NBTTagList list = nbt.getTagList(PORTABLE_FURNACE, 10);

        for (int i = 0; i < list.tagCount(); i++) {
            portableFurnaces.add(new PortableFurnaceMachine(list.getCompoundTagAt(i)));
        }

        if (portableFurnaces.size() != 0) {
            int i;

            for (PortableFurnaceMachine portableFurnaceMachine : portableFurnaces) {
                i = portableFurnaceMachine.getMachineID();
                if (furnaceCount == 0) {
                    furnaceCount = i;
                } else if (furnaceCount < i) {
                    furnaceCount = i;
                }
            }
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        NBTTagList furnaces = new NBTTagList();

        for (PortableFurnaceMachine machine : portableFurnaces) {
            NBTTagCompound compound1 = new NBTTagCompound();
            machine.writeToNBT(compound1);
            furnaces.appendTag(compound1);
        }

        compound.setTag(PORTABLE_FURNACE, furnaces);
        return compound;
    }

    public int createFurnace() {
        ++furnaceCount;
        PortableFurnaceMachine portableFurnaceMachine = new PortableFurnaceMachine();
        portableFurnaceMachine.setMachineID(furnaceCount);
        portableFurnaces.add(portableFurnaceMachine);
        this.markDirty();
        return furnaceCount;
    }

    public PortableFurnaceMachine getFurnaceMachine(int id) {

        Iterator furnaces = portableFurnaces.iterator();

        PortableFurnaceMachine furnace;
        do {
            if (!furnaces.hasNext()) {
                PortableFurnaceMachine portableFurnace = new PortableFurnaceMachine();
                portableFurnace.setMachineID(id);
                portableFurnaces.add(portableFurnace);
                this.markDirty();
                return portableFurnace;
            }

            furnace = (PortableFurnaceMachine) furnaces.next();
        } while(furnace.getMachineID() != id);

        return furnace;
    }

    public static void reset() {
        portableFurnaces = new ArrayList<>();
        furnaceCount = 0;
    }

    public static void resetAll() {
        reset();
        INSTANCE = null;
    }

    public static void setINSTANCE(World world) {
        MapStorage storage = world.getMapStorage();
        WorldSaveManager result = (WorldSaveManager)storage.getOrLoadData(WorldSaveManager.class, "mmreborn");
        if (result == null) {
            result = new WorldSaveManager("mmreborn");
            storage.setData("mmreborn", result);
        }

        INSTANCE = result;
    }

    @SideOnly(Side.CLIENT)
    public static void setInstance() {
        INSTANCE = new WorldSaveManager("mmreborn");
    }

    public static WorldSaveManager getINSTANCE() {
        return INSTANCE;
    }

    @SideOnly(Side.CLIENT)
    public static void setFurnaceNBT(NBTTagCompound nbt) {
        PortableFurnaceMachine furnace = new PortableFurnaceMachine();
        furnace.readFromNBT(nbt);
        if (getINSTANCE().getFurnaceMachine(furnace.getMachineID()) == null) {
            portableFurnaces.add(furnace);
        } else {
            getINSTANCE().getFurnaceMachine(furnace.getMachineID()).readFromNBT(nbt);
        }

    }
}
