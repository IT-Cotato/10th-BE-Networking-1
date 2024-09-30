package com.gildedrose.update;

import com.gildedrose.Item;

public class UpdateItemBackStage implements UpdateItem{
    @Override
    public void update(Item item) {
        UpdateItem.decreaseSellIn(item);

        if (item.sellIn < 0) {
            item.quality = 0;
            return;
        }

        UpdateItem.increaseQuality(item);
        if(item.sellIn < 11)    UpdateItem.increaseQuality(item);
        if(item.sellIn < 6) UpdateItem.increaseQuality(item);
    }
}
