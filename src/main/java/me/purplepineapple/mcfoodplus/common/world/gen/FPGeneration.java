package me.purplepineapple.mcfoodplus.common.world.gen;

import me.purplepineapple.mcfoodplus.core.registry.FPFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FPGeneration {
    public static void generateBushes(BiomeLoadingEvent biome) {
        if (!(biome.getCategory() == Biome.Category.NETHER) || !(biome.getCategory() == Biome.Category.THEEND)) {
            Biome.Category biomeCategory = biome.getCategory();
            if(biomeCategory == Biome.Category.TAIGA) {
            biome.getGeneration().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH
                    .configured(FPFeatures.BLUEBERRY_BUSH_CONFIG).decorated(Features.Placements.HEIGHTMAP_DOUBLE).count(5));
            }
        }

    }
}
