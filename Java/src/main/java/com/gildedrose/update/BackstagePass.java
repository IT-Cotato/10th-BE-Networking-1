package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public class BackstagePass extends UpdateLogic {

    private static final int BACKSTAGE_SELL_IN_THRESHOLD_10 = 10;
    private static final int BACKSTAGE_SELL_IN_THRESHOLD_5 = 5;

    @Override
    public void update(Item item) {

        if (item.sellIn <= BACKSTAGE_SELL_IN_THRESHOLD_10) {
            increaseQuality(item, DEFAULT_QUALITY_INCREMENT);
        }
        if (item.sellIn <= BACKSTAGE_SELL_IN_THRESHOLD_5) {
            increaseQuality(item, DEFAULT_QUALITY_INCREMENT);
        }

        decreaseSellIn(item);

        if (item.sellIn < QUALITY_MIN) {
            item.quality = QUALITY_MIN;
        }
    }
}
