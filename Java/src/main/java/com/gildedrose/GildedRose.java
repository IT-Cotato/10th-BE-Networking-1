package com.gildedrose;

import com.gildedrose.storage.GildedRoseItem;

// GildedRoseItem에 대한 비즈니스 로직을 처리하는 역할을 담당
class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    // 각 아이템 별로 하루가 지날 때마다 품질과 판매 일수를 업데이트
    public void updateQuality() {
        for (Item item : items) {
            GildedRoseItem gildedRoseItem = GildedRoseItemFactory.create(item);
            gildedRoseItem.update();
        }
    }

    // 각 아이템 별로 초기값 설정
    public void init() {
        for (Item item : items) {
            GildedRoseItem gildedRoseItem = GildedRoseItemFactory.create(item);
            gildedRoseItem.init();
        }
    }

    public Item[] getItems() {
        return items;
    }

}
