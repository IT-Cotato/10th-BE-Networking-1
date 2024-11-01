package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public class Conjured extends UpdateLogic{

    @Override
    public void update(Item item) {

        decreaseQuality(item, QUALITY_DECREMENT_MULTIPLIER);
        decreaseSellIn(item);

        if (item.sellIn < QUALITY_MIN && item.quality > QUALITY_MIN) {
            item.quality -= QUALITY_DECREMENT_MULTIPLIER ;
        }

        if (item.quality < QUALITY_MIN) {
            item.quality = QUALITY_MIN;
        }
    }
}
