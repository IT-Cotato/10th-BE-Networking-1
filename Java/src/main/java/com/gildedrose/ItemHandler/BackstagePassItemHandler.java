package java.com.gildedrose.ItemHandler;

import com.gildedrose.Item;

public class BackstagePassItemHandler implements ItemHandler {

    @Override
    public void handleItem(Item item) {
        item.sellIn -= 1;
        if (item.quality < 50) {
            item.quality += 1;
        }
        if (item.sellIn <= 10 && item.quality < 50) {
            item.quality += 1;
        }
        if (item.sellIn <= 5 && item.quality < 50) {
            item.quality += 1;
        }
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
