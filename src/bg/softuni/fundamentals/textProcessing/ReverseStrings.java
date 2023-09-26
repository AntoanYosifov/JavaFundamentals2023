package bg.softuni.fundamentals.textProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!"end".equals(input)){
            String word = input;
            StringBuilder reversedBuilder = new StringBuilder(word).reverse();
            String reversedWord = reversedBuilder.toString();
            System.out.println(word + " = " + reversedWord);
            input = scanner.nextLine();
        }



    }
}
