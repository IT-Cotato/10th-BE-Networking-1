package com.gildedrose.updateLogic;

public enum ItemCategory {
    BRIE("Aged Brie"),
    PASS("Backstage passes to a "),
    CONJURED("Conjured "),
    SULFURAS("Sulfuras");

    private final String value;

    ItemCategory(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
