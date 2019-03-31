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

public class BackstagePass extends ItemCategory {

    @Override
    protected void updateExpired(Item item) {
            item.quality = 0;
    }
    
    @Override
    protected void updateQuality(Item item) {
            IncrementQuality(item);
            if (item.sellIn <= 10) {
                IncrementQuality(item);
            }
            if (item.sellIn <= 5) {
                IncrementQuality(item);
            }
    }
    
}
