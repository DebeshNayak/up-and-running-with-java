/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customernames;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author debes
 */
public class CustomerNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File output = new File("customers.txt");
        String name;
        System.out.println("Enter the first customer name: ");
        name = in.nextLine();
        try{
            PrintWriter out = new PrintWriter(output);
            while(name.equalsIgnoreCase("done") == false){
                out.println(name);
                System.out.println("Enter the next name or \"done\" to exit.");
                name = in.nextLine();
            }
            out.close();
        }catch(Exception e){
            System.out.println("Error encounter "+e.toString());
        }
    }
    
}
