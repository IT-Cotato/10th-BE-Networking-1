package com.gildedrose;

import java.util.HashMap;

import com.gildedrose.update.UpdateItem;
import com.gildedrose.update.UpdateItemBackStage;
import com.gildedrose.update.UpdateItemBrie;
import com.gildedrose.update.UpdateItemConjured;
import com.gildedrose.update.UpdateItemStandard;
import com.gildedrose.update.UpdateItemSulfuras;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        HashMap<String, UpdateItem> updaters = new HashMap<>();
        updaters.put("Aged Brie", new UpdateItemBrie());
        updaters.put("Backstage passes to a TAFKAL80ETC concert", new UpdateItemBackStage());
        updaters.put("Sulfuras, Hand of Ragnaros", new UpdateItemSulfuras());
        updaters.put("Conjured Mana Cake", new UpdateItemConjured());

        UpdateItemStandard updateItemStandard = new UpdateItemStandard();

        for (Item item : items) {
            updaters.getOrDefault(item.name,updateItemStandard).update(item);
            }
    }

}


/*
    public void updateQuality() {

        for (Item item : items) {
            if (!item.name.equals("Aged Brie")  // 브리치즈, 콘서트 티켓이 아닌 경우 -> 일반 아이템
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality > 0) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.quality = item.quality - 1;
                    }   // Sulfuras 아닌 경우 1 감소
                }
            } else {    // 브리치즈 or 콘서트 티켓인 경우
                if (item.quality < 50) {
                    item.quality = item.quality + 1;    // 가치 50 미만이면 1 증가

                    // 콘서트 티켓
                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn < 11) { // 10일 이하면 가치 총 2 증가
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 6) {  // 5일 이하면 가치 총 3 증가
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;  // Surfuras는 기간 감소 x
            }

            if (item.sellIn < 0) {  // 남은 기간이 0 미만
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality > 0) {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                item.quality = item.quality - 1;    // 브리, 콘서트, Sulfuras 다 아님 -> 일반 아이템 : 총 2씩 감소
                            }
                        }
                    } else {
                        item.quality = item.quality - item.quality; // 콘서트 가치 0
                    }
                } else {    // 브리치즈는 총 2씩 증가
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }

    }

    }

*/
