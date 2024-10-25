package com.gildedrose.modifier;

import static com.gildedrose.Constraints.*;

import com.gildedrose.Item;

public class AgedBrieQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = Math.min(QUALITY_UPPER_LIMIT.value(), increaseQuality(item));

        if (item.sellIn <= SELLIN_LOWER_LIMIT.value()) {
            item.quality = Math.min(QUALITY_LOWER_LIMIT.value(), increaseQuality(item));
        }

        decreaseSellIn(item);
    }

    @Override
    public void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    @Override
    public int increaseQuality(Item item) {
        return item.quality + QUALITY_INCREASE_DEFAULT.value();
    }

    @Override
    public int decreaseQuality(Item item) {
        return item.quality;
    }
}
