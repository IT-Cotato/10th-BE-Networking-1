package com.gildedrose;

public class ConjuredItem extends UpdateItem {
    private Item item;

    public ConjuredItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        doubleDecreaseQuality(item);
        if (item.sellIn < 0) {
            doubleDecreaseQuality(item);
        }
        fixQuality(item);
        decreaseSellIn(item);
    }
}

