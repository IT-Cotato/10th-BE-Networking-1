package com.gildedrose.update;

import com.gildedrose.Item;

public abstract class Update {
    public void decreaseSellIn(Item item) {
        --item.sellIn;
    }

    public abstract void update(Item item);
}
