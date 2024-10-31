package com.gildedrose.update;

import java.util.HashMap;
import java.util.Map;

import com.gildedrose.Item;

public class ItemUpdateLogicFactory {
    private static final Map<String, ItemUpdateLogic> logicMap = new HashMap<>();

    static {
        logicMap.put("Aged Brie", new AgedBrie());
        logicMap.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePass());
        logicMap.put("Sulfuras, Hand of Ragnaros", new Sulfuras());
        logicMap.put("Conjured Mana Cake", new Conjured());
    }

    public static ItemUpdateLogic ItemUpdateLogic(Item item) {
        return logicMap.getOrDefault(item.name, new NormalItem());
    }
}
