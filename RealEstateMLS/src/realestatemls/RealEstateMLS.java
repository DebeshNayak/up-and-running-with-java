/*
 * This program is used to demonstrate ArrayList using the Property class
 * as the source of a our objects
 */
package realestatemls;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author debes
 */
public class RealEstateMLS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Property> mls = new ArrayList<Property>();
        Property p1 = new Property(1000, "Land", 3.5);
        mls.add(p1);
        p1 = new Property(230000, "Estate", 2.0, 2, 3);
        mls.add(p1);
        System.out.println(mls.toString());
        mls.remove(1);
        System.out.println("After: "+ mls.toString());
    }
    
}
