package com.gildedrose.update;

import com.gildedrose.Item;

public class AgedBrie extends ItemUpdateLogic {

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn();
        increaseQuality(1);

        // 판매일이 지났을 경우 추가 품질 증가
        if (item.sellIn < 0) {
            increaseQuality(1);
        }
    }

}
