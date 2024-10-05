package com.gildedrose.updateLogic;

import static com.gildedrose.updateLogic.ItemCategory.*;

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
        updateLogicMap.put(ELSE, new ElseUpdateLogic());
    }

    public UpdateLogic findUpdateLogic(String name) {
        if (name.contains("Aged Brie")) {
            return updateLogicMap.get(BRIE);
        } else if (name.contains("Backstage passes")) {
            return updateLogicMap.get(PASS);
        } else if (name.contains("Conjured")) {
            return updateLogicMap.get(CONJURED);
        } else if (name.contains("Sulfuras")) {
            return updateLogicMap.get(SULFURAS);
        } else
            return updateLogicMap.get(ELSE);
    }
}
