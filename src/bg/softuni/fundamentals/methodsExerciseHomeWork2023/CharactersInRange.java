package bg.softuni.fundamentals.methodsExerciseHomeWork2023;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        printingCharactersInAsciiRange(a, b);


    }

    private static void printingCharactersInAsciiRange(char a, char b) {
        int asciiValue = 0;
        if (a > b) {
            for (int i = b + 1; i < a; i++) {
                asciiValue = i;
                char characterToPrint = (char) asciiValue;
                System.out.print(characterToPrint + " ");
            }
        } else {
            for (int i = a + 1; i < b; i++) {
                asciiValue = i;
                char characterToPrint = (char) asciiValue;
                System.out.print(characterToPrint + " ");
            }
        }
    }
}
