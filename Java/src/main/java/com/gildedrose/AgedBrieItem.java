package com.gildedrose;

public class AgedBrieItem implements UpdatingItem {
    private Item item;

    public AgedBrieItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.sellIn > 0) {
            item.quality += 1;
            if (item.quality > 50) {
                item.quality = 50;
            }
        } else {
            item.quality += 2;
            if (item.quality > 50) {
                item.quality = 50;
            }
        }
        item.sellIn -= 1;
    }
}




