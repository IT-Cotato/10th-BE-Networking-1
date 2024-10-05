package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class ConjuredUpdateLogic extends UpdateLogic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);

        item.quality = item.quality >= 2 ? item.quality - 2 : 0;

        if (item.sellIn < 0) {
            item.quality = item.quality > 0 ? item.quality - 2 : 0;
        }
    }
}
