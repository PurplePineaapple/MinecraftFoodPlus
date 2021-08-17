package me.purplepineapple.mcfoodplus.common.items;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import me.purplepineapple.mcfoodplus.core.itemgroup.FPItemGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;

import java.util.Map;

public class FPSpawnEggItem extends SpawnEggItem {
    public static final Map<EntityType<?>, FPSpawnEggItem> EGGS = Maps.newIdentityHashMap();

    public FPSpawnEggItem(EntityType<?> entityType, int eggColor, int spotsColor) {
        super(entityType, eggColor, spotsColor, new Properties()
                .tab(FPItemGroup.FOOD_PLUS));
        EGGS.put(entityType, this);
    }

    public static Iterable<FPSpawnEggItem> FPEggs() {
        return Iterables.unmodifiableIterable(EGGS.values());
    }


}
