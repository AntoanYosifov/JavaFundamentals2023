package bg.softuni.fundamentals.textProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(Character.isDigit(ch)){
                System.out.print(ch);

            }
        }
        System.out.println();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(Character.isLetter(ch)){
                System.out.print(ch);

            }
        }
        System.out.println();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                System.out.print(ch);

            }
        }

    }
}
