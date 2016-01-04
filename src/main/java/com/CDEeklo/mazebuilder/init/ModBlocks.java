package com.CDEeklo.mazebuilder.init;

import com.CDEeklo.mazebuilder.block.BlockMazeCenter;
import com.CDEeklo.mazebuilder.block.BlockMazeEnd;
import com.CDEeklo.mazebuilder.block.BlockMazeFloor;
import com.CDEeklo.mazebuilder.block.BlockMazeWall;
import com.CDEeklo.mazebuilder.block.base.BlockMB;
import com.CDEeklo.mazebuilder.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Obsidean on 27/12/2015.
 */
public class ModBlocks {

    public static final BlockMB centerBlock= new BlockMazeCenter();
    public static final BlockMB floorBlock= new BlockMazeFloor();
    public static final BlockMB wallBlock= new BlockMazeWall();
    public static final BlockMB endBlock= new BlockMazeEnd();


    public static void init(){
        GameRegistry.registerBlock(centerBlock, Names.Blocks.MAZECENTERBLOCK);
        GameRegistry.registerBlock(floorBlock, Names.Blocks.MAZEFLOORBLOCK);
        GameRegistry.registerBlock(wallBlock, Names.Blocks.MAZEWALLBLOCK);
        GameRegistry.registerBlock(endBlock, Names.Blocks.MAZEENDBLOCK);
    }
}
