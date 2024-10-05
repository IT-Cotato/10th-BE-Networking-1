package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public abstract class UpdateLogic {
    protected void decreaseSellIn(Item item) {
        item.sellIn -= 1;
    }

    public abstract void update(Item item);
}
