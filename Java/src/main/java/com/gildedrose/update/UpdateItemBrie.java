package com.gildedrose.update;

import com.gildedrose.Item;
import com.gildedrose.update.UpdateItem;

public class UpdateItemBrie implements UpdateItem {

    @Override
    public void update(Item item) {
        UpdateItem.decreaseSellIn(item);

        UpdateItem.increaseQuality(item);
        if(item.sellIn < 0) UpdateItem.increaseQuality(item);
    }
}
