package com.gildedrose;

public enum ItemType {

    AGED_BRIE {
        @Override
        public void updateQuality(Item item) {
            item.sellIn--;
            if (item.sellIn < 0) {
                item.quality += 2;
            } else {
                item.quality++;
            }

            if (item.quality > 50) {
                item.quality = 50;
            }
        }
    },
    SULFURAS {
        @Override
        public void updateQuality(Item item) {
        }

    },
    BACKSTAGE_PASSES {
        @Override
        public void updateQuality(Item item) {
            item.sellIn--;
            if (item.sellIn < 0) {
                item.quality = 0;
            } else if (item.sellIn < 6) {
                item.quality += 3;
            } else if (item.sellIn < 11) {
                item.quality += 2;
            }

            if (item.quality > 50) {
                item.quality = 50;
            }
        }
    },
    CONJURED {
        @Override
        public void updateQuality(Item item) {
            item.sellIn--;
            if (item.quality <= 0) {
                return;
            }
            if (item.sellIn < 0) {
                item.quality -= 4;
            } else {
                item.quality -= 2;
            }
        }
    },
    NORMAL_ITEM {
        @Override
        public void updateQuality(Item item) {
            item.sellIn--;
            if (item.quality <= 0) {
                return;
            }
            if (item.sellIn < 0) {
                item.quality -= 2;
            } else {
                item.quality--;
            }
        }
    };

    public abstract void updateQuality(Item item);
}
