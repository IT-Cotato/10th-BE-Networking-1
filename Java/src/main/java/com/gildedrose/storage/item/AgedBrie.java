package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class AgedBrie extends GildedRoseItem {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void update() {

        increaseQuality(1);
        decreaseSellIn();

        if (gildedRoseItem.sellIn < 0) // 판매 일수가 0보다 작은 경우 품질 2배 증가
            increaseQuality(1);
    }

    @Override
    public void init() {
    }
}
