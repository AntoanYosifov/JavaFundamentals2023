package bg.softuni.fundamentals.methodsExerciseHomeWork2023;

import java.util.Arrays;
import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printOutMiddleCharacters(scanner);

    }

    private static void printOutMiddleCharacters(Scanner scanner) {
        String[] arrayOfCharacters = scanner.nextLine().split("");
        if(arrayOfCharacters.length % 2 == 0){
            String middleElement1 = arrayOfCharacters[arrayOfCharacters.length / 2 - 1];
            String middleElement2 = arrayOfCharacters[arrayOfCharacters.length / 2];
            System.out.print(middleElement1);
            System.out.print(middleElement2);



        }else{
            String middleElement = arrayOfCharacters[arrayOfCharacters.length / 2];
            System.out.print(middleElement);
        }
    }
}
