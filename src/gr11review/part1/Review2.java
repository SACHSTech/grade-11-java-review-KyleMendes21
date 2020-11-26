package gr11review.part1;
import java.io.*;

/**
* A program that outputs a joke based on users choice
@author: K. Mendes
*
*/
public class Review2 {

  public static void main(String[] args) throws Exception {

    // Create BufferedReader
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    // Initialize Variables
    int intChoice;

    // Print options avaible and get option
    System.out.println("0 - print an joke about your hair");
    System.out.println("1 - print an joke about your feet");
    System.out.println("2 - print an joke about your clothes");
    System.out.println("3 - print an joke about your teacher");
    System.out.println("Choose a menu option:");
    intChoice = Integer.parseInt(keyboard.readLine());

    // Determine whether the option is valid
    if (intChoice == 0 || intChoice == 1 || intChoice == 2 || intChoice == 3) {
      System.out.println("Choose a menu option:");

      switch (intChoice) {

        // Creating cases with jokes and printing jokes
        case 0 :
          System.out.println("Where did the sheep get a hair cut?");
          System.out.println("At the baa-baa shop");
          break;
        case 1 :
          System.out.println("Why do cows have hooves instead of feet?");
          System.out.println("Because they lactose");
          break;
        case 2 :
          System.out.println("I bought camoflauge clothing");
          System.out.println("No one seemed to notice");
          break;
        case 3 :
          System.out.println("How is an english teacher like a judge?");
          System.out.println("They both give out sentences");
          break;
      }

    }else {
      System.out.println("Invalid menu option");
    }
    
  }

}