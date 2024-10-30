package java.com.gildedrose.ItemHandler;

import com.gildedrose.Item;

public class SulfurasItemHandler implements ItemHandler {
    @Override
    public void handleItem(Item item) {
        // Sulfuras는 전설의 아이템, 그래서 따로 품질과 SellIn 값이 변하지 않음
    }
}
