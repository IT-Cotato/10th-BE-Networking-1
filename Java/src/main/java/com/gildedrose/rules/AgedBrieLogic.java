package com.gildedrose.rules;

import com.gildedrose.Item;

public class AgedBrieLogic extends Logic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        increaseQuality(1, item);
        if (!checkValid(item)) {
            increaseQuality(1, item);
        }
    }
}
