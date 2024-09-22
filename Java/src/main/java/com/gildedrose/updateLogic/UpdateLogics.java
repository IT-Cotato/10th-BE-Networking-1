package com.gildedrose.updateLogic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdateLogics {
    private final Map<String, UpdateLogic> updateLogicMap;
    private final List<String> filters = Arrays.asList("Aged Brie", "Backstage passes", "Conjured", "Sulfuras");

    public UpdateLogics() {
        updateLogicMap = new HashMap<>();

        updateLogicMap.put("Aged Brie", new BrieUpdateLogic());
        updateLogicMap.put("Backstage passes", new PassesUpdateLogic());
        updateLogicMap.put("Conjured", new ConjuredUpdateLogic());
        updateLogicMap.put("Sulfuras", new SulfurasUpdateLogic());
        updateLogicMap.put(null, new ElseUpdateLogic());
    }

    public UpdateLogic findUpdateLogic(String name) {
        for (String filter : filters) {
            if (name.contains(filter)) {
                return updateLogicMap.get(filter);
            }
        }
        return updateLogicMap.get(null);
    }
}
