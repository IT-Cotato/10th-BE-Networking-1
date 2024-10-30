package com.gildedrose;

class GildedRose {
    Item[] items;

    //추상클래스를 배열 변수로 사용
    UpdateItem[] updatingItems;

    //추상클래스 배열 변수에 자식클래스 인스턴스 담기
    public GildedRose(Item[] items) {
        this.items = items;
        this.updatingItems = new UpdateItem[items.length];

        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")) {
                updatingItems[i] = new AgedBrieItem(items[i]);
            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                updatingItems[i] = new BackStageItem(items[i]);
            } else if (items[i].name.equals("Conjured Mana Cake")) {
                updatingItems[i] = new ConjuredItem(items[i]);
            } else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                updatingItems[i] = new SulfurasItem(items[i]);
            } else {
                updatingItems[i] = new CommonItem(items[i]);
            }
        }
    }

    public void updateQuality() {
        //item에 따라 적절한 구현클래스 로직 실행
        for (UpdateItem item : updatingItems) {
            item.updateQuality();
        }
    }
}
