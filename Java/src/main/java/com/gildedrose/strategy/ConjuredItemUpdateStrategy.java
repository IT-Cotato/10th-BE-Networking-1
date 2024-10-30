package com.gildedrose.strategy;

import com.gildedrose.Item;

public class ConjuredItemUpdateStrategy extends AbstractItemUpdateStrategy {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        decreaseQualityTwiceAsFast(item);
        if (item.sellIn < 0) {
            decreaseQualityTwiceAsFast(item);
        }
    }
}
