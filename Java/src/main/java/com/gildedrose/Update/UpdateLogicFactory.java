package com.gildedrose.Update;

import com.gildedrose.Item;

public class UpdateLogicFactory {
    public static UpdateLogic getUpdateLogic(Item item) {
        if (item.name.contains("Conjured")) {
            // Conjured 아이템인 경우 switch문에서 판별 불가능하므로 별도 처리
            return new UpdateConjuredItemLogic();
        }

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
