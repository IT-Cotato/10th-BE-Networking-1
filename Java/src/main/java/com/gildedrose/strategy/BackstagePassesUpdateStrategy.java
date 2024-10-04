package com.gildedrose.strategy;

import com.gildedrose.Item;

public class BackstagePassesUpdateStrategy extends AbstractItemUpdateStrategy {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        increaseQualityLessThanMax(item);

        if (item.sellIn < 0) {
            item.quality = 0;
        } else {
            if (item.sellIn <= 10) {
                increaseQualityLessThanMax(item);
            }
            if (item.sellIn <= 5) {
                increaseQualityLessThanMax(item);
            }
        }
    }
}
