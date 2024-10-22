package com.gildedrose.updateItem;

import static com.gildedrose.updateItem.ItemConstant.DEFAULT_DECREASE_QUALITY;
import static com.gildedrose.updateItem.ItemConstant.QUALITY_DECREASE_MULTIPLIER;

import com.gildedrose.Item;

public class ConjuredUpdateLogic implements UpdateLogic {
    private static final int CONJURED_DECREASE_MULTIPLIER = 2;

    @Override
    public void update(Item item) {
        int conjuredDefaultDecreaseQuality = CONJURED_DECREASE_MULTIPLIER * DEFAULT_DECREASE_QUALITY;
        if (item.sellIn <= 0) {
            item.quality = Math.max(0, item.quality - (conjuredDefaultDecreaseQuality * QUALITY_DECREASE_MULTIPLIER));
        } else {
            item.quality = Math.max(0, item.quality - conjuredDefaultDecreaseQuality);
        }

        item.sellIn--;
    }
}
