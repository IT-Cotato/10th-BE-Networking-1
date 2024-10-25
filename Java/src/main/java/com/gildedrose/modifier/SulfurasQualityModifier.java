package com.gildedrose.modifier;

import com.gildedrose.Constraints;
import com.gildedrose.Item;

public class SulfurasQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = Constraints.QUALITY_OF_SULFURAS.value();
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
