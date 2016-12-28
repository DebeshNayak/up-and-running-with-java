/**
 * Read data from a file
 * Include error-handling logic
 * Write data to a file
 */
package resturant;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author debes
 */
public class Resturant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read from a file
        File inputFile = new File("menus.txt");
        File outputFile = new File("menu_with_price.txt");
        String menu;
        Double price;
        try{
            // get all the content of the file
            Scanner input = new Scanner(inputFile);
            PrintWriter out = new PrintWriter(outputFile);
            Scanner in = new Scanner(System.in);
            // Get all items line by line from the file
            while(input.hasNextLine()){
                menu = input.nextLine();
                // Ask the user for the price of this menu
                System.out.println("Please enter the price of "+ menu +" menu in Rupees.");
                price = in.nextDouble();
                out.println("Price of "+menu+" is: "+price);
            }
            // close the file
            out.close();
        }catch(Exception e){
            System.out.println("The input file \"menus.txt\" was not found.");
            System.out.println(e.toString());
        }
    }
}
