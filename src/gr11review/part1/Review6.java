package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

// javac -d bin src/gr11review/part1/Review6.java
// java -classpath bin gr11review/part1.Review6
 
/**
* A program that outputs and calculates total, tax and subtotal for items until user enters 0 as price
@author: K. Mendes
*
*/
public class Review6 {

  public static void main(String[] args) throws Exception {

    // Adding decimal format
    DecimalFormat twoDecimalPlaces = new DecimalFormat ("0.00");

    // Adding BufferedReader to get input
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Initialize variables
    int intItems = 1;
    int intCount = 1;
    double dblItem = 1.0;
    double dblTotal = 0.0;
    double dblSubtotal;
    double dblTax;
    String strTotal;
    String strSubtotal;
    String strTax;

    // Looping until user enters 0
    while (dblItem != 0) {
      // Getting price of the items
      System.out.println("Enter the price for item "+(intCount)+":");
      dblItem = Double.parseDouble(keyboard.readLine());
      dblTotal = dblTotal + dblItem;
      intCount = intCount + 1;
    }

    // Calculate tax and total
    strSubtotal = twoDecimalPlaces.format(dblTotal);
    strTax = twoDecimalPlaces.format(dblTotal * 0.13);
    strTotal = twoDecimalPlaces.format(dblTotal * 1.13);

    // Output info
    System.out.println("Subtotal: $"+strSubtotal);
    System.out.println("Tax: $"+strTax);
    System.out.println("Total: $"+strTotal);

  }

}