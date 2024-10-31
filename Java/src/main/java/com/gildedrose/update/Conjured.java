package com.gildedrose.update;

import com.gildedrose.Item;

public class Conjured extends ItemUpdateLogic {

    public Conjured(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreaseSellIn();
        decreaseQuality(2);

        if (item.sellIn < 0) {
            decreaseQuality(2);
        }
    }
}
