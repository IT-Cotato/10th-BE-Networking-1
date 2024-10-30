package com.gildedrose.updateLogic;

import com.gildedrose.Constraints;
import com.gildedrose.Item;

public class BrieUpdateLogic extends UpdateLogic {
    private static final int QUALITY_INCREASE_BRIE = 1;

    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        if (item.sellIn < Constraints.MULTIPLE_START_DAY.value()) {
            increaseQuality(item, QUALITY_INCREASE_BRIE * Constraints.QUALITY_INCREASE_MULTIPLE.value());
        } else {
            increaseQuality(item, QUALITY_INCREASE_BRIE);
        }
    }
}
