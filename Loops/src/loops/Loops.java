/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author debes
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // do while
        System.out.println("Result of do/while loop: ");
        int count = 0;
        do {
            System.out.println("Hello World!");
            count++;
        } while(count < 3);
        
        // while loop
        System.out.println("Result of while loop: ");
        count = 0;
        while(count < 3){
            System.out.println("Hello World");
            count++;
        }
        
        // for loop
        System.out.println("Results of for loop: ");
        for(int i = 0; i < 3; i++){
            System.out.println("Hello World");
        }
    }
    
}
