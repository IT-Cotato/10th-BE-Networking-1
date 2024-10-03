package com.gildedrose;

public class Item {

    public String name;

    public int sellIn; // 아이템을 판매해야 하는 남은 기한

    public int quality; // 아이템의 가치

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public Item(String name, int sellIn) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = 0;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
