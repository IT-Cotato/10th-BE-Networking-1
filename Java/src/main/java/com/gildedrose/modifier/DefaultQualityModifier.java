package com.gildedrose.modifier;

import com.gildedrose.Constraints;
import com.gildedrose.Item;

public class DefaultQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = Math.max(Constraints.QUALITY_LOWER_LIMIT.value(), decreaseQuality(item));

        if (item.sellIn <= Constraints.SELLIN_LOWER_LIMIT.value()) {
            item.quality = Math.max(Constraints.QUALITY_LOWER_LIMIT.value(), decreaseQuality(item));
        }
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
        return item.quality - Constraints.QUALITY_DECREASE_DEFAULT.value();
    }
}
