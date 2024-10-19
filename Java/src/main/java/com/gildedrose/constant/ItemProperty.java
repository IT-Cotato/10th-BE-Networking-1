package com.gildedrose.constant;

public enum ItemProperty {
    MINIMUM_QUALITY(0),
    MAXIMUM_QUALITY(50),
    BACKSTAGE_DAY_OF_10(10),
    BACKSTAGE_DAY_OF_5(5),
    SELLIN_CRITERIA(0);

    private final int value;

    ItemProperty(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
