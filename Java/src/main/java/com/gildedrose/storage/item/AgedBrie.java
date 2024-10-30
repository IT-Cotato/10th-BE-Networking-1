package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class AgedBrie extends GildedRoseItem {

    public AgedBrie(Item item) {
        super(item);
    }

    // Quality : 1씩 증가, SellIn : 1씩 감소
    // 판매 일수가 0보다 작은 경우 품질 2배 증가
    @Override
    public void update() {

        increaseQuality(COMMON_QUALITY_INCREASE_RATE);
        decreaseSellIn();

        if (gildedRoseItem.sellIn < 0) {
            increaseQuality(COMMON_QUALITY_INCREASE_RATE);
        }
    }

    @Override
    public void init() {
    }
}
