package com.gildedrose.rules;

import com.gildedrose.Item;

public class BackStagePassesLogic implements Logic{
    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        if (item.sellIn < 11) {
            if (item.quality < 50) {
                item.quality++;
            }
        }
        if (item.sellIn < 6) {
            if (item.quality < 50) {
                item.quality++;
            }
        }

        item.sellIn--;

        if(item.sellIn < 0) {
            item.quality=0;
        }
    }
}
