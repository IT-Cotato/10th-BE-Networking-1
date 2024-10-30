package com.gildedrose;

public class BackStageItem extends UpdateItem {
    private Item item;

    public BackStageItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        increaseQuality(item);
        if (item.sellIn <= 10) {
            increaseQuality(item);
        }
        if (item.sellIn <= 5) {
            increaseQuality(item);
        }
        if (item.sellIn == 0) {
            item.quality = 0;
        }
        fixQuality(item);
        decreaseSellIn(item);
    }
}

