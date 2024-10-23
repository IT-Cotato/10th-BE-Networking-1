package com.gildedrose.rules;

import com.gildedrose.Item;

public class BackStagePassesLogic extends Logic {
    @Override
    public void update(Item item) {
        if (item.sellIn <= 5) {
            increaseQuality(3, item);
        } else if (item.sellIn <= 10) {
            increaseQuality(2, item);
        } else {
            increaseQuality(1, item);
        }

        decreaseSellIn(item);

        if (!checkValid(item)) {
            item.quality = 0;
        }
    }
}
