package cn.xpbootcamp.gilded_rose;

public abstract class Commodity {

    public String name;

    int sellIn;

   int quality;

    public int getQuality() {
       return Math.min(Math.max(0, this.quality), 50);
    }

    public Commodity(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }


    public static Commodity createItem(String name, int sellIn, int quality) {
        switch(name) {
            default:
                return new NormalCommodity(name, sellIn, quality);
        }
    }

    public abstract void updateQualityBeforeSellIn();
    public abstract void updateQualityAfterSellIn();

    public void updateQuality() {
        this.updateQualityBeforeSellIn();
        this.sellIn--;
        this.updateQualityAfterSellIn();
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.getQuality();
    }
}
