package me.purplepineapple.mcfoodplus.core.itemgroup;

import me.purplepineapple.mcfoodplus.core.registry.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FoodPlusItemGroup extends ItemGroup {
    public static final FoodPlusItemGroup FOOD_PLUS = new FoodPlusItemGroup(ItemGroup.TABS.length, "food_plus");

    public FoodPlusItemGroup(int index, String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.CHERRIES.get());
    }
}
