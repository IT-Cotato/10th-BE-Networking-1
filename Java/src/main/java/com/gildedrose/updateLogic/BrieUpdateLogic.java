package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class BrieUpdateLogic extends UpdateLogic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        
        item.quality = item.quality < 50 ? item.quality + 1 : 50;

        if (item.sellIn < 0) {
            item.quality = item.quality < 50 ? item.quality + 1 : 50;
        }
    }
}
