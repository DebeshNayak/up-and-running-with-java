/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author debes
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 76, 85};
        iSort(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+"\t");
        }
    }
    public static void iSort(int[] num){
        int j, key, i;
        for(j = 1; j < num.length; j++){ // start with 1
            key = num[j];
            for(i = j-1; i >= 0 && (num[i] < key); i--)  // smaller values are moving up
                num[i + 1] = num[i];
            num[i+1] = key;  // put the key in its proper location
        }
    }
    
}
