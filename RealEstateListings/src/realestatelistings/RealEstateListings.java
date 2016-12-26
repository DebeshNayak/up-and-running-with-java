/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestatelistings;

/**
 *
 * @author debes
 */
public class RealEstateListings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Property land = new Property(10000, "Land", 2.1);
        Property estate = new Property(250000, "Estate", 1.5, 3, 4);
        System.out.println(land.toString());
        System.out.println(estate.toString());
        estate.setAskingPrice(23000);
        System.out.println(estate.toString());
    }
    
}
