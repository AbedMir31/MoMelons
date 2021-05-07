package com.melonsinc.blocks;

import com.melonsinc.items.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StemBlock;
import net.minecraft.block.StemGrownBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class HoneydewStem extends StemBlock {
    public HoneydewStem() {
        super((StemGrownBlock) ModBlocks.HONEYDEW, AbstractBlock.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.HARD_CROP));
    }
    @Override
    public Item getSeedItem(){
        return ModItems.HONEYDEW_SEEDS;
    }

}
