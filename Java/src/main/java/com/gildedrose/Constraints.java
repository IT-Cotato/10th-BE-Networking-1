package com.gildedrose;

public enum Constraints {
    QUALITY_MAXIMUM(50),
    QUALITY_MINIMUM(0),
    QUALITY_OF_SULFURAS(80),
    QUALITY_DECREASE_MULTIPLE(2),
    QUALITY_INCREASE_MULTIPLE(2),
    MULTIPLE_START_DAY(0);

    private final int value;

    Constraints(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
