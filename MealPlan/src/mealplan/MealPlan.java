/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealplan;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author debes
 */
public class MealPlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // call getTotalMealWeeks method, which returns the number of weeks
        int numWeeks = getTotalMealWeeks();
        double[] dailyMealCost = new double[7];
        // print array contents before callling the method, should be all zeros
        System.out.println("Before calling the method: "+
                Arrays.toString(dailyMealCost));
        // call getDailyMealCost method - uses call by reference
        getDailyMealCost(dailyMealCost);
        // print array contents after calling the method
        System.out.println("After calling the methods: "+
                Arrays.toString(dailyMealCost));
        double totalCost = computeMealPlanCost(numWeeks, dailyMealCost);
        printTotalMealPlanCost(totalCost);
    }
    public static int getTotalMealWeeks(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many weeks are in your semester? ");
        int totalWeeks = in.nextInt();
        return totalWeeks;
    }
    public static void getDailyMealCost(double[] dailyCost){ // 
        Scanner in = new Scanner(System.in);
        // note the use of the arrays length, this allow it to  vary depending
        // on the value passed in the parameter list.
        for (int i = 0; i < dailyCost.length; i++){
            System.out.println("Enter the estimated cost for day: "+(i+1));
            dailyCost[i] = in.nextDouble();
        }
    }
    public static double computeMealPlanCost(int numWeeks, double[] dailyCost){
        double totalCost = 0, weeklyCost = 0; 
        for(int i = 0; i < dailyCost.length; i++){
            weeklyCost += dailyCost[i];
        }
        totalCost = weeklyCost * numWeeks;
        return totalCost;
    }
    public static void printTotalMealPlanCost(double total){
        System.out.printf("Your estimated total meal plan cost for the "
                + "semester is: $%5.2f", total);
        System.out.println();
    }
    
}
