package com.gildedrose;

import com.gildedrose.item.*;
import com.gildedrose.item.type.*;

public abstract class ItemFactory {

    // Item을 통해 ItemType을 결정해서 리턴해주는 매서드
    public static ItemType from(Item item) {
        if (item.name.equals("Aged Brie")) {
            return new AgedBrieItemType();
        } else if (item.name.startsWith("Sulfuras")) {
            return new SulfurasItemType();
        } else if (item.name.startsWith("Backstage passes")) {
            return new BackstagePassesItemType();
        } else if (item.name.startsWith("Conjured")) {
            return new ConjuredItemType();
        } else {
            return new NormalItemType();
        }
    }
}
