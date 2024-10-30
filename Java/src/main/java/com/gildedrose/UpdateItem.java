package com.gildedrose;

public abstract class UpdateItem {
    protected void decreaseSellIn(Item item) {
        item.sellIn -= 1;
    }

    protected void increaseQuality(Item item) {
        item.quality += 1;
    }

    protected void decreaseQuality(Item item) {
        item.quality -= 1;
    }

    protected void doubleDecreaseQuality(Item item) {
        item.quality -= 2;
    }

    protected void fixQuality(Item item) {
        if (item.quality > 50) {
            item.quality = 50;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
    }

    protected abstract void updateQuality();
}
