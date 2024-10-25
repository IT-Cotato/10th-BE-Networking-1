package com.gildedrose.modifier;

import static com.gildedrose.Constraints.*;

import com.gildedrose.Item;

public class SulfurasQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = QUALITY_OF_SULFURAS.value();
    }

    @Override
    public void decreaseSellIn(Item item) {
    }

    @Override
    public int increaseQuality(Item item) {
        return item.quality;
    }

    @Override
    public int decreaseQuality(Item item) {
        return item.quality;
    }
}
