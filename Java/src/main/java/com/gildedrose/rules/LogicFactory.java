package com.gildedrose.rules;

import java.util.HashMap;
import java.util.Map;

import com.gildedrose.Item;

public class LogicFactory {
    public static Map<String, Logic> logics = new HashMap<String, Logic>();

    public LogicFactory() {
        logics.put("Common", new CommonLogic());
        logics.put("Aged Brie", new AgedBrieLogic());
        logics.put("Backstage passes to", new BackStagePassesLogic());
        logics.put("Sulfuras, Hand of Ragnaros", new SulfurasLogic());
        logics.put("Conjured", new ConjuredLogic());
    }

    public Logic getLogic(Item item) {
        for (String key : logics.keySet()) { //logics의 키에 있는 값을 이름에서 포함하는 지 검사하여 맞는 로직 선택
            if (item.name.contains(key)) {
                return logics.get(key);
            }
        }
        return logics.get("Common");
    }
}
