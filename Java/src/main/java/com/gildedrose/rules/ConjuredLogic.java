package com.gildedrose.rules;

import com.gildedrose.Item;

public class ConjuredLogic implements Logic{
    @Override
    public void update(Item item) {
        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality -= 4;

        } else {
            item.quality-=2;
        }

        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
