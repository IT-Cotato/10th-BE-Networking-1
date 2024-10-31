package com.gildedrose;

import com.gildedrose.*;
import com.gildedrose.item.*;
import com.gildedrose.item.type.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemType itemType = ItemFactory.from(item);
            itemType.updateQuality(item);
        }
    }
}
