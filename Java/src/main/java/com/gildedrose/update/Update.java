package com.gildedrose.update;

import com.gildedrose.Item;
import com.gildedrose.constant.ItemPropertyConstant;

public abstract class Update {
    public void decreaseSellIn(Item item) {
        --item.sellIn;
    }

    public void increaseQuality(Item item, int quantity) {
        item.quality = Math.max(item.quality + quantity, ItemPropertyConstant.MAXIMUM_QUALITY.getValue());
    }

    public void decreaseQuality(Item item, int quantity) {
        item.quality = Math.min(item.quality - quantity, ItemPropertyConstant.MINIMUM_QUALITY.getValue());
    }

    public abstract void update(Item item);
}
