package com.gildedrose.constant;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;

import com.gildedrose.Item;

public enum ItemName implements Supplier<ItemName> {
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
            .orElseGet(DEFAULT);
    }

    @Override
    public ItemName get() {
        return this;
    }
}
