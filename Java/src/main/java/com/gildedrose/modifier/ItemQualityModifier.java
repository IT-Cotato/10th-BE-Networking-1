package com.gildedrose.modifier;

import com.gildedrose.Item;

public interface ItemQualityModifier {
    void modify(Item item);

    void decreaseSellIn(Item item);

    int increaseQuality(Item item);

    int decreaseQuality(Item item);
}
