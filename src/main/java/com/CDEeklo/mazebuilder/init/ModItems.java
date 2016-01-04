package com.CDEeklo.mazebuilder.init;

import com.CDEeklo.mazebuilder.items.*;
import com.CDEeklo.mazebuilder.items.base.ItemMB;
import com.CDEeklo.mazebuilder.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class ModItems {
    public static final ItemMB builder= new ItemIcon();
    public static final ItemMB verySmallMaze= new ItemVerySmallMaze();
    public static final ItemMB stillASmallMaze= new ItemStillASmallMaze();
    public static final ItemMB smallMaze= new ItemSmallMaze();


    public static void init(){

        GameRegistry.registerItem(builder, Names.Items.BUILDERICON);
        GameRegistry.registerItem(verySmallMaze, Names.Items.VERYSMALLMAZE);
        GameRegistry.registerItem(stillASmallMaze, Names.Items.STILLASMALLMAZE);
        GameRegistry.registerItem(smallMaze, Names.Items.SMALLMAZE);

    }
}
