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
public class Conjured extends ItemCategory {
    
        protected void updateExpired(Item item) {
            decrementQuality(item);
            decrementQuality(item);
        }
        
        protected void updateQuality(Item item) {
            decrementQuality(item);
            decrementQuality(item);
        }
        
}
