package com.gildedrose.item.type;

import com.gildedrose.*;
import com.gildedrose.item.*;

public class NormalItemType extends ItemType {

    private static final int MIN_SELLIN = 0;
    private static final int MIN_QUALITY = 0;

    @Override
    public void updateQuality(Item item) {
        decreaseSellIn(item);
        if (item.quality <= MIN_QUALITY) {
            return;
        }
        if (item.sellIn < MIN_SELLIN) {
            item.quality -= 2;
        } else {
            item.quality--;
        }
    }
}
