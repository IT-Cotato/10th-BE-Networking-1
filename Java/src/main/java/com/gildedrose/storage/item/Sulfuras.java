package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class Sulfuras extends GildedRoseItem {

    public Sulfuras(Item item) {
        super(item);
    }

    @Override
    public void update() {
        // Sulfuras는 판매 일수나 품질이 변하지 않음
    }

    public void init() {
        setQuality(80);
    }

}
