package com.gildedrose;

import static com.constant.ItemPropertyConstant.*;

import com.constant.ItemNameConstant;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            ItemNameConstant itemName = ItemNameConstant.findNameToEnumIn(items[i].name);

            if (itemName != ItemNameConstant.AGED_BRIE
                && itemName != ItemNameConstant.BACKSTAGE_PASSES) {
                if (items[i].quality > MINIMUM_QUALITY.getValue()) {
                    if (itemName != ItemNameConstant.SULFURAS) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < MAXIMUM_QUALITY.getValue()) {
                    items[i].quality = items[i].quality + 1;

                    if (itemName == ItemNameConstant.BACKSTAGE_PASSES) {
                        if (items[i].sellIn <= BACKSTAGE_DAY_OF_10.getValue()) {
                            if (items[i].quality < MAXIMUM_QUALITY.getValue()) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn <= BACKSTAGE_DAY_OF_5.getValue()) {
                            if (items[i].quality < MAXIMUM_QUALITY.getValue()) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (itemName != ItemNameConstant.SULFURAS) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < SELLIN_CRITERIA.getValue()) {
                if (itemName != ItemNameConstant.AGED_BRIE) {
                    if (itemName != ItemNameConstant.BACKSTAGE_PASSES) {
                        if (items[i].quality > MINIMUM_QUALITY.getValue()) {
                            if (itemName != ItemNameConstant.SULFURAS) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < MAXIMUM_QUALITY.getValue()) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}
