package com.gildedrose.update;

import com.gildedrose.Item;

public class NormalItem extends ItemUpdateLogic {

    public NormalItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn(item);
        decreaseQuality(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
