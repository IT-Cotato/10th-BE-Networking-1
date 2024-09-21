package com.gildedrose.updateItem;

import static com.gildedrose.updateItem.ItemClassification.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UpdateLogicFactory {
    private final Map<ItemClassification, UpdateLogic> logicMap = new ConcurrentHashMap<>();

    public UpdateLogicFactory() {
        logicMap.put(AGED_BRIE, new AgedBrieUpdateLogic());
        logicMap.put(SULFURAS, new SulfurasUpdateLogic());
        logicMap.put(BACKSTAGE_CONCERT, new BackStageConcertUpdateLogic());
        logicMap.put(OTHERS, new DefaultUpdateLogic());
    }

    public UpdateLogic findUpdateLogic(ItemClassification itemClassification) {
        return logicMap.get(itemClassification);
    }
}
