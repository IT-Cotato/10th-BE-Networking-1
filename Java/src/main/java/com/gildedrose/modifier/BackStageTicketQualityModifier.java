package com.gildedrose.modifier;

import com.gildedrose.Constraints;
import com.gildedrose.Item;

public class BackStageTicketQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {

        if (item.sellIn > Constraints.BACKSTAGE_PASSES_LEFT_10.value()) {
            item.quality = Math.min(Constraints.QUALITY_UPPER_LIMIT.value(), increaseQuality(item));
        } else if (item.sellIn > Constraints.BACKSTAGE_PASSES_LEFT_5.value()) {
            item.quality = Math.min(Constraints.QUALITY_UPPER_LIMIT.value(),
                increaseQuality(item, Constraints.QUALITY_INCREASE_BACKSTAGE_PASSES_LEFT_10.value()));
        } else if (item.sellIn >= Constraints.SELLIN_LOWER_LIMIT.value()) {
            item.quality = Math.min(Constraints.QUALITY_UPPER_LIMIT.value(),
                increaseQuality(item, Constraints.QUALITY_INCREASE_BACKSTAGE_PASSES_LEFT_5.value()));
        } else {
            item.quality = Constraints.QUALITY_LOWER_LIMIT.value();
        }

        decreaseSellIn(item);
    }

    @Override
    public void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    @Override
    public int increaseQuality(Item item) {
        return item.quality + Constraints.QUALITY_INCREASE_DEFAULT.value();
    }

    public int increaseQuality(Item item, int value) {
        return item.quality + value;
    }

    @Override
    public int decreaseQuality(Item item) {
        return item.quality;
    }
}

