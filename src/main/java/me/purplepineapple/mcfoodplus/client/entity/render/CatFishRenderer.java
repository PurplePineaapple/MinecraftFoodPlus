package me.purplepineapple.mcfoodplus.client.entity.render;

import me.purplepineapple.mcfoodplus.FoodPlus;
import me.purplepineapple.mcfoodplus.client.entity.model.CatFishModel;
import me.purplepineapple.mcfoodplus.common.entities.CatFishEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.CodModel;
import net.minecraft.entity.passive.fish.CodEntity;
import net.minecraft.util.ResourceLocation;

public class CatFishRenderer extends MobRenderer<CatFishEntity, CatFishModel<CatFishEntity>> {
    public static final ResourceLocation CATFISH_LOCATION = new ResourceLocation(FoodPlus.MOD_ID, "textures/entity/catfish/catfish.png");

    public CatFishRenderer(EntityRendererManager manager) {
        super(manager, new CatFishModel<>(), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(CatFishEntity p_110775_1_) {
        return CATFISH_LOCATION;
    }



}
