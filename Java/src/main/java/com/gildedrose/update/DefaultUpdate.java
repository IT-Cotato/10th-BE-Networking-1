package com.gildedrose.update;

import com.gildedrose.Item;

import java.lang.Math;

import static com.gildedrose.constant.ItemPropertyConstant.*;

public class DefaultUpdate extends Update {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        increaseQuality(item, 1);
        increaseQualityBySellIn(item, 1);
    }
}
