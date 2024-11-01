package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public class Conjured extends UpdateLogic {

    @Override
    public void update(Item item) {

        //"Conjured" 아이템은 일반 아이템의 2배의 속도로 품질(Quality)이 저하
        decreaseQuality(item, QUALITY_DECREMENT_MULTIPLIER);
        decreaseSellIn(item);

        // 판매 기한이 0일 이하인 경우, 품질(Quality)을 추가로 2배 감소
        if (item.sellIn < QUALITY_MIN && item.quality > QUALITY_MIN) {
            item.quality -= QUALITY_DECREMENT_MULTIPLIER;
        }

        if (item.quality < QUALITY_MIN) {
            item.quality = QUALITY_MIN;
        }
    }
}
