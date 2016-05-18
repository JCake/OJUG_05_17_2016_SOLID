package gildedRose;

import java.util.Objects;

// From https://github.com/alexaitken/GildedRose_java/blob/master/src/com/alexaitken/gildedrose/Inventory.java
public class Inventory {

    private Item[] items;

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        item.updateSellIn();
        item.updateQuality();

    }
}