package com.gildedrose.update;

import com.gildedrose.Item;

public class Conjured extends ItemUpdateLogic {

    public Conjured(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn();
        decreaseQuality(2); // 품질이 일반 아이템보다 2배 빨리 감소

        // 판매일이 지나면 추가 감소
        if (item.sellIn < 0) {
            decreaseQuality(2);
        }
    }
}
