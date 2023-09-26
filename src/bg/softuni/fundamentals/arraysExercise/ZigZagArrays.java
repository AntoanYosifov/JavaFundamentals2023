package bg.softuni.fundamentals.arraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {

            String[] arrayFromString = scanner.nextLine().split(" ");
            if(i == 0){
                array1[i] += Integer.parseInt(arrayFromString[0]);
                array2[i] += Integer.parseInt(arrayFromString[1]);
            }else if(i % 2 == 0){
                array1[i] += Integer.parseInt(arrayFromString[0]);
                array2[i] += Integer.parseInt(arrayFromString[1]);

            }else{
                array2[i] += Integer.parseInt(arrayFromString[0]);
                array1[i] += Integer.parseInt(arrayFromString[1]);
            }

        }
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : array2) {
            System.out.print(i + " ");
        }

    }
}
