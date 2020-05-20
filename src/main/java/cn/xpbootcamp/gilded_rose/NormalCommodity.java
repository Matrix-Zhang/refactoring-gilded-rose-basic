package cn.xpbootcamp.gilded_rose;

public class NormalCommodity extends Commodity {
    public static final String tag = "NormalCommodity";

    public NormalCommodity(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQualityBeforeSellIn() {
        quality--;
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }

    @Override
    public void updateQualityAfterSellIn() {
        quality--;
    }
}
