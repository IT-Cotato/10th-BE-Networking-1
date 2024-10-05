package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class PassesUpdateLogic extends UpdateLogic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        if (item.sellIn < 0) {
            resetQuality(item);
        } else if (item.sellIn <= 5) {
            increaseQuality(item, 3);
        } else if (item.sellIn <= 10) {
            increaseQuality(item, 2);
        } else {
            increaseQuality(item, 1);
        }

    }
}
