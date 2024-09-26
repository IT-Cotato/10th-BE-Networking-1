package com.gildedrose.rules;

import com.gildedrose.Item;

public class AgedBrieLogic implements Logic{
    @Override
    public void update(Item item) {
        item.sellIn--;
        if(item.quality<50){
            item.quality++;
        }

        if(item.sellIn<0){
            item.quality++;

        }
    }
}
