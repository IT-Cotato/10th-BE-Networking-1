package com.gildedrose.update;

import com.gildedrose.Item;

import java.lang.Math;

import static com.gildedrose.constant.ItemPropertyConstant.*;

public class DefaultUpdate extends Update {
    private static final int INCREASE_QUANTITY = 1;
    private static final int INCREASE_QUANTITY_OVER_DATE = 1;

    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        increaseQuality(item, INCREASE_QUANTITY);
        increaseQualityBySellIn(item, INCREASE_QUANTITY_OVER_DATE);
    }
}
