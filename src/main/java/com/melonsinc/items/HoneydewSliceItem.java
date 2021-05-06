package com.melonsinc.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class HoneydewSliceItem extends Item {

    public HoneydewSliceItem() {
        super(new Item.Properties()
                .tab(ItemGroup.TAB_FOOD));
        setRegistryName("honeydew_slice");
    }
}
