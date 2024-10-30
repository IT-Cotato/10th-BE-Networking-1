package com.gildedrose;

public class CommonItem extends UpdateItem {

    private Item item;

    public CommonItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        decreaseQuality(item);

        //나머지 일수가 없어지면 2배로 감소
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }

        fixQuality(item);
        decreaseSellIn(item);
    }
}
