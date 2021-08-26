package me.purplepineapple.mcfoodplus;

import me.purplepineapple.mcfoodplus.client.entity.render.CatFishRenderer;
import me.purplepineapple.mcfoodplus.common.entities.CatFishEntity;
import me.purplepineapple.mcfoodplus.common.world.gen.FPGeneration;
import me.purplepineapple.mcfoodplus.core.registry.FPBlocks;
import me.purplepineapple.mcfoodplus.core.registry.FPEntityTypes;
import me.purplepineapple.mcfoodplus.core.registry.FPItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcfoodplus")
@Mod.EventBusSubscriber(modid = FoodPlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FoodPlus
{
    // Mod ID
    public static final String MOD_ID = "mcfoodplus";

    public FoodPlus() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        FPEntityTypes.ENTITY_TYPES.register(bus);
        FPItems.ITEMS.register(bus);
        FPBlocks.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FPGeneration::generateBushes);
        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(FoodPlus::mobAttributes);
        bus.addListener(FoodPlus::clientSetup);
    }

    public static void mobAttributes(EntityAttributeCreationEvent event) {
        event.put(FPEntityTypes.CATFISH_ENTITY.get(), CatFishEntity.createMobAttributes().build());
    }
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(FPBlocks.CORN_STALK.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(FPBlocks.BLUEBERRY_BUSH.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(FPBlocks.STRAWBERRY_BUSH.get(), RenderType.cutout());

        RenderingRegistry.registerEntityRenderingHandler(FPEntityTypes.CATFISH_ENTITY.get(), CatFishRenderer::new);
    }


}
