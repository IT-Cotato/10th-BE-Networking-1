package com.gildedrose.updateItem;

import static com.gildedrose.updateItem.ItemConstant.MAXIMUM_QUALITY;

import com.gildedrose.Item;

public class BackStageConcertUpdateLogic implements UpdateLogic {
    public static final int SOLD_OUT_QUALITY = 0;
    public static final int QUALITY_INCREASE_THRESHOLD_5 = 5;
    public static final int QUALITY_INCREASE_THRESHOLD_10 = 10;

    @Override
    public void update(Item item) {
        if (item.sellIn > QUALITY_INCREASE_THRESHOLD_10) {
            item.quality = Math.min(item.quality + 1, MAXIMUM_QUALITY);
        } else if (item.sellIn > QUALITY_INCREASE_THRESHOLD_5) {
            item.quality = Math.min(item.quality + 2, MAXIMUM_QUALITY);
        } else if (item.sellIn > SOLD_OUT_QUALITY) {
            item.quality = Math.min(item.quality + 3, MAXIMUM_QUALITY);
        } else {
            item.quality = SOLD_OUT_QUALITY;
        }
    }
}
