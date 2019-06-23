package ch02pc13;

import java.util.Scanner;
/**
 *
 * @author frank.olson
 * date: 11/1/2017
 */
public class Ch02pc13 {

    public static void main(String[] args) {
    
        //variables
        double mealCharge;
        double tax = 0.0675;
        double tip = 0.20;
        double mealTax;
        double mealTip;
        double totalBill;
        
        //create scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Request meal charge
        System.out.print("What was the charge for the bill? $");
        mealCharge = keyboard.nextDouble();
                
        //calculations
        mealTax = mealCharge * tax;
        mealTip = mealCharge * tip;
        totalBill = mealCharge + mealTax + mealTip;
        
        //Display meal charge, tax amount, tip amount, total bill
        System.out.println("The amount for the meal is: $" + mealCharge);
        System.out.println("The tax due for the meal is: $" + mealTax);
        System.out.println("The tip due for the meal is: $" + mealTip);
        System.out.println("The total amount due is: $" + totalBill);
        
    }
    
}
