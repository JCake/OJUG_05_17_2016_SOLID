package gildedRose;

// From https://github.com/alexaitken/GildedRose_java/blob/master/src/com/alexaitken/gildedrose/Item.java
public abstract class Item {

    private final String name;

    private int sellIn;
    private int quality;

    public Item(String name, int sellIn, int quality) {
        super();
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public abstract void updateQuality();

    public void updateSellIn(){
        this.sellIn = this.sellIn - 1;
    }
}