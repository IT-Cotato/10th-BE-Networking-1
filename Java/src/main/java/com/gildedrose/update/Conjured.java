package com.gildedrose.update;

import com.gildedrose.Item;

public class Conjured implements ItemUpdateLogic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        decreaseQualityTwice(item);
        if (item.sellIn < 0) {
            decreaseQualityTwice(item);
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    private void decreaseQualityTwice(Item item) {
        if (item.quality > 0) {
            item.quality = Math.max(0, item.quality - 2);
        }
    }
}
