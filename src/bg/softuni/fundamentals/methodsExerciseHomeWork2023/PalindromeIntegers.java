package bg.softuni.fundamentals.methodsExerciseHomeWork2023;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        PalindromeNumberChecker(scanner, input);


    }

    private static void PalindromeNumberChecker(Scanner scanner, String input) {
        while (!"END".equals(input)) {
            boolean isPalindrome = true;
            int[] arrayNumber = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
            int[] numberReversed = new int[arrayNumber.length];
            int indexNumberReversed = 0;
            for (int i = arrayNumber.length - 1; i >= 0; i--) {

                numberReversed[indexNumberReversed] = arrayNumber[i];
                indexNumberReversed += 1;
            }
            for(int j = 0; j < arrayNumber.length; j++){
                if(arrayNumber[j] != numberReversed[j]){
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println(isPalindrome);
            input = scanner.nextLine();


        }
    }


}

