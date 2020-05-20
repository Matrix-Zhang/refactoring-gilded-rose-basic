package cn.xpbootcamp.gilded_rose;

public class NormalCommodity extends Commodity {
    public NormalCommodity(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQualityBeforeSellIn() {
        quality--;
    }

    @Override
    public void updateQualityAfterSellIn() {
        if (sellIn <0) {
            quality--;
        }
    }

}
