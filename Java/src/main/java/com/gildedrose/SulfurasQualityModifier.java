package com.gildedrose;

public class SulfurasQualityModifier implements ItemQualityModifier {

    @Override
    public void modify(Item item) {
        item.quality = Constraints.QUALITY_OF_SULFURAS.value();
    }
}
