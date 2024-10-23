package com.gildedrose.rules;
import com.gildedrose.Item;
public abstract class Logic {
    public abstract void update(Item item);

    protected void decreaseSellIn(Item item){
        item.sellIn=item.sellIn-1;
    }

    protected void decreaseQuality(int amount, Item item){
        item.quality=Math.max(item.quality-amount, 0);
    }

    protected void increaseQuality(int amount, Item item){
        item.quality=Math.min(item.quality+amount, 50);
    }

    protected boolean checkValid(Item item){
		return item.sellIn >= 0;
    }

}
