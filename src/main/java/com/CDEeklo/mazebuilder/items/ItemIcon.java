package com.CDEeklo.mazebuilder.items;

import com.CDEeklo.mazebuilder.items.base.ItemMB;
import com.CDEeklo.mazebuilder.reference.Names;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class ItemIcon extends ItemMB{


    public ItemIcon(){

        super();
        this.setHasSubtypes(false);
        this.setUnlocalizedName(Names.Items.BUILDERICON);
    }
}
