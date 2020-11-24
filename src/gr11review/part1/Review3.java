package gr11review.part1;
import java.io.*;
// javac -d bin src/gr11review/part1/Review1.java
// java -classpath bin gr11review/part1.Review1
public class Review3{

  public static void main(String[] args) throws IOException {
    
    // Variables
    int intCount;

    // 20 - 100 counting
    for (intCount = 21; intCount < 100; intCount += 2){
      System.out.println(intCount);
    }

    System.out.println();

    // 29 - 2
    for (intCount = 29; intCount > 1; intCount --){
      System.out.println(intCount);
    }
  
  }

}
