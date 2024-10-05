package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public abstract class UpdateLogic {
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;
    public static final int DOWN_MULTIPLE = 2;

    protected void decreaseSellIn(Item item) {
        item.sellIn -= 1;
    }

    protected void decreaseQuality(Item item, int downAmount) {
        if (item.sellIn < 0) {
            item.quality = Math.max(item.quality - downAmount * DOWN_MULTIPLE, MIN_QUALITY);
        } else {
            item.quality = Math.max(item.quality - downAmount, MIN_QUALITY);
        }
    }

    protected void increaseQuality(Item item) {
        item.quality = Math.min(item.quality + 1, MAX_QUALITY);
    }

    public abstract void update(Item item);
}
