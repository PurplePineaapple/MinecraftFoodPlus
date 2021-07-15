package me.purplepineapple.mcfoodplus.core.registry;

import me.purplepineapple.mcfoodplus.FoodPlus;
import me.purplepineapple.mcfoodplus.core.itemgroup.FoodPlusItemGroup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodPlus.MOD_ID);

    public static final RegistryObject<Item> BANANA = ITEMS.register( "banana", () ->
            new Item(new Item.Properties().tab(FoodPlusItemGroup.FOOD_PLUS).food(FoodRegistry.BANANA)));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register( "blueberries", () ->
            new Item(new Item.Properties().tab(FoodPlusItemGroup.FOOD_PLUS).food(FoodRegistry.BLUEBERRIES)));
    public static final RegistryObject<Item> CHERRIES = ITEMS.register( "cherries", () ->
            new Item(new Item.Properties().tab(FoodPlusItemGroup.FOOD_PLUS).food(FoodRegistry.CHERRIES)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register( "orange", () ->
            new Item(new Item.Properties().tab(FoodPlusItemGroup.FOOD_PLUS).food(FoodRegistry.ORANGE)));
    public static final RegistryObject<Item> PEAR = ITEMS.register( "pear", () ->
            new Item(new Item.Properties().tab(FoodPlusItemGroup.FOOD_PLUS).food(FoodRegistry.PEAR)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register( "strawberry", () ->
            new Item(new Item.Properties().tab(FoodPlusItemGroup.FOOD_PLUS).food(FoodRegistry.STRAWBERRY)));




}
