package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class Normal extends GildedRoseItem {

    public Normal(Item item) {
        super(item);
    }

    // Quality : 1씩 감소, SellIn : 1씩 감소
    // 판매 일수가 0보다 작은 경우 품질 2배 감소
    @Override
    public void update() {

        decreaseQuality(COMMON_QUALITY_DECREASE_RATE);
        decreaseSellIn();

        if (gildedRoseItem.sellIn < 0) {
            decreaseQuality(COMMON_QUALITY_DECREASE_RATE);
        }
    }

    @Override
    public void init() {
    }
}
