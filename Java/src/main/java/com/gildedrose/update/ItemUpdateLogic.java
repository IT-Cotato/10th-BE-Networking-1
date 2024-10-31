package com.gildedrose.update;

import com.gildedrose.Item;

public abstract class ItemUpdateLogic {
    protected Item item;

    public ItemUpdateLogic(Item item) {
        this.item = item;
    }

    public abstract void update();
}
