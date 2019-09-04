/**
 * Skeleton of a program that takes in an ordered pair and prints the quadrant in which it lies.
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Quadrant
{
    public static void main( String[] args) {
        //variable declarations
        double x;
        double y;
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Please enter a value for x");  //prompt the user for an x-coordinate
        x = keys.nextDouble();
        //your x variable = keys.nextDouble();
        System.out.println("Please enter a value for y");  //prompt the user for a y-coordinate
        y = keys.nextDouble();
        //your y variable = keys.nextDouble();
        keys.close();
        
        if (x > 0 && y > 0){
            System.out.println("The point (" + x + ","  + y + ") is located in quadrant 1");
    }
        //determine the quadrant in which the user's order pair lies
        else if (x < 0 && y > 0){
            System.out.println("The point (" + x + ","  + y + ") is located in quadrant 2");
        }
        else if (x < 0 && y < 0){
            System.out.println("The point (" + x + ","  + y + ") is located in quadrant 3");
        }
        else if (x > 0 && y < 0){
            System.out.println("The point (" + x + ","  + y + ") is located in quadrant 4");
        }
        //output the result to the user
    }
}