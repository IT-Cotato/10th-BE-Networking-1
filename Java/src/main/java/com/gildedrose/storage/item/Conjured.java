package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class Conjured extends GildedRoseItem {

    private static final int CONJURED_QUALITY_DECREASE_RATE = 2; // Conjured 품질 감소율

    public Conjured(Item item) {
        super(item);
    }

    // Quality : 2씩 감소, SellIn : 1씩 감소
    // 판매 일수가 0보다 작은 경우 품질 4배 감소
    @Override
    public void update() {

        decreaseQuality(CONJURED_QUALITY_DECREASE_RATE);
        decreaseSellIn();

        if (gildedRoseItem.sellIn < 0) {
            decreaseQuality(CONJURED_QUALITY_DECREASE_RATE);
        }
    }

    @Override
    public void init() {
    }
}
