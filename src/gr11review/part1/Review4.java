package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

// javac -d bin src/gr11review/part1/Review4.java
// java -classpath bin gr11review/part1.Review4
public class Review4 {

  public static void main(String[] args) throws Exception {

    DecimalFormat twoDecimalPlaces = new DecimalFormat ("0.00");

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Variables
    int intItems;
    int intCount;
    double dblItem;
    double dblTotal = 0.0;
    double dblSubtotal;
    double dblTax;
    String strTotal;
    String strSubtotal;
    String strTax;

    // Get Info
		System.out.println("How many items do you want to buy?");
		intItems = Integer.parseInt(keyboard.readLine());

    // Get Prices
    for (intCount = 0; intCount < intItems; intCount++){
      System.out.println("Enter the price for item "+(intCount + 1)+":");
      dblItem = Double.parseDouble(keyboard.readLine());
      dblTotal = dblTotal + dblItem;
    }

    // Calculate tax and total
    strSubtotal = twoDecimalPlaces.format(dblTotal);
    strTax = twoDecimalPlaces.format(dblTotal * 0.13);
    strTotal = twoDecimalPlaces.format(dblTotal * 1.13);

    // Output Info
    System.out.println("Subtotal: $"+strSubtotal);
    System.out.println("Tax: $"+strTax);
    System.out.println("Total: $"+strTotal);

  }

}
