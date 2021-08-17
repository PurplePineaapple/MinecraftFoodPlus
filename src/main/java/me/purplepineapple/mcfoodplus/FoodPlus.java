package me.purplepineapple.mcfoodplus;

import me.purplepineapple.mcfoodplus.core.registry.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("mcfoodplus")
public class FoodPlus
{
    // Mod ID
    public static final String MOD_ID = "mcfoodplus";

    public FoodPlus() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }






}