package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class Conjured extends GildedRoseItem {

    public Conjured(Item item) {
        super(item);
    }

    @Override
    public void update() {

        decreaseQuality(2);
        decreaseSellIn();

        if (gildedRoseItem.sellIn < 0) // 판매 일수가 0보다 작은 경우 품질 2배 감소
            decreaseQuality(2);
    }

    @Override
    public void init() {
    }
}
