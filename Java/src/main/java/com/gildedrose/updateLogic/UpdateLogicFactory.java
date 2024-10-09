package com.gildedrose.updateLogic;

import static com.gildedrose.updateLogic.ItemCategory.*;

import java.util.HashMap;
import java.util.Map;

public class UpdateLogicFactory {
    private final Map<ItemCategory, UpdateLogic> updateLogicMap;
    private final Map<String, ItemCategory> itemMap;

    public UpdateLogicFactory() {
        updateLogicMap = new HashMap<>();
        itemMap = Map.ofEntries(Map.entry("Aged Brie", BRIE), Map.entry("Backstage passes", PASS),
            Map.entry("Conjured", CONJURED), Map.entry("Sulfuras", SULFURAS));

        updateLogicMap.put(BRIE, new BrieUpdateLogic());
        updateLogicMap.put(PASS, new PassesUpdateLogic());
        updateLogicMap.put(CONJURED, new ConjuredUpdateLogic());
        updateLogicMap.put(SULFURAS, new SulfurasUpdateLogic());
        updateLogicMap.put(ELSE, new ElseUpdateLogic());
    }

    public UpdateLogic findUpdateLogic(String name) {
        for (String key : itemMap.keySet()) {
            if (name.contains(key)) {
                return updateLogicMap.get(itemMap.get(key));
            }
        }
        return updateLogicMap.get(ELSE);
    }
}
