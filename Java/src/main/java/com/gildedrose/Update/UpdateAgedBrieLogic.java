package com.gildedrose.Update;

import com.gildedrose.Item;

public class UpdateAgedBrieLogic implements UpdateLogic {

    @Override
    public void update(Item item) {

        if (item.quality < 50) {
            item.quality++;
        }

        // 기존 시스템도 quality값 50 미만인지 검사 후 quality++ -> sellIn-- -> 판매 기한 지났는지 검사 후 quality++이므로 해당 구조 유지
        item.sellIn--;

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }

    }
}
