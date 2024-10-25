package com.gildedrose.modifier;

import com.gildedrose.Constraints;
import com.gildedrose.Item;

public class DefaultQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = Math.max(Constraints.QUALITY_LOWER_LIMIT.value(),
            item.quality - Constraints.QUALITY_DECREASE_DEFAULT.value());

        if (item.sellIn <= Constraints.SELLIN_LOWER_LIMIT.value()) {
            item.quality = Math.max(Constraints.QUALITY_LOWER_LIMIT.value(),
                item.quality - Constraints.QUALITY_DECREASE_DEFAULT.value());
        }

        item.sellIn--;
    }
}
