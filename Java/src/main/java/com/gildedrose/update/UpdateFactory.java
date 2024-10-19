package com.gildedrose.update;

import static com.gildedrose.constant.ItemName.*;

import com.gildedrose.constant.ItemName;

import java.util.HashMap;
import java.util.Map;

public class UpdateFactory {
    private final Map<ItemName, Update> updateHandlerMap = new HashMap<>();

    public UpdateFactory() {
        updateHandlerMap.put(AGED_BRIE, new AgedBrieUpdate());
        updateHandlerMap.put(BACKSTAGE_PASSES, new BackstagePassesUpdate());
        updateHandlerMap.put(SULFURAS, new SulfurasUpdate());
        updateHandlerMap.put(CONJURED, new ConjuredUpdate());
        updateHandlerMap.put(DEFAULT, new DefaultUpdate());
    }

    public Update getUpdateHandler(ItemName itemName) {
        return updateHandlerMap.get(itemName);
    }
}
