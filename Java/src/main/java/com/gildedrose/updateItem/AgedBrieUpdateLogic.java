package com.gildedrose.updateItem;

import static com.gildedrose.updateItem.ItemConstant.MAXIMUM_QUALITY;

import com.gildedrose.Item;

public class AgedBrieUpdateLogic implements UpdateLogic {
    @Override
    public void update(Item item) {
        if (item.quality < MAXIMUM_QUALITY) {
            item.quality++;
        }

        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality++;
        }
    }
}
