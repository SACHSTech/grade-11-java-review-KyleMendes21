package gr11review.part1;
import java.io.*;

// javac -d bin src/gr11review/part1/Review7.java
// java -classpath bin gr11review/part1.Review7

public class Review7 {

  public static void main(String[] args) throws Exception {

    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Variables
    int intLength;
    int intSpaces = 0;
    int intA = 0;
    int intCount;
    String theSentence;
    String strOdd = "";
    // Char
    char chrCharacter;

    // input sentence and get value
    theSentence = keyboard.readLine();
    intLength = theSentence.length();

    // something
    for (intCount = 0; intCount < intLength; intCount++) {

      chrCharacter = theSentence.charAt(intCount);

      if (chrCharacter == ' ') {
        intSpaces = intSpaces + 1;
      }else if (chrCharacter == 'a' || chrCharacter == 'A') {
        intA = intA + 1;
      }if (intCount % 2 == 0) {
        strOdd = strOdd + (theSentence.charAt(intCount)) + "-";
      }

    }

    System.out.println("There are "+intLength+ " characters in the sentence");
    System.out.println("There are "+intSpaces+ " spaces in the sentence");
    System.out.println("There are "+intA+" letter a's in the sentence");
    System.out.println("Taking the odd numbered characters in the sentence produces the following string "+strOdd);

  }
}

    