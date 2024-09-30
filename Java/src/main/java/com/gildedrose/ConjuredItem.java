package com.gildedrose;

public class ConjuredItem implements UpdatingItem {
    private Item item;

    public ConjuredItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.sellIn > 0) {
            item.quality -= 2;
            if (item.quality < 0) {
                item.quality = 0;
            }
        } else {
            item.quality -= 4;
            if (item.quality < 0) {
                item.quality = 0;
            }
        }
        item.sellIn -= 1;
    }
}

