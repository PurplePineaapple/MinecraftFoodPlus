package me.purplepineapple.mcfoodplus.common.world.features;

import com.mojang.serialization.Codec;
import me.purplepineapple.mcfoodplus.core.registry.FPBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;

public class BlueberryBushFeature extends Feature<NoFeatureConfig> {

    private static final BlockState BLUEBERRY_BUSH = FPBlocks.BLUEBERRY_BUSH.get().defaultBlockState();

    public BlueberryBushFeature(Codec<NoFeatureConfig> p_i231953_1_) {
        super(p_i231953_1_);
    }

    @SuppressWarnings("deprecation")
    private boolean isAirOrLeaves(IWorldGenerationReader reader, BlockPos pos) {
        if(!(reader instanceof IWorldReader)) {
            return reader.isStateAtPosition(pos, (state) -> state.isAir() || state.is(BlockTags.LEAVES));
        }else {
            return reader.isStateAtPosition(pos, state -> state.canBeReplacedByLeaves((IWorldReader) reader, pos));
        }
    }

    @Override
        public boolean place(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {

        while(pos.getY() > 1 && isAirOrLeaves(reader, pos)) {
            pos = pos.below();
        }
        pos = pos.above();




        return false;
    }
}
