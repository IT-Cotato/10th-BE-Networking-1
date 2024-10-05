package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class BrieUpdateLogic extends UpdateLogic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        if (item.sellIn < 0) {
            increaseQuality(item, 2);
        } else {
            increaseQuality(item, 1);
        }
    }
}
