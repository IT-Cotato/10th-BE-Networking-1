package com.gildedrose;

import com.gildedrose.storage.GildedRoseItem;
import com.gildedrose.storage.item.AgedBrie;
import com.gildedrose.storage.item.BackstagePasses;
import com.gildedrose.storage.item.Conjured;
import com.gildedrose.storage.item.Normal;
import com.gildedrose.storage.item.Sulfuras;

class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            GildedRoseItem gildedRoseItem = getGildedRoseItem(item);
            gildedRoseItem.update();
        }
    }

    public void init() {
        for (Item item : items) {
            GildedRoseItem gildedRoseItem = getGildedRoseItem(item);
            gildedRoseItem.init();
        }
    }

    public Item[] getItems() {
        return items;
    }

    private GildedRoseItem getGildedRoseItem(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrie(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePasses(item);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(item);
            case "Conjured Mana Cake":
                return new Conjured(item);
            default:
                return new Normal(item);
        }
    }
}
