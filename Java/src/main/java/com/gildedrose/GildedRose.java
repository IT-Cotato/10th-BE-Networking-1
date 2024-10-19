package com.gildedrose;

import com.gildedrose.constant.ItemName;
import com.gildedrose.update.Update;
import com.gildedrose.update.UpdateFactory;

class GildedRose {
    Item[] items;
    private final UpdateFactory updateFactory;

    public GildedRose(Item[] items) {
        this.items = items;
        updateFactory = new UpdateFactory();
    }

    public void updateQuality() {
        for (Item item : items) {
            Update updateHandler = updateFactory.getUpdateHandler(
                ItemName.from(item)
            );
            updateHandler.update(item);
        }
    }
}
