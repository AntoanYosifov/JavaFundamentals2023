package bg.softuni.fundamentals.methodsExerciseHomeWork2023;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int number1 = Integer.parseInt(scanner.nextLine());
         int number2 = Integer.parseInt(scanner.nextLine());

        printOutFactorialDivision(number1, number2);
    }

    private static void printOutFactorialDivision(int number1, int number2) {
        double factorial1 = 1.0;

        for (int i = 1; i <= number1; i++) {
            factorial1 *= i;
        }

        double factorial2 = 1.0;
        for (int i = 1; i <= number2; i++) {
            factorial2 *= i;
        }

            double result = factorial1 / factorial2;
            System.out.printf("%.2f", result);


    }
}
