package com.gildedrose.modifier;

import com.gildedrose.Constraints;
import com.gildedrose.Item;

public class SulfurasQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = Constraints.QUALITY_OF_SULFURAS.value();
    }
}
