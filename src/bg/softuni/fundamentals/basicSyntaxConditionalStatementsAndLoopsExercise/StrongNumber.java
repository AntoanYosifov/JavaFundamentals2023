package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoopsExercise;


import java.util.Scanner;

public class StrongNumber  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            int factorial = 1;

            for (int i = 2; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}