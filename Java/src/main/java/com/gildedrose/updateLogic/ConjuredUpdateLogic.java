package com.gildedrose.updateLogic;

import com.gildedrose.Item;

public class ConjuredUpdateLogic extends UpdateLogic {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        
        decreaseQuality(item, 2);
    }
}
