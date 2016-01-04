package com.CDEeklo.mazebuilder.block;

import com.CDEeklo.mazebuilder.block.base.BlockMB;
import com.CDEeklo.mazebuilder.reference.Names;

/**
 * Created by Obsidean on 03/01/2016.
 */
public class BlockMazeEnd extends BlockMB {

    public BlockMazeEnd(){

        super();

        this.setBlockUnbreakable();
        this.setResistance(6000000.0F);
        this.setBlockName(Names.Blocks.MAZEENDBLOCK);

                /*this.setHardness();*/
    }
}
