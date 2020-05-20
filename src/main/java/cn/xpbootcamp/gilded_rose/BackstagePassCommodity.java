package cn.xpbootcamp.gilded_rose;

public class BackstagePassCommodity extends Commodity {

    public BackstagePassCommodity(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQualityBeforeSellIn() {
        quality++;

        if (sellIn < 11) {
            quality++;
        }

        if (sellIn < 6) {
            quality++;
        }
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }

    @Override
    public void updateQualityAfterSellIn() {
        quality = 0;
    }
}
