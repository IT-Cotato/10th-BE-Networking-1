package com.gildedrose.update;

import com.gildedrose.Item;

public interface UpdateItem {
    static final int MAX_QUALITY = 50;
    static final int MIN_QUALITY = 0;

    public void update(Item item);

    static void decreaseSellIn(Item item) {item.sellIn -= 1;}

    static void increaseQuality(Item item) {
        if(item.quality < MAX_QUALITY)  item.quality += 1;
    }

    static void decreaseQuality(Item item) {
        if(item.quality > MIN_QUALITY)  item.quality -= 1;
    }


}
