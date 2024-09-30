package com.gildedrose;

public class CommonItem implements UpdatingItem {

    private Item item;

    public CommonItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.quality > 0 && item.sellIn > 0) {
            item.quality -= 1;
        } else if (item.quality > 0 && item.sellIn < 0) {
            item.quality -= 2;
            if (item.quality < 0) {
                item.quality = 0;
            }
        }
        item.sellIn -= 1;
    }
}
