package com.gildedrose;

import java.util.Arrays;

public enum ItemType {
    AGED_BRIE("Aged Brie", new AgedBrieQualityModifier()),
    BACKSTAGE_TICKET("Backstage passes", new BackStageTicketQualityModifier()),
    CONJURED("Conjured", new ConjuredQualityModifier()),
    SULFURAS("Sulfuras", new SulfurasQualityModifier()),
    DEFAULT("Default", new DefaultQualityModifier());

    private final String name;
    private final ItemQualityModifier modifier;

    ItemType(String name, ItemQualityModifier modifier) {
        this.name = name;
        this.modifier = modifier;
    }

    public static ItemType findByItemName(String itemName) {
        return Arrays.stream(values())
            .filter(itemType -> itemName.contains(itemType.name))
            .findFirst()
            .orElse(DEFAULT);
    }

    public void modifyQuality(Item item) {
        modifier.modify(item);
    }

}
