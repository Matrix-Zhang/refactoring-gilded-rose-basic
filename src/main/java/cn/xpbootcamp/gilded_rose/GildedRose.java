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
    }
}
