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
public class Cheese extends ItemCategory {
    
    @Override
     protected void updateExpired(Item item) {
        IncrementQuality(item);
    }
     
    @Override
    protected void updateQuality(Item item) {
        IncrementQuality(item);
    }
    
}
