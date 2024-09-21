package com.gildedrose.updateItem;

import com.gildedrose.Item;

public class BackStageConcertUpdateLogic implements UpdateLogic {
    @Override
    public void update(Item item) {
        if (item.sellIn > 10)
            item.quality = Math.min(item.quality + 1, 50);
        else if (item.sellIn > 5)
            item.quality = Math.min(item.quality + 2, 50);
        else if (item.sellIn > 0)
            item.quality = Math.min(item.quality + 3, 50);
        else
            item.quality = 0;

        item.sellIn--;
    }
}
