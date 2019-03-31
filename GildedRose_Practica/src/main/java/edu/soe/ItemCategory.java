/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.soe;

/**
 *
 * @author PcLore
 */
public class ItemCategory {
    
        protected void IncrementQuality(Item item) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
        
//        protected void decrementQuality(Item item) {
//            if (item.quality > 0) {
//                item.quality = item.quality - 1;
//            }
//        }
        
         protected void decrementQuality(Item item) {
            if (item.sellIn > 0) {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
            }
            else {
//                if (item.quality > 0) {
                    item.quality = item.quality - 2;
//                }
            }
        }
         
        protected void updateExpired(Item item) {
            decrementQuality(item);
        }
        
//        protected void updateSellIn(Item item) {
//            if (item.sellIn > 0) {
//                item.sellIn = item.sellIn - 1;
//            }
//        }
       
        protected void updateSellIn(Item item) {
            if (item.sellIn > 0) {
                item.sellIn = item.sellIn - 1;
            }
            else {
                item.quality = item.sellIn;
            }
        }
        
        protected void updateQuality(Item item) {
            decrementQuality(item);
        }
        
        protected void updateOneItem(Item item) {
            updateQuality(item);
        
            updateSellIn(item);
            if (item.sellIn < 0) {
                updateExpired(item);
            }
        }
        
}
