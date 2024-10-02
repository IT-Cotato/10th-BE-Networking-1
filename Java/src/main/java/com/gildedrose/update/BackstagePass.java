package com.gildedrose.update;

import com.gildedrose.Item;

public class BackstagePass implements Logic{
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        increaseQuality(item);

        if (item.sellIn <= 10) {
            increaseQuality(item);
        }

        if (item.sellIn <= 5) {
            increaseQuality(item);
        }

        if (item.sellIn < 0) {
            item.quality = 0;
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
