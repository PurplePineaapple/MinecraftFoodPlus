package me.purplepineapple.mcfoodplus.core.registry;

import me.purplepineapple.mcfoodplus.FoodPlus;
import me.purplepineapple.mcfoodplus.common.entities.CatFishEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FPEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            FoodPlus.MOD_ID);

    public static final EntityType<CatFishEntity> CATFISH_TYPE = EntityType.Builder.of(CatFishEntity::new, EntityClassification.WATER_AMBIENT)
            .sized(0.5F, 0.3F)
            .build(new ResourceLocation(FoodPlus.MOD_ID, "catfish").toString());
    public static final RegistryObject<EntityType<CatFishEntity>> CATFISH_ENTITY = ENTITY_TYPES.register("catfish", () -> CATFISH_TYPE);
}
