package com.gildedrose.rules;

import com.gildedrose.Item;

public class CommonLogic implements Logic{
    @Override
    public void update(Item item) {
        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality -= 2;

        } else {
            item.quality--;
        }

        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
