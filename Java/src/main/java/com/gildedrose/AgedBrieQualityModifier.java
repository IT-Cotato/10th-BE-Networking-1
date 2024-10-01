package com.gildedrose;

public class AgedBrieQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = Math.min(Constraints.QUALITY_UPPER_LIMIT.value(),
            item.quality + Constraints.QUALITY_INCREASE_DEFAULT.value());

        if (item.sellIn <= Constraints.SELLIN_LOWER_LIMIT.value()) {
            item.quality = Math.min(Constraints.QUALITY_LOWER_LIMIT.value(),
                item.quality + Constraints.QUALITY_INCREASE_DEFAULT.value());
        }

        item.sellIn--;

    }
}
