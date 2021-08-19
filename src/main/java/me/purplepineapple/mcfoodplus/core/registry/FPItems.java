package me.purplepineapple.mcfoodplus.core.registry;

import me.purplepineapple.mcfoodplus.FoodPlus;
import me.purplepineapple.mcfoodplus.common.items.FPSpawnEggItem;
import me.purplepineapple.mcfoodplus.core.itemgroup.FPItemGroup;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.FishBucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FPItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodPlus.MOD_ID);

    public static final RegistryObject<Item> BANANA = ITEMS.register( "banana", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.BANANA)));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register( "blueberries", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.BLUEBERRIES)));
    public static final RegistryObject<Item> CHERRIES = ITEMS.register( "cherries", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.CHERRIES)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register( "orange", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.ORANGE)));
    public static final RegistryObject<Item> PEAR = ITEMS.register( "pear", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.PEAR)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register( "strawberry", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.STRAWBERRY)));
    public static final RegistryObject<Item> CATFISH = ITEMS.register("catfish", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.CATFISH)));
    public static final RegistryObject<Item> BASS = ITEMS.register("bass", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.BASS)));
    public static final RegistryObject<Item> CARP = ITEMS.register("carp", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.CARP)));
    public static final RegistryObject<Item> TROUT = ITEMS.register("trout", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.TROUT)));
    public static final RegistryObject<Item> COOKED_CATFISH = ITEMS.register("cooked_catfish", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.COOKED_CATFISH)));
    public static final RegistryObject<Item> COOKED_BASS = ITEMS.register("cooked_bass", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.COOKED_BASS)));
    public static final RegistryObject<Item> COOKED_CARP = ITEMS.register("cooked_carp", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.COOKED_CARP)));
    public static final RegistryObject<Item> COOKED_TROUT = ITEMS.register("cooked_trout", () ->
            new Item(new Item.Properties().tab(FPItemGroup.FOOD_PLUS).food(FPFoods.COOKED_TROUT)));
    public static final RegistryObject<Item> CATFISH_BUCKET = ITEMS.register("catfish_bucket", () ->
            new FishBucketItem(FPEntityTypes.CATFISH_ENTITY, () -> Fluids.WATER, new Item.Properties().tab(FPItemGroup.FOOD_PLUS)));

    public static final RegistryObject<FPSpawnEggItem> CATFISH_SPAWN_EGG = ITEMS.register("catfish_spawn_egg", () ->
            new FPSpawnEggItem(FPEntityTypes.CATFISH_TYPE, 16381678, 3684651));

    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds", () ->
            new BlockNamedItem(FPBlocks.CORN_STALK.get(), new Item.Properties().tab(FPItemGroup.FOOD_PLUS)));






}
