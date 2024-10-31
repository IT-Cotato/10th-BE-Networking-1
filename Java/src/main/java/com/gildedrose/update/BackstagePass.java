package com.gildedrose.update;

import com.gildedrose.Item;

public class BackstagePass extends ItemUpdateLogic {

    private static final int BACKSTAGE_THRESHOLD_10_DAYS = 10;
    private static final int BACKSTAGE_THRESHOLD_5_DAYS = 5;

    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn();
        increaseQuality(1);

        if (item.sellIn < BACKSTAGE_THRESHOLD_10_DAYS) {
            increaseQuality(1);
        }
        if (item.sellIn < BACKSTAGE_THRESHOLD_5_DAYS) {
            increaseQuality(1);
        }

        if (item.sellIn < 0) {
            item.quality = RESET_QUALITY;
        }
    }
}
