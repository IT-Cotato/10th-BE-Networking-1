package com.gildedrose.update;

import com.gildedrose.Item;

public class UpdateItemStandard implements UpdateItem{
    @Override
    public void update(Item item) {
        UpdateItem.decreaseSellIn(item);

        UpdateItem.decreaseQuality(item);
    }
}
