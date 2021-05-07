package com.melonsinc.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

import javax.annotation.Nonnull;

public class Honeydew extends MelonBlock {
    public Honeydew() {
        super(AbstractBlock.Properties.of(Material.VEGETABLE, MaterialColor.COLOR_LIGHT_GREEN).strength(1.0F).sound(SoundType.WOOD));
    }
    @Override @Nonnull
    public StemBlock getStem() {
        return (StemBlock) ModBlocks.HONEYDEW_STEM;
    }
    @Override @Nonnull
    public AttachedStemBlock getAttachedStem() {
        return (AttachedStemBlock) ModBlocks.ATTACHED_HONEYDEW_STEM;
    }

}
