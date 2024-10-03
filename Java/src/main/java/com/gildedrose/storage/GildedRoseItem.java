package com.gildedrose.storage;

import com.gildedrose.Item;

public abstract class GildedRoseItem {

    protected Item gildedRoseItem;

    public GildedRoseItem(Item item) {
        this.gildedRoseItem = item;
    }

    public abstract void update();

    public abstract void init();

    protected void decreaseSellIn() {
        gildedRoseItem.sellIn = gildedRoseItem.sellIn - 1;
    }

    protected void decreaseQuality(int quality) {
        if (gildedRoseItem.quality > 0) {
            gildedRoseItem.quality = Math.max(gildedRoseItem.quality - quality, 0);
        }
    }

    protected void increaseQuality(int quality) {
        if (gildedRoseItem.quality < 50) {
            gildedRoseItem.quality = Math.min(gildedRoseItem.quality + quality, 50);
        }
    }

    protected void setQuality(int quality) {
        gildedRoseItem.quality = quality;
    }

    protected void resetQuality() {
        gildedRoseItem.quality = 0;
    }

}
