package com.gildedrose.constant;

import java.util.Arrays;

import com.gildedrose.Item;

public enum ItemName {
    AGED_BRIE("Aged Brie"),
    BACKSTAGE_PASSES("Backstage passes"),
    SULFURAS("Sulfuras"),
    CONJURED("Conjured"),
    DEFAULT("");

    private final String name;

    ItemName(String name) {
        this.name = name;
    }

    public static ItemName from(Item item) {
        return Arrays.stream(ItemName.values())
            .filter(modifier -> item.name.contains(modifier.name))
            .findFirst()
            .get();
    }
}
