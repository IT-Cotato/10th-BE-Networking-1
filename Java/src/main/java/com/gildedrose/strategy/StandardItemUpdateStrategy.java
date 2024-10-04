package com.gildedrose.strategy;

import com.gildedrose.Item;

public class StandardItemUpdateStrategy extends AbstractItemUpdateStrategy {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        if (item.sellIn < 0) {
            decreaseQualityTwiceAsFast(item);
        } else {
            decreaseQualityMoreThanMin(item);
        }
    }
}
