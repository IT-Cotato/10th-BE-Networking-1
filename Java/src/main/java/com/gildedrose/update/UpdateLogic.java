package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public abstract class UpdateLogic {
    public void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    public void increaseQuality(Item item, int increment) {
        item.quality = Math.min(item.quality + increment, QUALITY_MAX);  // QUALITY_MAX 이상으로 증가하지 않음
    }

    public void decreaseQuality(Item item, int decrement) {
        item.quality = Math.max(item.quality - decrement, QUALITY_MIN);  // QUALITY_MIN 이하로 감소하지 않음
    }

    public abstract void update(Item item);
}
