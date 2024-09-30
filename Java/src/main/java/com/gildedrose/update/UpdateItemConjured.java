package com.gildedrose.update;

import com.gildedrose.Item;

public class UpdateItemConjured implements UpdateItem{
    @Override
    public void update(Item item) {
        UpdateItem.decreaseSellIn(item);

        UpdateItem.decreaseQuality(item);
        UpdateItem.decreaseQuality(item);
    }
}
