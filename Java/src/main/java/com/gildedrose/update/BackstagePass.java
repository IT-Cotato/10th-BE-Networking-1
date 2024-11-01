package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public class BackstagePass extends UpdateLogic {

    private static final int BACKSTAGE_SELL_IN_THRESHOLD_10 = 10;
    private static final int BACKSTAGE_SELL_IN_THRESHOLD_5 = 5;

    @Override
    public void update(Item item) {

        // 판매 기한이 10일 이하일 때 품질 1 증가
        if (item.sellIn <= BACKSTAGE_SELL_IN_THRESHOLD_10) {
            increaseQuality(item, DEFAULT_QUALITY_INCREMENT);
        }

        // 판매 기한이 5일 이하일 때 추가로 품질 1 증가
        if (item.sellIn <= BACKSTAGE_SELL_IN_THRESHOLD_5) {
            increaseQuality(item, DEFAULT_QUALITY_INCREMENT);
        }

        // 판매 기한 1일 감소
        decreaseSellIn(item);

        // 판매 기한이 지난 경우 품질을 0으로 설정
        if (item.sellIn < QUALITY_MIN) {
            item.quality = QUALITY_MIN;
        }
    }
}
