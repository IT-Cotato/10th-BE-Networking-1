package com.gildedrose.Update;

import com.gildedrose.Item;

public class UpdateConjuredItemLogic implements UpdateLogic {

    @Override
    public void update(Item item) {

        if (item.quality > 0) {
            item.quality -= 2;
        }

        item.sellIn--;

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 2;
        }

        if (item.quality < 0) {
            // quality가 음수가 될수도 있으므로
            // sellIn > 0, quality = 1인 경우, sellIn < 0, quality = 3인 경우 해당
            item.quality = 0;
        }
    }
}
