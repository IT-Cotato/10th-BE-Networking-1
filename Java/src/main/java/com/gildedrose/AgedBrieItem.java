package com.gildedrose;

public class AgedBrieItem extends UpdateItem {
    private final Item item;

    public AgedBrieItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        increaseQuality(item);
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
        fixQuality(item);
        decreaseSellIn(item);
    }

}




