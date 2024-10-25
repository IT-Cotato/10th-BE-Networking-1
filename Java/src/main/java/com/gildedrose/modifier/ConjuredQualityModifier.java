package com.gildedrose.modifier;

import static com.gildedrose.Constraints.*;

import com.gildedrose.Item;

public class ConjuredQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = Math.max(QUALITY_LOWER_LIMIT.value(), decreaseQuality(item));

        if (item.sellIn <= SELLIN_LOWER_LIMIT.value()) {
            item.quality = Math.max(QUALITY_LOWER_LIMIT.value(), decreaseQuality(item));
        }

        decreaseSellIn(item);
    }

    @Override
    public void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    @Override
    public int increaseQuality(Item item) {
        return item.quality;
    }

    @Override
    public int decreaseQuality(Item item) {
        return item.quality - QUALITY_DECREASE_CONJURED.value();
    }
}
