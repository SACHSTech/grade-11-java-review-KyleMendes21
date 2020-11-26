package gr11review.part1;
import java.io.*;

/**
* A program that outputs 1000 pull slots and how many triples occur
@author: K. Mendes
*
*/
public class Review8 {

  public static void main(String[] args) throws IOException {

    // Initialize variables
    int intRandom1;
    int intRandom2;
    int intRandom3;
    int intCount;
    int intTotal = 0;

    // Creating and printing random numbers and counting how many triples
    for (intCount = 0; intCount < 1000; intCount++) {
      intRandom1 = (int)(Math.random() * 9 + 0);
      intRandom2 = (int)(Math.random() * 9 + 0);
      intRandom3 = (int)(Math.random() * 9 + 0);
      System.out.println(intRandom1 + " " + intRandom2 + " " + intRandom3);
      // count how many triples
      if (intRandom1 == intRandom2 && intRandom1 == intRandom3) {
        intTotal = intTotal + 1;
      }
    }

  // Printing how many triples
    System.out.println(intTotal);

  }

}
    
