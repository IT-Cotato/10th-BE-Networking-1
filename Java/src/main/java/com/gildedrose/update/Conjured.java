package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public class Conjured implements UpdateLogic{

    @Override
    public void update(Item item) {

        if (item.quality > QUALITY_MIN) {
            item.quality -= QUALITY_DECREMENT_MULTIPLIER ;
        }

        item.sellIn--;

        if (item.sellIn < QUALITY_MIN && item.quality > QUALITY_MIN) {
            item.quality -= QUALITY_DECREMENT_MULTIPLIER ;
        }

        if (item.quality < QUALITY_MIN) {
            item.quality = QUALITY_MIN;
        }
    }
}
