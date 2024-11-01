package com.gildedrose.update;

import static com.gildedrose.update.ItemConstants.*;

import com.gildedrose.Item;

public abstract class UpdateLogic {

    //판매일(SellIn) 감소
    public void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    //품질(Quality)를 지정한 increment만큼 증가
    public void increaseQuality(Item item, int increment) {
        item.quality = Math.min(item.quality + increment, QUALITY_MAX);  // QUALITY_MAX 이상으로 증가하지 않음
    }

    //품질(Quality)를 지정한 decrement만큼 감소
    public void decreaseQuality(Item item, int decrement) {
        item.quality = Math.max(item.quality - decrement, QUALITY_MIN);  // QUALITY_MIN 이하로 감소하지 않음
    }

    public abstract void update(Item item);
}
