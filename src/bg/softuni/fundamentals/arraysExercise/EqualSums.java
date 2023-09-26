package bg.softuni.fundamentals.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (elements.length < 2) {
            System.out.println(0);
        } else {
            boolean indexFound = false;
            int index = 0;
            for (int i = 0; i < elements.length; i++) {
                int leftElementsSum = 0;
                int rightElementsSum = 0;
                for (int j = i + 1; j < elements.length; j++) {
                    rightElementsSum += elements[j];
                }

                for (int j = 0; j < i; j++) {
                    leftElementsSum += elements[j];
                }
                if (leftElementsSum == rightElementsSum) {
                    indexFound = true;
                    index = i;
                    break;
                }
            }
            if (indexFound) {
                System.out.println(index);
            } else {
                System.out.println("no");
            }
        }

    }
}
