package bg.softuni.fundamentals.textProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testOfCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Hello and goodbye";
         int currentIndex = text.indexOf("o");
         while(currentIndex != -1){
             System.out.println(currentIndex);
             currentIndex = text.indexOf("o", currentIndex + 1);
         }


    }
}
