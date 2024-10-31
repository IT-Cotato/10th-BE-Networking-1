package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public class BackstagePass implements UpdateLogic{

    private static final int BACKSTAGE_SELL_IN_THRESHOLD_10 = 10;
    private static final int BACKSTAGE_SELL_IN_THRESHOLD_5 = 5;

    @Override
    public void update(Item item) {

        if (item.quality < QUALITY_MAX) {
            item.quality++;
            if (item.sellIn <= BACKSTAGE_SELL_IN_THRESHOLD_10 && item.quality < QUALITY_MAX) {
                item.quality++;
            }
            if (item.sellIn <= BACKSTAGE_SELL_IN_THRESHOLD_5 && item.quality < QUALITY_MAX) {
                item.quality++;
            }
        }

        item.sellIn--;

        if (item.sellIn < QUALITY_MIN) {
            item.quality = QUALITY_MIN;
        }
    }
}
