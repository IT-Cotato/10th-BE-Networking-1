package com.gildedrose;

import com.gildedrose.update.ItemUpdateLogic;
import com.gildedrose.update.ItemUpdateLogicFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdateLogic itemUpdateLogic = ItemUpdateLogicFactory.ItemUpdateLogic(item);
            itemUpdateLogic.update(item);
        }
    }
}
