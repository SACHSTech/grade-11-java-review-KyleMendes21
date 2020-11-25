package gr11review.part1;
import java.io.*;
// javac -d bin src/gr11review/part1/Review3.java
// java -classpath bin gr11review/part1.Review3
 
/**
* A program that prints odd numbers from 20 to 100 and numbers 29 to 2 in decreasing order 
@author: K. Mendes
*
*/
public class Review3 {

  public static void main(String[] args) throws Exception {
    
    // Initialize variables
    int intCount;

    // Counting from 20 - 100 by adding 2 each time
    for (intCount = 21; intCount < 100; intCount += 2) {
      System.out.println(intCount);
    }

    // Add space to separate results
    System.out.println();

    // Counting from 29 - 2
    for (intCount = 29; intCount > 1; intCount --) {
      System.out.println(intCount);
    }
  
  }

}
