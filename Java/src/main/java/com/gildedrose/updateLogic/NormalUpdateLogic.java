package com.gildedrose.updateLogic;

import com.gildedrose.Constraints;
import com.gildedrose.Item;

public class NormalUpdateLogic extends UpdateLogic {
    private static final int QUALITY_DECREASE_NORMAL = 1;

    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        if (item.sellIn < 0) {
            decreaseQuality(item, QUALITY_DECREASE_NORMAL * Constraints.QUALITY_DECREASE_MULTIPLE.value());
        } else {
            decreaseQuality(item, QUALITY_DECREASE_NORMAL);
        }
    }
}
