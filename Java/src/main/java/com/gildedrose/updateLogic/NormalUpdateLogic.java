package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class NormalUpdateLogic extends UpdateLogic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        decreaseQuality(item, 1);
    }
}
