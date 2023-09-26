package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        int count = 0;
        int sumOddNumbers = 0;


        while (count < n) {
            if (number % 2 != 0) {
                System.out.println(number);
                sumOddNumbers += number;

                count++;

            }
            number++;
            if (count == n) {
                System.out.printf("Sum: %d", sumOddNumbers);

            }
        }


    }
}
