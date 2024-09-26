package com.gildedrose;
import com.gildedrose.Item;
import com.gildedrose.rules.LogicFactory;

class GildedRose {
    Item[] items;
    LogicFactory logicFactory;

    public GildedRose(Item[] items) {
        this.items = items;
        this.logicFactory=new LogicFactory();
    }

    public void updateQuality() {
		for (Item item : items) {
			logicFactory.getLogic(item).update(item);
		}
        //     if (!items[i].name.equals("Aged Brie")
        //             && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        //         if (items[i].quality > 0) {
        //             if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        //                 items[i].quality = items[i].quality - 1;
        //             }
        //         }
        //     } else {
        //         if (items[i].quality < 50) {
        //             items[i].quality = items[i].quality + 1;
        //
        //             if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        //                 if (items[i].sellIn < 11) {
        //                     if (items[i].quality < 50) {
        //                         items[i].quality = items[i].quality + 1;
        //                     }
        //                 }
        //
        //                 if (items[i].sellIn < 6) {
        //                     if (items[i].quality < 50) {
        //                         items[i].quality = items[i].quality + 1;
        //                     }
        //                 }
        //             }
        //         }
        //     }
        //
        //     if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        //         items[i].sellIn = items[i].sellIn - 1;
        //     }
        //
        //     if (items[i].sellIn < 0) {
        //         if (!items[i].name.equals("Aged Brie")) {
        //             if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        //                 if (items[i].quality > 0) {
        //                     if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        //                         items[i].quality = items[i].quality - 1;
        //                     }
        //                 }
        //             } else {
        //                 items[i].quality = items[i].quality - items[i].quality;
        //             }
        //         } else {
        //             if (items[i].quality < 50) {
        //                 items[i].quality = items[i].quality + 1;
        //             }
        //         }
        //     }
        // }
    }
}
