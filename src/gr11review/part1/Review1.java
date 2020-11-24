package gr11review.part1;
import java.io.*;
// javac -d bin src/gr11review/part1/Review1.java
// java -classpath bin gr11review/part1.Review1
public class Review1 {

  public static void main(String[] args) throws Exception {

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Variables
    int intMonth;
    int intDay;
    int intDayNumber;
    int intCount;
    int intTotal = 0;

    // Get Info
		System.out.println("Enter the month number: ");
		intMonth = Integer.parseInt(keyboard.readLine());
    System.out.println("Enter the day number: ");
		intDay = Integer.parseInt(keyboard.readLine());

    // Calculate Month Total
    for (intCount = 1; intCount < intMonth; intCount++){
      if (intCount == 2){
        intTotal = intTotal + 28;
      }else if (intCount == 4 || intCount == 6 || intCount == 9 || intCount == 11){
        intTotal = intTotal + 30;
      }else{
        intTotal = intTotal + 31;
      }

    }
    
    // Calculate day number
    intDayNumber = intTotal + intDay;

    // Print Total
    System.out.println(intDayNumber);

   }

}