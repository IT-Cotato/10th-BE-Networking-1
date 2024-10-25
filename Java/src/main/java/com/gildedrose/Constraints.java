package com.gildedrose;

public enum Constraints {
    QUALITY_OF_SULFURAS(80),
    QUALITY_UPPER_LIMIT(50),
    QUALITY_LOWER_LIMIT(0),
    SELLIN_LOWER_LIMIT(0),
    QUALITY_INCREASE_DEFAULT(1),
    QUALITY_INCREASE_BACKSTAGE_PASSES_LEFT_10(2),
    QUALITY_INCREASE_BACKSTAGE_PASSES_LEFT_5(3),
    QUALITY_DECREASE_DEFAULT(1),
    QUALITY_DECREASE_CONJURED(2),
    BACKSTAGE_PASSES_LEFT_10(10),
    BACKSTAGE_PASSES_LEFT_5(5);

    private final int value;

    Constraints(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

}
