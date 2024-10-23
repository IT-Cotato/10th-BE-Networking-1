package com.gildedrose;

import com.gildedrose.Item;
import com.gildedrose.rules.LogicFactory;

class GildedRose {
    Item[] items;
    LogicFactory logicFactory;

    public GildedRose(Item[] items) {
        this.items = items;
        this.logicFactory = new LogicFactory();
    }

    public void updateQuality() {
        for (Item item : items) {
            logicFactory.getLogic(item).update(item); //아이템에 맞는 로직을 찾아 quality와 sellIn 업데이트
        }
    }
}
