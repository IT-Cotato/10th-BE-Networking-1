package java.com.gildedrose.ItemHandler;

import com.gildedrose.Item;

public class RegularItemHandler extends QualityHandler {
    @Override
    public void handleItem(Item item) {
        item.sellIn -= 1;
        decreaseQuality(item, 1);

        if (item.sellIn < 0) {
            decreaseQuality(item, 1);
        }
    }
}
