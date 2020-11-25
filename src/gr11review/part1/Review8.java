package gr11review.part1;
import java.io.*;
// javac -d bin src/gr11review/part1/Review8.java
// java -classpath bin gr11review/part1.Review8
public class Review8 {

  public static void main(String[] args) throws Exception {

    // Variables
    int intRandom1;
    int intRandom2;
    int intRandom3;
    int intCount;
    int intTotal = 0;

    // pull
    for (intCount = 1; intCount < 1001; intCount++) {
      intRandom1 = (int)(Math.random()*5+0);
      intRandom2 = (int)(Math.random()*5+0);
      intRandom3 = (int)(Math.random()*5+0);
      System.out.println(intRandom1+" "+intRandom2+" "+intRandom3);
      if (intRandom1 == intRandom2 && intRandom1 == intRandom3) {
        intTotal = intTotal + 1;
      }
    }

    System.out.println(intTotal);

  }

}
    
