package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public class DefaultItem implements UpdateLogic{

    @Override
    public void update(Item item) {
        if (item.quality > QUALITY_MIN) {
            item.quality -= DEFAULT_QUALITY_DECREMENT;
        }

        item.sellIn--;

        if (item.sellIn < 0 && item.quality > QUALITY_MIN) {
            item.quality -= DEFAULT_QUALITY_DECREMENT;
        }
    }
}
