package com.melonsinc.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class HoneydewStemBlock extends StemBlock {
    public HoneydewStemBlock() {
        super(ModBlocks.HONEYDEWBLOCK,
                AbstractBlock.Properties.of(Material.PLANT)
                        .noCollission()
                        .randomTicks()
                        .instabreak()
                        .sound(SoundType.HARD_CROP));
        setRegistryName("honeydew_stem");
    }
}
