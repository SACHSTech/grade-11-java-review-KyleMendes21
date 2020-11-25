package gr11review.part1;
import java.io.*;
// javac -d bin src/gr11review/part1/Review1.java
// java -classpath bin gr11review/part1.Review1

/**
* A program that outputs the day of the year given the month and day 
@author: K. Mendes
*
*/
public class Review1 {

  public static void main(String[] args) throws Exception {

    // Create BufferedReader
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Initialize Variables
    int intMonth;
    int intDay;
    int intDayNumber;
    int intCount;
    int intTotal = 0;

    // Getting month and day
		System.out.println("Enter the month number: ");
		intMonth = Integer.parseInt(keyboard.readLine());
    System.out.println("Enter the day number: ");
		intDay = Integer.parseInt(keyboard.readLine());

    // Calculate Month Total
    for (intCount = 1; intCount < intMonth; intCount++) {
      // Look at the months until the month inputted 
      // Month 4, 6, 9, 11 have 30 days, month 2 has 28 days and month 1, 3, 5, 7, 8, 10, 12 have 31 days
      if (intCount == 2) {
        intTotal = intTotal + 28;
      }else if (intCount == 4 || intCount == 6 || intCount == 9 || intCount == 11){
        intTotal = intTotal + 30;
      }else {
        intTotal = intTotal + 31;
      }

    }
    
    // Calculate day number using day inputted and month total from above
    intDayNumber = intTotal + intDay;

    // Print result
    System.out.println(intDayNumber);

   }

}