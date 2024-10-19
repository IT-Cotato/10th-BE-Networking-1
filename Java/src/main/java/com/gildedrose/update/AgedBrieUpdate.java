package com.gildedrose.update;

import com.gildedrose.Item;

import java.lang.Math;

import static com.gildedrose.constant.ItemPropertyConstant.*;

public class AgedBrieUpdate extends Update {
    @Override
    public void update(Item item) {
        item.sellIn -= 1;
        item.quality = Math.min(item.quality + 1, MAXIMUM_QUALITY.getValue());

        if (item.sellIn < SELLIN_CRITERIA.getValue()) {
            item.quality = Math.min(item.quality + 1, MAXIMUM_QUALITY.getValue());
        }
    }
}
