package com.gildedrose.update;

import static com.gildedrose.constant.ItemName.*;

import com.gildedrose.constant.ItemName;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UpdateFactory {
    private final Map<ItemName, Update> updateMap = new ConcurrentHashMap<>();

    public UpdateFactory() {
        updateMap.put(AGED_BRIE, new AgedBrieUpdate());
        updateMap.put(BACKSTAGE_PASSES, new BackstagePassesUpdate());
        updateMap.put(SULFURAS, new SulfurasUpdate());
        updateMap.put(CONJURED, new ConjuredUpdate());
        updateMap.put(DEFAULT, new DefaultUpdate());
    }

    public Update getUpdate(ItemName itemName) {
        return updateMap.get(itemName);
    }
}
