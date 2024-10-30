package java.com.gildedrose.ItemHandler;

import com.gildedrose.Item;

public class ConjuredItemHandler extends QualityHandler {
    @Override
    public void handleItem(Item item) {
        item.sellIn -= 1;
        decreaseQuality(item, 2);

        if (item.sellIn < 0) {
            decreaseQuality(item, 2);
        }
    }
}
