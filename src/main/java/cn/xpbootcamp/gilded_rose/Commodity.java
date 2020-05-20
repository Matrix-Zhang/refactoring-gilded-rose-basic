package cn.xpbootcamp.gilded_rose;

interface CommodityInterface {
    void updateQualityBeforeSellIn();

    void updateSellIn();

    void updateQualityAfterSellIn();
}

public abstract class Commodity implements CommodityInterface {
    public String name;

    int sellIn;

    int quality;

    public Commodity(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Commodity createItem(String name, int sellIn, int quality) {
        switch (name) {
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasCommodity(name, sellIn, quality);

            case "Aged Brie":
                return new AgedBrieCommodity(name, sellIn, quality);

            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassCommodity(name, sellIn, quality);

            default:
                return new NormalCommodity(name, sellIn, quality);
        }
    }

    public int getQuality() {
        return Math.min(Math.max(0, this.quality), 50);
    }

    @Override
    public void updateQualityBeforeSellIn() {
    }

    @Override
    public void updateSellIn() {
    }

    @Override
    public void updateQualityAfterSellIn() {
    }

    public void updateQuality() {
        updateQualityBeforeSellIn();
        updateSellIn();
        if (sellIn < 0) {
            updateQualityAfterSellIn();
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.getQuality();
    }
}
