package com.gildedrose.rules;

import com.gildedrose.Item;

public class ConjuredLogic extends Logic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        if (!checkValid(item)) {
            decreaseQuality(4, item);
        } else {
            decreaseQuality(2, item);
        }
    }
}
