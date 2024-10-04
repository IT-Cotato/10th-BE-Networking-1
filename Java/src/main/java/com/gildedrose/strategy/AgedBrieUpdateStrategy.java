package com.gildedrose.strategy;

import com.gildedrose.Item;

public class AgedBrieUpdateStrategy extends AbstractItemUpdateStrategy {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        increaseQualityLessThanMax(item);
    }
}
