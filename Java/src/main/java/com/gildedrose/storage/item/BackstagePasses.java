package com.gildedrose.storage.item;

import com.gildedrose.Item;
import com.gildedrose.storage.GildedRoseItem;

public class BackstagePasses extends GildedRoseItem {

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    public void update() {

        if (gildedRoseItem.sellIn <= 0) {
            resetQuality();
        } else {
            increaseQuality(1);
            if (gildedRoseItem.sellIn < 11)
                increaseQuality(1);

            if (gildedRoseItem.sellIn < 6)
                increaseQuality(1);
        }
        decreaseSellIn();
    }

    @Override
    public void init() {
    }
}
