package com.mcjty.rftools.dimension;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

@SideOnly(Side.CLIENT)
public class ReturnEnergyHelper {
    public static void setEnergyLevel(PacketReturnEnergy message) {
        World world = Minecraft.getMinecraft().theWorld;
        DimensionStorage dimensionStorage = DimensionStorage.getDimensionStorage(world);
        dimensionStorage.setEnergyLevel(message.id, message.energy);
    }

}
