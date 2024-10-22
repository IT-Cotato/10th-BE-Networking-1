package com.gildedrose;

import com.gildedrose.updateItem.ItemClassification;
import com.gildedrose.updateItem.UpdateLogic;
import com.gildedrose.updateItem.UpdateLogicFactory;

class GildedRose {
    Item[] items;
    private final UpdateLogicFactory updateLogicFactory;

    public GildedRose(Item[] items) {
        this.items = items;
        updateLogicFactory = new UpdateLogicFactory();
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdateLogic updateLogic = updateLogicFactory.findUpdateLogic(ItemClassification.of(item));
            updateLogic.update(item);
        }
    }
}
