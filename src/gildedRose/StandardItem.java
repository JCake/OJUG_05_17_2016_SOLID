package gildedRose;

/**
 * Created by jcake on 5/17/2016.
 */
public class StandardItem extends Item {
    public StandardItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (this.getQuality() > 0) {
            this.setQuality(this.getQuality() - 1);
        }

        if (this.getSellIn() < 0) {
            if (this.getQuality() > 0) {
                this.setQuality(this.getQuality() - 1);
            }
        }
    }
}
