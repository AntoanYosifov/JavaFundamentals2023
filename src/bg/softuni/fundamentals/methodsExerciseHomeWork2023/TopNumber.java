package bg.softuni.fundamentals.methodsExerciseHomeWork2023;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        TopNumberGenerator(n);

    }

    private static void TopNumberGenerator(int n) {
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int currentNumber = i;
            if (currentNumber < 10) {
                continue;
            }
            int countOddDigits = 0;
            for (int j = 0; j < currentNumber; ) {
                int currentDigit = currentNumber % 10;
                if (currentDigit % 2 != 0) {
                    countOddDigits += 1;
                }
                sumOfDigits += currentDigit;

                currentNumber /= 10;
            }

            currentNumber = i;
            if (sumOfDigits % 8 == 0 && countOddDigits > 0) {
                System.out.println(currentNumber);
            }


        }
    }
}
