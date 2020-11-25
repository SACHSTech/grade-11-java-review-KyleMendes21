package gr11review.part1;
import java.io.*;

// javac -d bin src/gr11review/part1/Review5.java
// java -classpath bin gr11review/part1.Review5

/**
* A program that outputs and calculates the number of years for money to compound to goal amount
@author: K. Mendes
*
*/
public class Review5 {

  public static void main(String[] args) throws Exception {

    // Add BufferedReader to get input
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Initialize variables
    int intYears = 0;
    double dblYearlyAmount;
    double dblInterestRate;
    double dblTargetAmount;
    double dblInterestDecimal;
    double dblAmount = 0;

    // Getting all the informations (yearly amount, interest rate and target amount)
    System.out.println("Enter the yearly invested amount:");
    dblYearlyAmount = Double.parseDouble(keyboard.readLine());
    System.out.println("Enter the compound interest rate:");
    dblInterestRate = Double.parseDouble(keyboard.readLine());
    System.out.println("Enter the target amount:");
    dblTargetAmount = Double.parseDouble(keyboard.readLine());

    // Calculating Interest Decimal
    dblInterestDecimal = (dblInterestRate / 100.0) + 1;

    // Compounding the amount
    while (dblAmount < dblTargetAmount) {
      intYears = intYears + 1;
      dblAmount = dblAmount + dblYearlyAmount;
      dblAmount = dblAmount * dblInterestDecimal;
    }

    // Print info
    System.out.println("The target amount will be earned in "+intYears+" years.");

  }

}
