package com.gildedrose.updateItem;

import static com.gildedrose.updateItem.ItemConstant.DEFAULT_DECREASE_QUALITY;
import static com.gildedrose.updateItem.ItemConstant.QUALITY_DECREASE_MULTIPLIER;

import com.gildedrose.Item;

public class DefaultUpdateLogic implements UpdateLogic {
    @Override
    public void update(Item item) {
        if (item.sellIn <= 0) {
            item.quality = Math.max(0, item.quality - (DEFAULT_DECREASE_QUALITY * QUALITY_DECREASE_MULTIPLIER));
        } else {
            item.quality = Math.max(0, item.quality - DEFAULT_DECREASE_QUALITY);
        }

        item.sellIn--;
    }
}
