package me.purplepineapple.mcfoodplus.core.itemgroup;

import me.purplepineapple.mcfoodplus.core.registry.FPItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FPItemGroup extends ItemGroup {
    public static final FPItemGroup FOOD_PLUS = new FPItemGroup(ItemGroup.TABS.length, "food_plus");

    public FPItemGroup(int index, String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(FPItems.CHERRIES.get());
    }

}
