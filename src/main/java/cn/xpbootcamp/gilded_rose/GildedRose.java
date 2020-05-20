package cn.xpbootcamp.gilded_rose;

class GildedRose {
    Commodity[] commodities;

    public GildedRose(Commodity[] commodities) {
        this.commodities = commodities;
    }

    public void update_quality() {
        for (int i = 0; i < commodities.length; i++) {
            if (!commodities[i].name.equals("Aged Brie")
                    && !commodities[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (commodities[i].quality > 0) {
                    if (!commodities[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        commodities[i].quality = commodities[i].quality - 1;
                    }
                }
            } else {
                if (commodities[i].quality < 50) {
                    commodities[i].quality = commodities[i].quality + 1;

                    if (commodities[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (commodities[i].sellIn < 11) {
                            if (commodities[i].quality < 50) {
                                commodities[i].quality = commodities[i].quality + 1;
                            }
                        }

                        if (commodities[i].sellIn < 6) {
                            if (commodities[i].quality < 50) {
                                commodities[i].quality = commodities[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!commodities[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                commodities[i].sellIn = commodities[i].sellIn - 1;
            }

            if (commodities[i].sellIn < 0) {
                if (!commodities[i].name.equals("Aged Brie")) {
                    if (!commodities[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (commodities[i].quality > 0) {
                            if (!commodities[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                commodities[i].quality = commodities[i].quality - 1;
                            }
                        }
                    } else {
                        commodities[i].quality = 0;
                    }
                } else {
                    if (commodities[i].quality < 50) {
                        commodities[i].quality = commodities[i].quality + 1;
                    }
                }
            }
        }
    }
}
