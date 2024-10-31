package com.gildedrose.item.type;

import com.gildedrose.*;
import com.gildedrose.item.*;

public class BackstagePassesItemType extends ItemType {

    private static final int MIN_SELLIN = 0;
    private static final int MIN_QUALITY = 0;
    private static final int MAX_QUALITY = 50;

    @Override
    public void updateQuality(Item item) {
        decreaseSellIn(item);
        if (item.sellIn < MIN_SELLIN) {
            item.quality = MIN_QUALITY;
        } else if (item.sellIn < 6) {
            item.quality += 3;
        } else if (item.sellIn < 11) {
            item.quality += 2;
        }

        if (item.quality > MAX_QUALITY) {
            item.quality = MAX_QUALITY;
        }
    }
}
