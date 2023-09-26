package bg.softuni.fundamentals.dataTypesAndVariables;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
       String word = "ABCDE";
       StringBuilder wordTwo = new StringBuilder();
       for(int i = 0; i < word.length(); i++){
           wordTwo.append(word.charAt(i));
       }

        System.out.println(wordTwo);
    }
}
