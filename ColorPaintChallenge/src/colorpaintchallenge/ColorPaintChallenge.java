/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorpaintchallenge;
import java.util.Scanner;
/**
 *
 * @author debes
 */
public class ColorPaintChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double w, l, h;
        double winNum, winWidth, winHeight;
        double doorNum, doorWidth, doorHeight;
        double surfaceArea;
        System.out.println("Please enter the width, lenght, height of "
                + "the house to be painted");
        Scanner in = new Scanner(System.in);
        w = in.nextDouble();
        l = in.nextDouble();
        h = in.nextDouble();
        System.out.println("Please enter the number of windows, width and height");
        winNum = in.nextDouble();
        winWidth = in.nextDouble();
        winHeight = in.nextDouble();
        System.out.println("Please enter the number of doors, width and height");
        doorNum = in.nextDouble();
        doorWidth = in.nextDouble();
        doorHeight = in.nextDouble();
        surfaceArea = (w * h * 2 + l * h * 2) - ((winNum * winHeight * winWidth) + (doorNum * doorHeight * doorWidth));
        System.out.println("Total surface area to be printed: "+ surfaceArea);
    }
}
