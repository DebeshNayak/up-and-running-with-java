/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugging;

/**
 *
 * @author debes
 */
public class Debugging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        double average, value;
        String[] daysOfTheWeek = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };
        value = 3.75;
        number = (int)value;
        //average = (3 + 5 + 8) / 0;
        System.out.println("The first day of the week is: "+daysOfTheWeek[0]);
        System.out.println("The last day of the week is: "+daysOfTheWeek[6]);
        average = (3 + 5 + 8) / 3.0;
        System.out.println("Expected value is 5.33, actual value is: "+ average);
    }
    
}
