package com.gildedrose;

public class BackStageItem extends UpdateItem {
    private Item item;

    public BackStageItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        //남은 일자가 11일이상이면 1 증가
        increaseQuality(item);
        //남은 일자가 6~10일이면 2 증가
        if (item.sellIn <= 10) {
            increaseQuality(item);
        }
        //남은 일자가 5일이하면 3증가
        if (item.sellIn <= 5) {
            increaseQuality(item);
        }
        //남은 일자가 없으면 0
        if (item.sellIn == 0) {
            item.quality = 0;
        }
        fixQuality(item);
        decreaseSellIn(item);
    }
}

