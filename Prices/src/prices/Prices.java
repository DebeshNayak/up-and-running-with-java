/*
 * this program has a 2-D array to represent prices and discounts
 */
package prices;
import java.util.Scanner;
/**
 *
 * @author debes
 */
public class Prices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] prices = new double[5][2];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the original prices; ");
            prices[i][0] = in.nextDouble();
            prices[i][1] = prices[i][0] * .70;
        }
        for(int i = 0; i < 5; i++){
             System.out.println("Original price $" + prices[i][0] +
                     "\tdiscounted price $"+prices[i][1]);
             
        }
    }
    
}
