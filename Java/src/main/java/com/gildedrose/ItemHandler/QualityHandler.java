package java.com.gildedrose.ItemHandler;

import java.com.gildedrose.Item;

public abstract class QualityHandler implements ItemHandler {
    public void decreaseQuality(Item item, int amount) {
        item.quality = Math.max(item.quality - amount, GildedRose.MIN_QUALITY);
    }
}
