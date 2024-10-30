package com.gildedrose;

public enum Constraints {
    QUALITY_MAXIMUM(50),
    QUALITY_MINIMUM(0),
    QUALITY_OF_SULFURAS(80),
    QUALITY_DECREASE_NORMAL(1),
    QUALITY_DECREASE_CONJURED(2),
    QUALITY_DECREASE_MULTIPLE(2),
    QUALITY_INCREASE_BRIE(1),
    QUALITY_INCREASE_MULTIPLE(2),
    QUALITY_INCREASE_PASSES_V2(2),
    QUALITY_INCREASE_PASSES_V3(3),
    MULTIPLE_DECREASE_START_DAY(0);

    private final int value;

    Constraints(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
