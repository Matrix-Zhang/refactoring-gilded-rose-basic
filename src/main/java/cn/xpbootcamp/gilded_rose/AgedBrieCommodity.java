package cn.xpbootcamp.gilded_rose;

public class AgedBrieCommodity extends Commodity {
    public AgedBrieCommodity(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQualityBeforeSellIn() {
        quality = quality + 1;
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }

    @Override
    public void updateQualityAfterSellIn() {
        quality = quality + 1;
    }
}
