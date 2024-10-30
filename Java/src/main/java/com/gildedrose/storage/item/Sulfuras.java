package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class Sulfuras extends GildedRoseItem {

    private static final int SULFURAS_QUALITY = 80; // Sulfuras 품질

    public Sulfuras(Item item) {
        super(item);
    }

    // Sulfuras는 판매 일수나 품질이 변하지 않음
    @Override
    public void update() {

    }

    // Sulfuras에 대한 초기값 설정
    @Override
    public void init() {
        setQuality(SULFURAS_QUALITY);
    }

}
