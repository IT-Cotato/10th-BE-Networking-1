package com.gildedrose;

import com.gildedrose.storage.GildedRoseItem;
import com.gildedrose.storage.item.AgedBrie;
import com.gildedrose.storage.item.BackstagePasses;
import com.gildedrose.storage.item.Conjured;
import com.gildedrose.storage.item.Normal;
import com.gildedrose.storage.item.Sulfuras;

// GildedRoseItem에 대하여 객체 생성을 담담
public class GildedRoseItemFactory {

    public static GildedRoseItem create(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrie(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePasses(item);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(item);
            case "Conjured":
                return new Conjured(item);
            default:
                return new Normal(item);
        }
    }
}
