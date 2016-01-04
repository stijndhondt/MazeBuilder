package com.CDEeklo.mazebuilder.creativetab;

import com.CDEeklo.mazebuilder.init.ModItems;
import com.CDEeklo.mazebuilder.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class CreativeTabMB {

    public static  final CreativeTabs MBTab= new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.builder;
        }
    };
}
