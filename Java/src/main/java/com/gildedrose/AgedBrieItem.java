package com.gildedrose;

public class AgedBrieItem extends UpdateItem {
    private final Item item;

    public AgedBrieItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        increaseQuality(item);
        //나머지 일수가 없어지면 2배로 증가
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
        fixQuality(item);
        decreaseSellIn(item);
    }

}




