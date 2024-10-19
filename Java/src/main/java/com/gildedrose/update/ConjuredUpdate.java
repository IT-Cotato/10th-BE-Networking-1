package com.gildedrose.update;

import com.gildedrose.Item;

import java.lang.Math;

import static com.gildedrose.constant.ItemPropertyConstant.*;

public class ConjuredUpdate extends Update {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        decreaseQuality(item, 2);

        if (item.sellIn < SELLIN_CRITERIA.getValue()) {
            decreaseQuality(item ,2);
        }
    }
}
