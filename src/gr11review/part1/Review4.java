package gr11review.part1;
import java.io.*;
// javac -d bin src/gr11review/part1/Review4.java
// java -classpath bin gr11review/part1.Review4
public class Review4 {

  public static void main(String[] args) throws Exception {

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Variables
    int intItems;
    int intPrice;
    int intDayNumber;
    int intCount;
    int intTotal = 0;

    // Get Info
		System.out.println("How many items would you like to purchase?");
		intItems = Integer.parseInt(keyboard.readLine());

    // Get Prices
    for (intCount = 1; intCount == intItems; intCount++){
      System.out.println("Enter the price for item "+intCount+":");
      intPrice = Integer.parseInt(keyboard.readLine());
      intTotal = intTotal + intPrice;
    }

    System.out.println(intTotal);

  }

}
