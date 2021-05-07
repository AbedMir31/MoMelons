package com.melonsinc.setup;

import com.google.common.collect.ImmutableSet;
import com.melonsinc.MoMelons;
import com.melonsinc.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class WorldGen {
    public static final ConfiguredFeature<?, ?> PATCH_HONEYDEW = Registry.register(
            WorldGenRegistries.CONFIGURED_FEATURE,
            "patch_honeydew",
            Feature.RANDOM_PATCH.configured
            ((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.HONEYDEW.defaultBlockState()),
                        SimpleBlockPlacer.INSTANCE))
                        .tries(64)
                        .whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getBlock()))
                        .canReplace()
                        .noProjection()
                        .build()
            )
            .chance(32)
            .count(5)
            .decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE));

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void generatePatchesInWorld(final BiomeLoadingEvent biomeLoadingEvent){
        MoMelons.getLogger().info("Initializing Biome generation event...");
        BiomeGenerationSettingsBuilder gen = biomeLoadingEvent.getGeneration();
        if(biomeLoadingEvent.getCategory().equals(Biome.Category.SAVANNA) ||
                biomeLoadingEvent.getCategory().equals(Biome.Category.JUNGLE)) {
            gen.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, PATCH_HONEYDEW);
        }
    }
}
