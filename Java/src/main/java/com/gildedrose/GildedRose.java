package com.gildedrose;

import com.gildedrose.Update.UpdateLogic;
import com.gildedrose.Update.UpdateLogicFactory;

class GildedRose {
    Item[] items;
    UpdateLogicFactory updateLogicFactory;

    public GildedRose(Item[] items) {
        this.items = items;
        updateLogicFactory = new UpdateLogicFactory();
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdateLogic updateLogic = updateLogicFactory.getUpdateLogic(item);
            updateLogic.update(item);
        }
    }
}
