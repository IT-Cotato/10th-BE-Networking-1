package com.gildedrose;

public class ConjuredQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = Math.max(Constraints.QUALITY_LOWER_LIMIT.value(),
            item.quality - Constraints.QUALITY_DECREASE_CONJURED.value());

        if (item.sellIn <= Constraints.SELLIN_LOWER_LIMIT.value()) {
            item.quality = Math.max(Constraints.QUALITY_LOWER_LIMIT.value(),
                item.quality - Constraints.QUALITY_DECREASE_CONJURED.value());
        }

        item.sellIn--;

    }
}
