package com.gildedrose.update;

import java.util.HashMap;
import java.util.Map;

import com.gildedrose.Item;

public class ItemUpdateLogicFactory {
    private static final Map<String, Class<? extends ItemUpdateLogic>> logicMap = new HashMap<>();

    static {
        logicMap.put("Aged Brie", AgedBrie.class);
        logicMap.put("Backstage passes to a TAFKAL80ETC concert", BackstagePass.class);
        logicMap.put("Sulfuras, Hand of Ragnaros", Sulfuras.class);
        logicMap.put("Conjured Mana Cake", Conjured.class);
    }

    public static ItemUpdateLogic ItemUpdateLogic(Item item) {
        Class<? extends ItemUpdateLogic> logicClass = logicMap.getOrDefault(item.name, NormalItem.class);
        try {
            // 생성자에 Item을 매개변수로 전달하여 인스턴스를 생성
            return logicClass.getDeclaredConstructor(Item.class).newInstance(item);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create ItemUpdateLogic for item: " + item.name, e);
        }
    }
}
