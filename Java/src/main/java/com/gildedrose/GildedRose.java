package com.gildedrose;

import java.util.HashMap;

import com.gildedrose.strategy.AgedBrieUpdateStrategy;
import com.gildedrose.strategy.BackstagePassesUpdateStrategy;
import com.gildedrose.strategy.ConjuredItemUpdateStrategy;
import com.gildedrose.strategy.StandardItemUpdateStrategy;
import com.gildedrose.strategy.SulfurasUpdateStrategy;

class GildedRose {
    Item[] items;
    HashMap<String, ItemUpdateStrategy> strategies;

    public GildedRose(Item[] items) {
        this.items = items;
        this.strategies = new HashMap<>();
        this.strategies.put("Aged Brie", new AgedBrieUpdateStrategy());
        this.strategies.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesUpdateStrategy());
        this.strategies.put("Sulfuras, Hand of Ragnaros", new SulfurasUpdateStrategy());
        this.strategies.put("default", new StandardItemUpdateStrategy());
        this.strategies.put("Conjured Mana Cake", new ConjuredItemUpdateStrategy());
    }

    public void updateQuality() {
        for (Item item : items) {
            getItemUpdateStrategy(item).update(item);
        }
    }

    private ItemUpdateStrategy getItemUpdateStrategy(Item item) {
        return strategies.getOrDefault(item.name, strategies.get("default"));
    }
}
