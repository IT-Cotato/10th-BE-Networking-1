package com.gildedrose.update;

import com.gildedrose.Item;

public class NormalItem extends ItemUpdateLogic {

    public NormalItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn();
        decreaseQuality(1);

        // 판매일이 지나면 추가 감소
        if (item.sellIn < 0) {
            decreaseQuality(1);
        }
    }

}
