package com.CDEeklo.mazebuilder;

import com.CDEeklo.mazebuilder.handler.GUIHandler;
import com.CDEeklo.mazebuilder.init.ModBlocks;
import com.CDEeklo.mazebuilder.init.ModItems;
import com.CDEeklo.mazebuilder.network.PacketHandler;
import com.CDEeklo.mazebuilder.proxy.IProxy;
import com.CDEeklo.mazebuilder.reference.Messages;
import com.CDEeklo.mazebuilder.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;


import com.CDEeklo.mazebuilder.reference.Reference;

/**
 * Created by Obsidean on 27/12/2015.
 */
@Mod(modid= Reference.MOD_ID, name =Reference.MOD_NAME ,version = Reference.VERSION)
public class MazeBuilder {
    @Mod.EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event)
    {
        if (Reference.FINGERPRINT.equals("@FINGERPRINT@"))
        {
            LogHelper.info(Messages.NO_FINGERPRINT_MESSAGE);
        }
        else
        {
            LogHelper.warn(Messages.INVALID_FINGERPRINT_MESSAGE);
        }
    }

    @Mod.Instance(Reference.MOD_ID)
    public static MazeBuilder instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;



    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        PacketHandler.init();

        ModItems.init();
        ModBlocks.init();

        //ModPotions.init();
    }

    @Mod.EventHandler
    public  void Init(FMLInitializationEvent event)
    {

        // Register the GUI Handler
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GUIHandler());


        //ModRecipes.init();

        //ModTE.init();

        proxy.registerEventHandlers();

    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
