package com.gildedrose;

import com.gildedrose.update.Logic;
import com.gildedrose.update.LogicFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            Logic logic = LogicFactory.getLogic(item);
            logic.update(item);
        }
    }
}
