package com.gildedrose.updateLogic;

import com.gildedrose.Constraints;
import com.gildedrose.Item;

public class ConjuredUpdateLogic extends UpdateLogic {
    private static final int QUALITY_DECREASE_CONJURED = 2;

    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        if (item.sellIn < Constraints.MULTIPLE_START_DAY.value()) {
            decreaseQuality(item, QUALITY_DECREASE_CONJURED * Constraints.QUALITY_DECREASE_MULTIPLE.value());
        } else {
            decreaseQuality(item, QUALITY_DECREASE_CONJURED);
        }

    }
}
