package com.gildedrose;

public class CommonItem extends UpdateItem {

    private Item item;

    public CommonItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        decreaseQuality(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
        fixQuality(item);
        decreaseSellIn(item);
    }
}
