package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class BackstagePasses extends GildedRoseItem {

    private static final int BACKSTAGE_SELL_IN_THRESHOLD_10 = 10; // 판매 일수가 10일 이하인 경우
    private static final int BACKSTAGE_SELL_IN_THRESHOLD_5 = 5; // 판매 일수가 5일 이하인 경우

    public BackstagePasses(Item item) {
        super(item);
    }

    // 판매 일수가 0보다 작은 경우 품질 0으로 초기화
    // 판매 일수가 10일 이하인 경우 품질 2배 증가
    // 판매 일수가 5일 이하인 경우 품질 3배 증가
    @Override
    public void update() {

        if (gildedRoseItem.sellIn <= 0) {
            resetQuality();
        } else {
            increaseQuality(COMMON_QUALITY_INCREASE_RATE);

            if (gildedRoseItem.sellIn < BACKSTAGE_SELL_IN_THRESHOLD_10) {
                increaseQuality(COMMON_QUALITY_INCREASE_RATE);
            }

            if (gildedRoseItem.sellIn < BACKSTAGE_SELL_IN_THRESHOLD_5) {
                increaseQuality(COMMON_QUALITY_INCREASE_RATE);
            }
        }
        decreaseSellIn();
    }

    @Override
    public void init() {
    }
}
