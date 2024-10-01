package com.gildedrose;

public class BackStageTicketQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {

        if (item.sellIn > 10) {
            item.quality = Math.min(Constraints.QUALITY_UPPER_LIMIT.value(),
                item.quality + Constraints.QUALITY_DECREASE_DEFAULT.value());
        } else if (item.sellIn > 5) {
            item.quality = Math.min(Constraints.QUALITY_UPPER_LIMIT.value(),
                item.quality + Constraints.QUALITY_INCREASE_BACKSTAGE_PASSES_LEFT_10.value());
        } else if (item.sellIn >= Constraints.SELLIN_LOWER_LIMIT.value()) {
            item.quality = Math.min(Constraints.QUALITY_UPPER_LIMIT.value(),
                item.quality + Constraints.QUALITY_INCREASE_BACKSTAGE_PASSES_LEFT_5.value());
        } else {
            item.quality = Constraints.QUALITY_LOWER_LIMIT.value();
        }

        item.sellIn--;
    }
}
