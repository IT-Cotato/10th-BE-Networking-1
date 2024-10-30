package java.com.gildedrose.ItemHandler;

import java.util.HashMap;
import java.util.Map;

import com.gildedrose.Item;

public class ItemHandlerFactory {
    private static final Map<String, ItemHandler> handlerMap = new HashMap<>();

    static {
        handlerMap.put("Aged Brie", new BrieItemHandler());
        handlerMap.put("Sulfuras, Hand of Ragnaros", new SulfurasItemHandler());
        handlerMap.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassItemHandler());
        handlerMap.put("Conjured Mana Cake", new ConjuredItemHandler());
    }

    public static ItemHandler getHandler(Item item) {
        return handlerMap.getOrDefault(item.name, new RegularItemHandler());
    }
}
