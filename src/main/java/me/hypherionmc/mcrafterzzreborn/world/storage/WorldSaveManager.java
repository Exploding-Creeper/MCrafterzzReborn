/*
 * Copyright (c) 2021. MIT License License
 *
 * Coded by HypherionMC based on code originally created by MCrafterzz. Code used with written permission
 */

package me.hypherionmc.mcrafterzzreborn.world.storage;

import me.hypherionmc.mcrafterzzreborn.machines.portable.PortableFurnaceMachine;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

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

    public WorldSaveManager(String name, CompoundNBT compound) {
        super(name);
        this.read(compound);
    }

    @Override
    public void read(CompoundNBT nbt) {
        ListNBT list = nbt.getList(PORTABLE_FURNACE, 10);

        for (int i = 0; i < list.size(); i++) {
            portableFurnaces.add(new PortableFurnaceMachine(list.getCompound(i)));
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
    public CompoundNBT write(CompoundNBT compound) {
        ListNBT furnaces = new ListNBT();

        for (PortableFurnaceMachine machine : portableFurnaces) {
            CompoundNBT compound1 = new CompoundNBT();
            machine.writeToNBT(compound1);
            furnaces.add(compound1);
        }

        compound.put(PORTABLE_FURNACE, furnaces);
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

    public static void setInstance(World world) {
        Storage storage = world.get();
        WorldSaveManager result = (WorldSaveManager)storage.getOrLoadData(WorldSaveManager.class, "mmreborn");
        if (result == null) {
            result = new WorldSaveManager("mmreborn");
            storage.setData("mmreborn", result);
        }

        INSTANCE = result;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setInstance() {
        INSTANCE = new WorldSaveManager("mmreborn");
    }

    public static WorldSaveManager getInstance() {
        return INSTANCE;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setFurnaceNBT(CompoundNBT nbt) {
        PortableFurnaceMachine furnace = new PortableFurnaceMachine();
        furnace.readFromNBT(nbt);
        if (getInstance().getFurnaceMachine(furnace.getMachineID()) == null) {
            portableFurnaces.add(furnace);
        } else {
            getInstance().getFurnaceMachine(furnace.getMachineID()).readFromNBT(nbt);
        }

    }
}
