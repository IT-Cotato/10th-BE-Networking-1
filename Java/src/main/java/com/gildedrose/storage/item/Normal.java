package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class Normal extends GildedRoseItem {

    public Normal(Item item) {
        super(item);
    }

    @Override
    public void update() {

        decreaseQuality(1);
        decreaseSellIn();

        if (gildedRoseItem.sellIn < 0) // 판매 일수가 0보다 작은 경우 품질 2배 감소
            decreaseQuality(1);
    }

    @Override
    public void init() {
    }
}
