package com.gildedrose;

import com.gildedrose.updateLogic.UpdateLogic;
import com.gildedrose.updateLogic.UpdateLogics;

class GildedRose {
    Item[] items;
    UpdateLogics updateLogics;

    public GildedRose(Item[] items) {
        this.items = items;
        this.updateLogics = new UpdateLogics();
    }

    public void updateQuality() {
        for (Item item : items){
            UpdateLogic updateLogic = updateLogics.findUpdateLogic(item.name);
            updateLogic.update(item);
        }
    }
}
