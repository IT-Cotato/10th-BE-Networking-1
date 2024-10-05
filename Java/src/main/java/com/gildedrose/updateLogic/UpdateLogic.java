package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public abstract class UpdateLogic {
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;
    public static final int DOWN_MULTIPLE = 2;

    protected void decreaseSellIn(Item item) {
        item.sellIn -= 1;
    }

    protected void decreaseQuality(Item item, int decreaseAmount) {
        if (item.sellIn < 0) {
            item.quality = Math.max(item.quality - decreaseAmount * DOWN_MULTIPLE, MIN_QUALITY);
        } else {
            item.quality = Math.max(item.quality - decreaseAmount, MIN_QUALITY);
        }
    }

    protected void increaseQuality(Item item, int increaseAmount) {
        item.quality = Math.min(item.quality + increaseAmount, MAX_QUALITY);
    }

    protected void resetQuality(Item item) {
        item.quality = 0;
    }

    public abstract void update(Item item);
}
