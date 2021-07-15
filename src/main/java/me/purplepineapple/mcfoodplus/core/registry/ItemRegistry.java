package me.purplepineapple.mcfoodplus.core.registry;

import me.purplepineapple.mcfoodplus.MCFoodPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCFoodPlus.MOD_ID);

    public static final RegistryObject<Item> BANANA = ITEMS.register( "banana", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodRegistry.BANANA)));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register( "blueberries", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodRegistry.BLUEBERRIES)));
    public static final RegistryObject<Item> CHERRIES = ITEMS.register( "cherries", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodRegistry.CHERRIES)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register( "orange", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodRegistry.ORANGE)));
    public static final RegistryObject<Item> PEAR = ITEMS.register( "pear", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodRegistry.PEAR)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register( "strawberry", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodRegistry.STRAWBERRY)));




}
