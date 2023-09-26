package bg.softuni.fundamentals.dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOfChars = 0;
        for(int i = 0; i < n; i ++){

            String input = scanner.nextLine();
            char c = input.charAt(0);
            sumOfChars = c + sumOfChars;

        }
        System.out.printf("The sum equals: %d", sumOfChars);


    }
}
