package com.gildedrose;

import com.gildedrose.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            Item item = items[i];

            if (items[i].name.equals("Aged Brie")) {
                ItemType.AGED_BRIE.updateQuality(item);
            } else if (items[i].name.startsWith("Sulfuras")) {
                ItemType.SULFURAS.updateQuality(item);
            } else if (items[i].name.startsWith("Backstage passes")) {
                ItemType.BACKSTAGE_PASSES.updateQuality(item);
            } else if (items[i].name.startsWith("Conjured")) {
                ItemType.CONJURED.updateQuality(item);
            } else {
                ItemType.NORMAL_ITEM.updateQuality(item);
            }
        }
    }
}
