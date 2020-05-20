package cn.xpbootcamp.gilded_rose;

class GildedRose {
    Commodity[] commodities;

    public GildedRose(Commodity[] commodities) {
        this.commodities = commodities;
    }

    public void update_quality() {
        for (Commodity commodity : commodities) {
            commodity.updateQuality();
        }
//        for (Commodity commodity : commodities) {
//            if (!commodity.name.equals("Aged Brie")
//                    && !commodity.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (commodity.quality > 0) {
//                    if (!commodity.name.equals("Sulfuras, Hand of Ragnaros")) {
//                        commodity.quality = commodity.quality - 1;
//                    }
//                }
//            } else {
//                if (commodity.quality < 50) {
//                    commodity.quality = commodity.quality + 1;
//
//                    if (commodity.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (commodity.sellIn < 11) {
//                            if (commodity.quality < 50) {
//                                commodity.quality = commodity.quality + 1;
//                            }
//                        }
//
//                        if (commodity.sellIn < 6) {
//                            if (commodity.quality < 50) {
//                                commodity.quality = commodity.quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!commodity.name.equals("Sulfuras, Hand of Ragnaros")) {
//                commodity.sellIn = commodity.sellIn - 1;
//            }
//
//            if (commodity.sellIn < 0) {
//                if (!commodity.name.equals("Aged Brie")) {
//                    if (!commodity.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (commodity.quality > 0) {
//                            if (!commodity.name.equals("Sulfuras, Hand of Ragnaros")) {
//                                commodity.quality = commodity.quality - 1;
//                            }
//                        }
//                    } else {
//                        commodity.quality = 0;
//                    }
//                } else {
//                    if (commodity.quality < 50) {
//                        commodity.quality = commodity.quality + 1;
//                    }
//                }
//            }
//        }
    }
}
