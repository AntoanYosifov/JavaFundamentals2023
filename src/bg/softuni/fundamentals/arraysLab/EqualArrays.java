package bg.softuni.fundamentals.arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfNumbers1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrayOfNumbers2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int index = -1;
        for (int i = 0; i < arrayOfNumbers1.length; i++) {
            if (arrayOfNumbers1[i] == arrayOfNumbers2[i]) {
                sum += arrayOfNumbers1[i];
            } else {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
