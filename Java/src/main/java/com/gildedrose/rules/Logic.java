package com.gildedrose.rules;

import com.gildedrose.Item;

public abstract class Logic {
    private static final int QUALITY_MAX = 50;
    private static final int QUALITY_MIN = 0;

    public abstract void update(Item item);

    protected void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    protected void decreaseQuality(int amount, Item item) {
        item.quality = Math.max(item.quality - amount, QUALITY_MIN);
    }

    protected void increaseQuality(int amount, Item item) {
        item.quality = Math.min(item.quality + amount, QUALITY_MAX);
    }

    protected boolean checkValid(Item item) {
        return item.sellIn >= 0;
    }

}
