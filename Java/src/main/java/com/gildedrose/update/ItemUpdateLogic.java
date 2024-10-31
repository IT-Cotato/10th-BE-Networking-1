package com.gildedrose.update;

import com.gildedrose.Item;

public abstract class ItemUpdateLogic {
    protected static final int MAX_QUALITY = 50;
    protected static final int MIN_QUALITY = 0;
    protected static final int RESET_QUALITY = 0;
    protected static final int SELL_IN_DECREASE_RATE = 1;

    protected Item item;

    public ItemUpdateLogic(Item item) {
        this.item = item;
    }

    public abstract void update();

    protected void decreaseSellIn() {
        item.sellIn -= SELL_IN_DECREASE_RATE;
    }

    protected void increaseQuality(int amount) {
        item.quality = Math.min(MAX_QUALITY, item.quality + amount);
    }

    protected void decreaseQuality(int amount) {
        item.quality = Math.max(MIN_QUALITY, item.quality - amount);
    }
}
