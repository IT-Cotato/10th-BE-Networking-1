package com.gildedrose.update;

import com.gildedrose.Item;

import java.lang.Math;

import static com.gildedrose.constant.ItemPropertyConstant.*;

public class BackstagePassesUpdate extends Update {
    private void increaseQualityBySellIn(Item item) {
        if (item.sellIn <= BACKSTAGE_DAY_OF_5.getValue()) {
            increaseQuality(item, 3);
        } else if (item.sellIn <= BACKSTAGE_DAY_OF_10.getValue()) {
            increaseQuality(item, 2);
        } else {
            increaseQuality(item, 1);
        }
    }

    @Override
    public void update(Item item) {
        increaseQualityBySellIn(item);

        decreaseSellIn(item);

        if (item.sellIn < SELLIN_CRITERIA.getValue()) {
            item.quality = MINIMUM_QUALITY.getValue();
        }
    }
}
