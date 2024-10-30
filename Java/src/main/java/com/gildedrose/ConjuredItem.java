package com.gildedrose;

public class ConjuredItem extends UpdateItem {
    private Item item;

    public ConjuredItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        doubleDecreaseQuality(item);

        //나머지 일수가 없어지면 2배로 감소
        if (item.sellIn < 0) {
            doubleDecreaseQuality(item);
        }

        fixQuality(item);
        decreaseSellIn(item);
    }
}
