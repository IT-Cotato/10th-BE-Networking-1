package com.gildedrose.update;

import com.gildedrose.Item;

public class Conjured implements UpdateLogic{

    @Override
    public void update(Item item) {

        if (item.quality > 0) {
            item.quality -= 2;
        }

        item.sellIn--;

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 2;
        }

        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
