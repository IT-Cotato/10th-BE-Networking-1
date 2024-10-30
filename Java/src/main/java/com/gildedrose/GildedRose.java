package java.com.gildedrose;

import java.com.gildedrose.ItemHandler.ItemHandler;
import java.com.gildedrose.ItemHandler.ItemHandlerFactory;

class GildedRose {
    // Max_Quality와 Min_Quality 상수 도입
    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 50;
    public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemHandler handler = ItemHandlerFactory.getHandler(item);
            handler.handleItem(item);
        }
    }
}

