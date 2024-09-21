package com.gildedrose.updateItem;

import java.util.Arrays;
import java.util.List;

import com.gildedrose.Item;

public enum ItemClassification {
    AGED_BRIE(Arrays.asList("Aged Brie")),
    SULFURAS(Arrays.asList("Sulfuras, Hand of Ragnaros")),
    BACKSTAGE_CONCERT(Arrays.asList("Backstage passes to a TAFKAL80ETC concert")),
    OTHERS(null),
    ;

    public final List<String> nameList;

    ItemClassification(List<String> nameList) {
        this.nameList = nameList;
    }

    public static ItemClassification of(Item item) {
        for (ItemClassification itemClassification : ItemClassification.values()) {
            if (itemClassification == OTHERS)
                continue;

            if (itemClassification.nameList.contains(item.name))
                return itemClassification;
        }

        return OTHERS;
    }
}
