package com.gildedrose.update;

import com.gildedrose.Item;

public class AgedBrie implements UpdateLogic{

    @Override
    public void update(Item item) {

        if (item.quality < ItemConstants.QUALITY_MAX) {
            item.quality++;
        }

        item.sellIn--;

        if (item.sellIn < ItemConstants.QUALITY_MIN) {
            item.quality++;
        }
    }
}
