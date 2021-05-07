package com.melonsinc.misc;

import com.melonsinc.blocks.ModBlocks;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber
public class VillagerTradeSub {
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void addVillagerTrades(final VillagerTradesEvent villagerTradesEvent){
        Int2ObjectMap<List<VillagerTrades.ITrade>> trades = villagerTradesEvent.getTrades();
        if(villagerTradesEvent.getType().equals(VillagerProfession.FARMER)){
            EmeraldForItemsTrade emToItem = new EmeraldForItemsTrade(ModBlocks.HONEYDEW, 4, 12, 20);
            List<VillagerTrades.ITrade> trd = trades.get(3);
            if(trd.size() < 3) {
                trd.add(trd.size(), emToItem);
                trades.put(3, trd);
            }
        }
    }
    static class EmeraldForItemsTrade implements VillagerTrades.ITrade {
        private final Item item;
        private final int cost;
        private final int maxUses;
        private final int villagerXp;
        private final float priceMultiplier;

        public EmeraldForItemsTrade(IItemProvider p_i50539_1_, int p_i50539_2_, int p_i50539_3_, int p_i50539_4_) {
            this.item = p_i50539_1_.asItem();
            this.cost = p_i50539_2_;
            this.maxUses = p_i50539_3_;
            this.villagerXp = p_i50539_4_;
            this.priceMultiplier = 0.05F;
        }
        @ParametersAreNonnullByDefault
        public MerchantOffer getOffer(Entity p_221182_1_, Random p_221182_2_) {
            ItemStack itemstack = new ItemStack(this.item, this.cost);
            return new MerchantOffer(itemstack, new ItemStack(Items.EMERALD), this.maxUses, this.villagerXp, this.priceMultiplier);
        }
    }

}

