package bg.softuni.fundamentals.dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = scanner.nextInt();

        for(int i = start; i <= end; i++){
            char c = (char) i;
            System.out.printf("%s ", c);
        }


    }
}
