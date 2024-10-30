package com.gildedrose.storage;

import com.gildedrose.Item;

public abstract class GildedRoseItem {

    protected Item gildedRoseItem;

    public GildedRoseItem(Item item) {
        this.gildedRoseItem = item;
    }

    // 품질 관련 상수
    protected static final int MAX_QUALITY = 50; // 최대 품질
    protected static final int MIN_QUALITY = 0; // 최소 품질
    protected static final int RESET_QUALITY = 0; // 품질 초기화 값
    protected static final int COMMON_QUALITY_DECREASE_RATE = 1; // 품질 감소율
    protected static final int COMMON_QUALITY_INCREASE_RATE = 1; // 품질 증가율

    // 판매 일수 관련 상수
    protected static final int SELL_IN_DECREASE_RATE = 1; // 판매 일수 감소율

    // 판매 일수와 품질을 업데이트하는 추상 메소드
    public abstract void update();

    // 초기화하는 추상 메소드
    public abstract void init();

    // 판매 일수를 감소시키는 메소드
    protected void decreaseSellIn() {
        gildedRoseItem.sellIn = gildedRoseItem.sellIn - SELL_IN_DECREASE_RATE;
    }

    // 판매 일수를 감소시키는 메소드
    protected void decreaseSellIn(int days) {
        gildedRoseItem.sellIn = gildedRoseItem.sellIn - days;
    }

    // 품질을 감소시키는 메소드, amount만큼 감소
    protected void decreaseQuality(int amount) {
        if (gildedRoseItem.quality > MIN_QUALITY) {
            gildedRoseItem.quality = Math.max(gildedRoseItem.quality - amount, MIN_QUALITY);
        }
    }

    // 품질을 증가시키는 메소드, amount만큼 증가
    protected void increaseQuality(int amount) {
        if (gildedRoseItem.quality < MAX_QUALITY) {
            gildedRoseItem.quality = Math.min(gildedRoseItem.quality + amount, MAX_QUALITY);
        }
    }

    // Quality를 설정하는 메소드
    protected void setQuality(int quality) {
        gildedRoseItem.quality = quality;
    }

    // Quality를 초기화하는 메소드
    protected void resetQuality() {
        gildedRoseItem.quality = RESET_QUALITY;
    }

    // Quality를 초기화하는 메소드
    protected void resetQuality(int quality) {
        gildedRoseItem.quality = quality;
    }

}
