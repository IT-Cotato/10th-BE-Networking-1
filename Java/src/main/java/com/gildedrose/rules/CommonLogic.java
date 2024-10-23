package com.gildedrose.rules;

import com.gildedrose.Item;

public class CommonLogic extends Logic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        if (!checkValid(item)) {
            decreaseQuality(2, item);
        } else {
            decreaseQuality(1, item);
        }
    }
}
