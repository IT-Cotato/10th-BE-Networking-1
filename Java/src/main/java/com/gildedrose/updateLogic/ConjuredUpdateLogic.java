package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class ConjuredUpdateLogic implements UpdateLogic {
    @Override
    public void update(Item item) {
        item.sellIn -= 1;
        item.quality = item.quality >= 2 ? item.quality - 2 : 0;

        if (item.sellIn < 0) {
            item.quality = item.quality > 0 ? item.quality - 2 : 0;
        }
    }
}
