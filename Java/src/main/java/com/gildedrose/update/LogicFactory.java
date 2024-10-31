package com.gildedrose.update;

import java.util.HashMap;
import java.util.Map;

import com.gildedrose.Item;

public class LogicFactory {
    private static final Map<String, Logic> logicMap = new HashMap<>();

    static {
        logicMap.put("Aged Brie", new AgedBrie());
        logicMap.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePass());
        logicMap.put("Sulfuras, Hand of Ragnaros", new Sulfuras());
        logicMap.put("Conjured Mana Cake", new Conjured());
    }

    public static Logic getLogic(Item item) {
        return logicMap.getOrDefault(item.name, new NormalItem());
    }
}
