package edu.soe;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    Item[] items = new Item[7];

    items[0] = new Item("+5 Dexterity Vest", 10, 20);
    items[1] = new Item("+5 Dexterity Vest", 10, 20);
    items[2] = new Item("Aged Brie", 2, 0);
    items[3] = new Item("Elixir of the Mongoose", 5, 7);
    items[4] = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
    items[5] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
    items[6] = new Item("Conjured Mana Cake", 3, 6);
    printItems(items);

    GildedRose gildedRose = new GildedRose(items);

    for (int i = 1; i<=100; i++ ) {
      gildedRose.updateQuality();
      printItems(items);
    }
  }

  public static void printItems(Item[] items) {
    System.out.println("###################################");
    for (Item item : items) {
      System.out.println(item);
    }
  }
}
