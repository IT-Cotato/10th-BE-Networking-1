package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public class AgedBrie extends UpdateLogic {

    @Override
    public void update(Item item) {

        increaseQuality(item, DEFAULT_QUALITY_INCREMENT);
        decreaseSellIn(item);

        if (item.sellIn < QUALITY_MIN) {
            increaseQuality(item, DEFAULT_QUALITY_INCREMENT);
        }
    }
}
