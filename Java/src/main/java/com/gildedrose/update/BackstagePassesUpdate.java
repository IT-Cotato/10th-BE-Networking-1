package com.gildedrose.update;

import com.gildedrose.Item;

import java.lang.Math;

import static com.gildedrose.constant.ItemPropertyConstant.*;

public class BackstagePassesUpdate extends Update {
    private static final int INCREASE_QUANTITY = 1;
    private static final int INCREASE_QUANTITY_LESS_THAN_DAY_5 = 3;
    private static final int INCREASE_QUANTITY_LESS_THAN_DAY_10 = 2;

    private void increaseQualityBySellIn(Item item) {
        if (item.sellIn <= BACKSTAGE_DAY_OF_5.getValue()) {
            increaseQuality(item, INCREASE_QUANTITY_LESS_THAN_DAY_5);
        } else if (item.sellIn <= BACKSTAGE_DAY_OF_10.getValue()) {
            increaseQuality(item, INCREASE_QUANTITY_LESS_THAN_DAY_10);
        } else {
            increaseQuality(item, INCREASE_QUANTITY);
        }
    }

    @Override
    public void update(Item item) {
        increaseQualityBySellIn(item);
        decreaseSellIn(item);
        makeMinimumQualityBySellIn(item);
    }
}
