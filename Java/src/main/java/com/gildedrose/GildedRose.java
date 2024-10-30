package com.gildedrose;

class GildedRose {
    Item[] items;

    UpdateItem[] updatingItems;

    public GildedRose(Item[] items) {
        this.items = items;
        this.updatingItems = new UpdateItem[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")) {
                updatingItems[i] = new AgedBrieItem(items[i]);
            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                updatingItems[i] = new BackStageItem(items[i]);
            } else if (items[i].name.equals("Conjured Mana Cake")) {
                updatingItems[i] = new ConjuredItem(items[i]);
            } else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                updatingItems[i] = new SulfurasItem(items[i]);
            } else {
                updatingItems[i] = new CommonItem(items[i]);
            }
        }
    }

    public void updateQuality() {
        for (UpdateItem item : updatingItems) {
            item.updateQuality();

        }
    }

}


