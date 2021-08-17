package me.purplepineapple.mcfoodplus.core.registry;

import net.minecraft.item.Food;

public class FPFoods {
    // Fruit
    public static final Food BANANA = new Food.Builder()
            .nutrition(2)
            .saturationMod(0.325F)
            .build();
    public static final Food BLUEBERRIES = new Food.Builder()
            .nutrition(2)
            .saturationMod(0.3F)
            .build();
    public static final Food CHERRIES = new Food.Builder()
            .nutrition(2)
            .saturationMod(0.3F)
            .build();
    public static final Food ORANGE = new Food.Builder()
            .nutrition(3)
            .saturationMod(0.375F)
            .build();
    public static final Food PEAR = new Food.Builder()
            .nutrition(2)
            .saturationMod(0.375F)
            .build();
    public static final Food STRAWBERRY = new Food.Builder()
            .nutrition(2)
            .saturationMod(0.3F)
            .build();
    // Fish
    public static final Food CATFISH = new Food.Builder()
            .nutrition(2)
            .saturationMod(0.1F)
            .build();
    public static final Food BASS = new Food.Builder()
            .nutrition(2)
            .saturationMod(0.1F)
            .build();
    public static final Food CARP = new Food.Builder()
            .nutrition(2)
            .saturationMod(0.1F)
            .build();
    public static final Food TROUT = new Food.Builder()
            .nutrition(2)
            .saturationMod(0.1F)
            .build();
    public static final Food COOKED_CATFISH = new Food.Builder()
            .nutrition(5)
            .saturationMod(0.6F)
            .build();
    public static final Food COOKED_BASS = new Food.Builder()
            .nutrition(5)
            .saturationMod(0.6F)
            .build();
    public static final Food COOKED_CARP = new Food.Builder()
            .nutrition(5)
            .saturationMod(0.6F)
            .build();
    public static final Food COOKED_TROUT = new Food.Builder()
            .nutrition(5)
            .saturationMod(0.6F)
            .build();
}
