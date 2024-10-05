package com.gildedrose;

import com.gildedrose.updateLogic.UpdateLogic;
import com.gildedrose.updateLogic.UpdateLogicFactory;

class GildedRose {
    Item[] items;
    UpdateLogicFactory updateLogics;

    public GildedRose(Item[] items) {
        this.items = items;
        this.updateLogics = new UpdateLogicFactory();
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdateLogic updateLogic = updateLogics.findUpdateLogic(item.name);
            updateLogic.update(item);
        }
    }
}
