package com.melonsinc.items;

import com.melonsinc.blocks.ModBlocks;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class HoneydewSeedItem extends BlockNamedItem {

    public HoneydewSeedItem() {
        super(ModBlocks.HONEYDEWSTEM, (new Item.Properties()).tab(ItemGroup.TAB_MATERIALS));
        setRegistryName("honeydew_seeds");
    }
}
