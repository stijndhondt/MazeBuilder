package com.CDEeklo.mazebuilder.proxy;

import com.CDEeklo.mazebuilder.handler.WorldEventHandler;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class CommonProxy implements IProxy {
    @Override
    public void registerEventHandlers() {
        MinecraftForge.EVENT_BUS.register(new WorldEventHandler());
    }
}
