package gr11review.part1;
import java.io.*;
// javac -d bin src/gr11review/part1/Review2.java
// java -classpath bin gr11review/part1.Review2
public class Review2 {

  public static void main(String[] args) throws Exception {

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    int intChoice;

    // Options avaible
    System.out.println("0 - print an joke about your hair");
    System.out.println("1 - print an joke about your feet");
    System.out.println("2 - print an joke about your clothes");
    System.out.println("3 - print an joke about your teacher");
    System.out.println("Choose a menu option:");
    intChoice = Integer.parseInt(keyboard.readLine());

    // if statement with switch
    if (intChoice == 0 || intChoice == 1 || intChoice == 2 || intChoice == 3) {
      System.out.println("Choose a menu option:");

      switch (intChoice) {
        case 0:
          System.out.println("ADD JOKE Hair");
          System.out.println("ADD Answer");
          break;
        case 1:
          System.out.println("ADD JOKE Feet");
          System.out.println("ADD Answer");
          break;
        case 2:
          System.out.println("ADD JOKE Clothes");
          System.out.println("ADD Answer");
          break;
        case 3:
          System.out.println("ADD JOKE Teacher");
          System.out.println("ADD Answer");
          break;
      }

    } else {
      System.out.println("Invalid menu option");
    }
    

  }

}