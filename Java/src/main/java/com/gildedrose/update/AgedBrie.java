package com.gildedrose.update;

import com.gildedrose.Item;

public class AgedBrie implements Logic{
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        increaseQuality(item);
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
