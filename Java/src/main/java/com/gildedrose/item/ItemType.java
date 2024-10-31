package com.gildedrose.item;

import com.gildedrose.*;

public abstract class ItemType {

    public void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    public abstract void updateQuality(Item item);
}
