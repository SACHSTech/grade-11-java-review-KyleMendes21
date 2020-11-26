package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* A program that gets item prices one by one and then calculates total,tax and subtotal
@author: K. Mendes
*
*/

public class Review4 {

  public static void main(String[] args) throws Exception {

    // Adding decimal format
    DecimalFormat twoDecimalPlaces = new DecimalFormat ("0.00");

    // Add BufferedReader to get input
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Initialize variables
    int intItems;
    int intCount;
    double dblItem;
    double dblTotal = 0.0;
    String strTotal;
    String strSubtotal;
    String strTax;

    // Get how many items user wants to buy
		System.out.println("How many items do you want to buy?");
		intItems = Integer.parseInt(keyboard.readLine());

    // Get price for items
    for (intCount = 0; intCount < intItems; intCount++) {
      System.out.println("Enter the price for item " + (intCount + 1) + ":");
      dblItem = Double.parseDouble(keyboard.readLine());
      dblTotal = dblTotal + dblItem;
    }

    // Calculate tax and total
    strSubtotal = twoDecimalPlaces.format(dblTotal);
    strTax = twoDecimalPlaces.format(dblTotal * 0.13);
    strTotal = twoDecimalPlaces.format(dblTotal * 1.13);

    // Print calculations
    System.out.println("Subtotal: $" + strSubtotal);
    System.out.println("Tax: $" + strTax);
    System.out.println("Total: $" + strTotal);

  }

}
