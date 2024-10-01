package com.gildedrose.update;

import com.gildedrose.Item;

import java.lang.Math;

import static com.gildedrose.constant.ItemPropertyConstant.*;

public class DefaultUpdate implements Update {
    @Override
    public void update(Item item) {
        item.sellIn -= 1;
        item.quality = Math.max(item.quality - 1, MINIMUM_QUALITY.getValue());

        if (item.sellIn < SELLIN_CRITERIA.getValue()) {
            item.quality = Math.max(item.quality - 1, MINIMUM_QUALITY.getValue());
        }
    }
}
