package gildedRose;


public class Sulfuras extends Item {
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // does not update
    }

    @Override
    public void updateSellIn(){
        // does not update
    }
}
