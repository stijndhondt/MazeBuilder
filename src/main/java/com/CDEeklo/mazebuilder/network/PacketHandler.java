package com.CDEeklo.mazebuilder.network;

import com.CDEeklo.mazebuilder.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class PacketHandler {

    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.LOWERCASE_MOD_ID);

    public static void init()
    {
       // INSTANCE.registerMessage(MessageTileEntityJB.class, MessageTileEntityJB.class, 0, Side.CLIENT);
    }

}
