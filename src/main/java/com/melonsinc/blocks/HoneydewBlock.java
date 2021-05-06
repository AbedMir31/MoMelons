package com.melonsinc.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class HoneydewBlock extends MelonBlock {

    public HoneydewBlock() {
        super(AbstractBlock.Properties.of(Material.VEGETABLE)
                .sound(SoundType.WOOD)
                .strength(1.0f)
                .harvestLevel(1));
        setRegistryName("honeydew");

    }

    @Override
    public StemBlock getStem() {
        return (StemBlock)Blocks.MELON_STEM;
    }

    public AttachedStemBlock getAttachedStem() {
        return (AttachedStemBlock)Blocks.ATTACHED_MELON_STEM;
    }
}
