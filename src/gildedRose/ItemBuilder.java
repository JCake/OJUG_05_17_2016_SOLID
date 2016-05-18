package gildedRose;

/**
 * Created by jcake on 5/17/2016.
 */
public class ItemBuilder {

    public static Item buildItem(String name, int sellIn, int quality){
        switch(name) {
            case "Sulfuras, Hand of Ragnaros" :
                return new Sulfuras(name, sellIn, quality);
            case "Aged Brie" :
                return new AgedBrie(name, sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert" :
                return new ConcertTicket(name, sellIn, quality);
            default:
                return new StandardItem(name, sellIn, quality);
        }
    }
}
