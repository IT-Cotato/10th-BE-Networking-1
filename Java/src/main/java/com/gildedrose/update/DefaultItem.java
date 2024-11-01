package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public class DefaultItem extends UpdateLogic{

    @Override
    public void update(Item item) {

        decreaseQuality(item, DEFAULT_QUALITY_DECREMENT);
        decreaseSellIn(item);

        if (item.sellIn < 0) {
            decreaseQuality(item, DEFAULT_QUALITY_DECREMENT);
        }
    }
}
