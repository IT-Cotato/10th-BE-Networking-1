package com.gildedrose.update;

import com.gildedrose.Item;

public class AgedBrie implements UpdateLogic{

    @Override
    public void update(Item item) {

        if (item.quality < 50) {
            item.quality++;
        }

        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality++;
        }
    }
}
