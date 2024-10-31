package com.gildedrose.item.type;

import com.gildedrose.*;
import com.gildedrose.item.*;

public class AgedBrieItemType extends ItemType {

    private static final int MIN_SELLIN = 0;
    private static final int MAX_QUALITY = 50;

    @Override
    public void updateQuality(Item item) {
        decreaseSellIn(item);
        if (item.sellIn < MIN_SELLIN) {
            item.quality += 2;
        } else {
            item.quality++;
        }

        if (item.quality > MAX_QUALITY) {
            item.quality = MAX_QUALITY;
        }
    }
}
