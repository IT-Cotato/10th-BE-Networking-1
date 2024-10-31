package com.gildedrose.update;

import com.gildedrose.Item;

public class BackstagePass extends ItemUpdateLogic {

    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    public void update() {
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
