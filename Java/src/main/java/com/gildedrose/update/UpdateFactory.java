package com.gildedrose.update;

import static com.gildedrose.constant.ItemNameConstant.*;

import com.gildedrose.constant.ItemNameConstant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UpdateFactory {
    private final Map<ItemNameConstant, Update> updateMap = new ConcurrentHashMap<>();

    public UpdateFactory() {
        updateMap.put(AGED_BRIE, new AgedBrieUpdate());
        updateMap.put(BACKSTAGE_PASSES, new BackstagePassesUpdate());
        updateMap.put(SULFURAS, new SulfurasUpdate());
        updateMap.put(CONJURED, new ConjuredUpdate());
        updateMap.put(DEFAULT, new DefaultUpdate());
    }

    public Update getUpdate(ItemNameConstant itemName) {
        return updateMap.get(itemName);
    }
}
