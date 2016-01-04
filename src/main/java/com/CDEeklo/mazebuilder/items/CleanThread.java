package com.CDEeklo.mazebuilder.items;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

/**
 * Created by Obsidean on 03/01/2016.
 */
public class CleanThread extends  Thread{

    private int x;
    private int y;
    private int z;
    private World world;
    private boolean isStartingLayer;


    public CleanThread(World world, int x, int y, int z,boolean isStatrtingLayer){
        this.x= x;
        this.y=y;
        this.z=z;
        this.world= world;
    }


    public void run(){

        for (int indexZ = -256; indexZ < 257; indexZ++) {
            Block tempBlock;
            if(isStartingLayer){
                tempBlock= Blocks.grass;
            }
            else{
                tempBlock= Blocks.air;
            }
            world.setBlock(x, y , z + indexZ , tempBlock);
        }



    }

}
