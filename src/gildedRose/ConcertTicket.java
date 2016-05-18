package gildedRose;

/**
 * Created by jcake on 5/17/2016.
 */
public class ConcertTicket extends Item {
    public ConcertTicket(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        if (this.getQuality() < 50) {
            this.setQuality(this.getQuality() + 1);
            if (this.getSellIn() < 10) {
                if (this.getQuality() < 50) {
                    this.setQuality(this.getQuality() + 1);
                }
            }

            if (this.getSellIn() < 6) {
                if (this.getQuality() < 50) {
                    this.setQuality(this.getQuality() + 1);
                }
            }
        }

        if (this.getSellIn() < 0) {
            this.setQuality(0);
        }
    }
}
