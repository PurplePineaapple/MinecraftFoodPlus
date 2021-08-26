package me.purplepineapple.mcfoodplus.core.registry;


import me.purplepineapple.mcfoodplus.FoodPlus;
import me.purplepineapple.mcfoodplus.common.blocks.BlueberryBushBlock;
import me.purplepineapple.mcfoodplus.common.blocks.CornCropBlock;
import me.purplepineapple.mcfoodplus.common.blocks.StrawberryBushBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FPBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodPlus.MOD_ID);


    public static final RegistryObject<Block> CORN_STALK = BLOCKS.register("corn_stalk", CornCropBlock::new);
    public static final RegistryObject<Block> BLUEBERRY_BUSH = BLOCKS.register("blueberry_bush", BlueberryBushBlock::new);
    public static final RegistryObject<Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush", StrawberryBushBlock::new);

}
