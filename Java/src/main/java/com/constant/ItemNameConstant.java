package com.constant;

import java.util.Arrays;

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

    private String getName() {
        return name;
    }

    public static ItemNameConstant findNameToEnumIn(String itemName) {
        return Arrays.stream(ItemNameConstant.values())
            .filter(modifier -> itemName.contains(modifier.getName()))
            .findFirst()
            .get();
    }
}
