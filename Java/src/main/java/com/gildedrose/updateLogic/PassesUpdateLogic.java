package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class PassesUpdateLogic implements UpdateLogic {
    @Override
    public void update(Item item) {
        item.sellIn -= 1;
        item.quality = item.quality < 50 ? item.quality + 1 : 50;

        if (item.sellIn <= 10) {
            item.quality = item.quality < 50 ? item.quality + 1 : 50;
        }

        if (item.sellIn <= 5) {
            item.quality = item.quality < 50 ? item.quality + 1 : 50;
        }

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
