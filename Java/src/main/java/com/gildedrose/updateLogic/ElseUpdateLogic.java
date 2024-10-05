package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class ElseUpdateLogic extends UpdateLogic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        
        item.quality = item.quality > 0 ? item.quality - 1 : 0;

        if (item.sellIn < 0) {
            item.quality = item.quality > 0 ? item.quality - 1 : 0;
        }
    }
}
