package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class PassesUpdateLogic extends UpdateLogic {
    private static final int QUALITY_INCREASE_PASSES_V1 = 1;
    private static final int QUALITY_INCREASE_PASSES_V2 = 2;
    private static final int QUALITY_INCREASE_PASSES_V3 = 3;

    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        if (item.sellIn < 0) {
            resetQuality(item);
        } else if (item.sellIn <= 5) {
            increaseQuality(item, QUALITY_INCREASE_PASSES_V3);
        } else if (item.sellIn <= 10) {
            increaseQuality(item, QUALITY_INCREASE_PASSES_V2);
        } else {
            increaseQuality(item, QUALITY_INCREASE_PASSES_V1);
        }

    }
}
