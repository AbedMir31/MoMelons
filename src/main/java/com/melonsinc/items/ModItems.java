package com.melonsinc.items;

import com.melonsinc.blocks.ModBlocks;
import net.minecraft.item.*;

public class ModItems {
    public static final Item HONEYDEW = new BlockItem(ModBlocks.HONEYDEW, new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)).setRegistryName("honeydew");
    public static final Item HONEYDEW_SEEDS = new BlockNamedItem(ModBlocks.HONEYDEW_STEM, (new Item.Properties()).tab(ItemGroup.TAB_MATERIALS)).setRegistryName("honeydew_seeds");
    public static final Item HONEYDEW_SLICE = new Item((new Item.Properties()).tab(ItemGroup.TAB_FOOD).food(Foods.MELON_SLICE)).setRegistryName("honeydew_slice");
}
