package com.gildedrose.updateItem;

import com.gildedrose.Item;

public class DefaultUpdateLogic implements UpdateLogic {
    @Override
    public void update(Item item) {
        if (item.sellIn <= 0) {
            item.quality = Math.max(0, item.quality - 2);
        } else {
            item.quality = Math.max(0, item.quality - 1);
        }

        item.sellIn--;
    }
}
