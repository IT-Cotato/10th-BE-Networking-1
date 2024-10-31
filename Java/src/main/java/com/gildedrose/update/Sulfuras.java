package com.gildedrose.update;

import com.gildedrose.Item;

public class Sulfuras extends ItemUpdateLogic {

    public Sulfuras(Item item) {
        super(item);
    }

    @Override
    public void update() {
        // Sulfuras는 품질과 판매일이 변하지 않음
    }
}
