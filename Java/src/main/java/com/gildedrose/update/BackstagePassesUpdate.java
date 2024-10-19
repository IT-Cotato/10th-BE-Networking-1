package com.gildedrose.update;

import com.gildedrose.Item;

import java.lang.Math;

import static com.gildedrose.constant.ItemPropertyConstant.*;

public class BackstagePassesUpdate extends Update {
    @Override
    public void update(Item item) {
        if (item.sellIn <= BACKSTAGE_DAY_OF_5.getValue()) {
            item.quality = Math.min(item.quality + 3, MAXIMUM_QUALITY.getValue());
        } else if (item.sellIn <= BACKSTAGE_DAY_OF_10.getValue()) {
            item.quality = Math.min(item.quality + 2, MAXIMUM_QUALITY.getValue());
        } else {
            item.quality = Math.min(item.quality + 1, MAXIMUM_QUALITY.getValue());
        }

        decreaseSellIn(item);

        if (item.sellIn < SELLIN_CRITERIA.getValue()) {
            item.quality = MINIMUM_QUALITY.getValue();
        }
    }
}
