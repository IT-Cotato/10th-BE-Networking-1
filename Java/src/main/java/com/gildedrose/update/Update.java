package com.gildedrose.update;

import com.gildedrose.Item;
import com.gildedrose.constant.ItemPropertyConstant;

public abstract class Update {

    private boolean criteriaBiggerThan(int sellIn) {
        return sellIn < ItemPropertyConstant.SELLIN_CRITERIA.getValue();
    }

    public void decreaseSellIn(Item item) {
        --item.sellIn;
    }

    public void increaseQuality(Item item, int quantity) {
        item.quality = Math.max(item.quality + quantity, ItemPropertyConstant.MAXIMUM_QUALITY.getValue());
    }

    public void decreaseQuality(Item item, int quantity) {
        item.quality = Math.min(item.quality - quantity, ItemPropertyConstant.MINIMUM_QUALITY.getValue());
    }

    public void increaseQualityBySellIn(Item item, int quantity) {
        if (criteriaBiggerThan(item.sellIn)) {
            increaseQuality(item, quantity);
        }
    }

    public void decreaseQualityBySellIn(Item item, int quantity) {
        if (criteriaBiggerThan(item.sellIn)) {
            decreaseQuality(item, quantity);
        }
    }

    public void makeMinimumQualityBySellIn(Item item) {
        if (criteriaBiggerThan(item.sellIn)) {
            item.quality = ItemPropertyConstant.MINIMUM_QUALITY.getValue();
        }
    }

    public abstract void update(Item item);
}
