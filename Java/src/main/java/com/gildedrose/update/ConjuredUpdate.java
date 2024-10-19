package com.gildedrose.update;

import com.gildedrose.Item;

public class ConjuredUpdate extends Update {
    private static final int DECREASE_QUANTITY = 2;
    private static final int DECREASE_QUANTITY_OVER_DATE = 2;

    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        decreaseQuality(item, DECREASE_QUANTITY);
        decreaseQualityBySellIn(item, DECREASE_QUANTITY_OVER_DATE);
    }
}
