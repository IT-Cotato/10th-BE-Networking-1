package com.gildedrose.Update;

import com.gildedrose.Item;

public class UpdateLogicFactory {
    public static UpdateLogic getUpdateLogic(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new UpdateAgedBrieLogic();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new UpdateBackstagePassesLogic();
            case "Sulfuras, Hand of Ragnaros":
                return new UpdateSulfurasLogic();
            default:
                return new UpdateDefaultItemLogic();
        }
    }
}
