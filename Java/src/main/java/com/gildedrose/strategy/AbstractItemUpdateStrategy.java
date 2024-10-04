package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.ItemUpdateStrategy;

public abstract class AbstractItemUpdateStrategy implements ItemUpdateStrategy {
    protected static final int MAX_QUALITY = 50;
    protected static final int MIN_QUALITY = 0;

    protected void increaseQualityLessThanMax(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
    }

    protected void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    protected void decreaseQualityMoreThanMin(Item item) {
        if (item.quality > MIN_QUALITY) {
            item.quality--;
        }
    }

    protected void decreaseQualityTwiceAsFast(Item item) {
        if (item.quality > MIN_QUALITY) {
            item.quality = Math.max(item.quality - 2, MIN_QUALITY);
        }
    }
}
