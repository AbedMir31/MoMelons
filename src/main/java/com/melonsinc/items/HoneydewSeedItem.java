package com.melonsinc.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class HoneydewSeedItem extends Item{

    public HoneydewSeedItem() {
        super(new Item.Properties()
                .tab(ItemGroup.TAB_MATERIALS));
        setRegistryName("honeydew_seeds");
    }
}
