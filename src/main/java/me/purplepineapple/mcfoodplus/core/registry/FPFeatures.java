package me.purplepineapple.mcfoodplus.core.registry;

import com.google.common.collect.ImmutableSet;
import me.purplepineapple.mcfoodplus.common.blocks.BlueberryBushBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;

public class FPFeatures {
    public static final BlockState BLUEBERRY_BUSH = FPBlocks.BLUEBERRY_BUSH.get().defaultBlockState().setValue(BlueberryBushBlock.AGE, 3);
    public static final BlockState STRAWBERRY_BUSH = FPBlocks.STRAWBERRY_BUSH.get().defaultBlockState().setValue(BlueberryBushBlock.AGE, 3);


    public static final BlockClusterFeatureConfig BLUEBERRY_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BLUEBERRY_BUSH),
            new SimpleBlockPlacer()).tries(64).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getBlock())).noProjection().build());
    public static final BlockClusterFeatureConfig STRAWBERRY_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(STRAWBERRY_BUSH),
            new SimpleBlockPlacer()).tries(64).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getBlock())).noProjection().build());
}
