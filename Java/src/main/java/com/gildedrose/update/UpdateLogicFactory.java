package com.gildedrose.update;

import com.gildedrose.Item;

public class UpdateLogicFactory {
    public static UpdateLogic getUpdateLogic(Item item){
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrie();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePass();
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras();
            default:
                return new DefaultItem();
        }
    }
}
