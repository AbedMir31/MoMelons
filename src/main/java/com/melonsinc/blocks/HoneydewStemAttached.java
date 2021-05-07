package com.melonsinc.blocks;

import com.melonsinc.items.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;

public class HoneydewStemAttached extends AttachedStemBlock {
    public HoneydewStemAttached(){
        super((StemGrownBlock) ModBlocks.HONEYDEW, AbstractBlock.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.WOOD));
    }
    @Override @Nonnull
    public Item getSeedItem(){
        return ModItems.HONEYDEW_SEEDS;
    }
}
