package com.gildedrose.updateLogic;

import static com.gildedrose.Constraints.*;

import com.gildedrose.Item;

public abstract class UpdateLogic {

    protected void decreaseSellIn(Item item) {
        item.sellIn -= 1;
    }

    protected void decreaseQuality(Item item, int decreaseAmount) {
        item.quality = Math.max(item.quality - decreaseAmount, QUALITY_MINIMUM.value());
    }

    protected void increaseQuality(Item item, int increaseAmount) {
        item.quality = Math.min(item.quality + increaseAmount, QUALITY_MAXIMUM.value());
    }

    protected void resetQuality(Item item) {
        item.quality = QUALITY_MINIMUM.value();
    }

    public abstract void update(Item item);
}
