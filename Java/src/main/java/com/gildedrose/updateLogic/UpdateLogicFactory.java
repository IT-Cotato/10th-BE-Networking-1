package com.gildedrose.updateLogic;

import static com.gildedrose.updateLogic.ItemCategory.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UpdateLogicFactory {
    private final Map<ItemCategory, UpdateLogic> updateLogicMap;

    public UpdateLogicFactory() {
        updateLogicMap = new HashMap<>();

        updateLogicMap.put(BRIE, new BrieUpdateLogic());
        updateLogicMap.put(PASS, new PassesUpdateLogic());
        updateLogicMap.put(CONJURED, new ConjuredUpdateLogic());
        updateLogicMap.put(SULFURAS, new SulfurasUpdateLogic());
        updateLogicMap.put(NORMAL, new NormalUpdateLogic());
    }

    public UpdateLogic findUpdateLogic(String name) {
        ItemCategory itemCategory = Arrays.stream(ItemCategory.values())
            .filter(category -> name.contains(category.value()))
            .findFirst()
            .orElse(NORMAL);
        return updateLogicMap.get(itemCategory);
    }
}
