package bg.softuni.fundamentals.methods2020.methodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class UsefullMethodsExamples {
    public static int[] readArray(Scanner scanner) {

        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
