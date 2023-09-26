package bg.softuni.fundamentals.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            int j, first;

            first = arr[0];

            for (j = 0; j < arr.length - 1; j++) {

                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = first;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
