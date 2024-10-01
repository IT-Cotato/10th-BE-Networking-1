package com.gildedrose.constant;

import java.util.Arrays;

import com.gildedrose.Item;

public enum ItemNameConstant {
    AGED_BRIE("Aged Brie"),
    BACKSTAGE_PASSES("Backstage passes"),
    SULFURAS("Sulfuras"),
    CONJURED("Conjured"),
    DEFAULT("");

    private final String name;

    ItemNameConstant(String name) {
        this.name = name;
    }

    public static ItemNameConstant from(Item item) {
        return Arrays.stream(ItemNameConstant.values())
            .filter(modifier -> item.name.contains(modifier.name))
            .findFirst()
            .get();
    }
}
