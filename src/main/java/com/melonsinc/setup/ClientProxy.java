package com.melonsinc.setup;

import com.melonsinc.blocks.ModBlocks;
import net.minecraft.block.StemBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.world.World;

public class ClientProxy extends BlockColors implements IProxy {
    @Override
    public void init() {
    }
    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().level;
    }
}
