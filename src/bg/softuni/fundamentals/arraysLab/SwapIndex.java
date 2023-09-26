package bg.softuni.fundamentals.arraysLab;

import java.util.Scanner;

public class SwapIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int swapIndex = numbers.length - 1 - i;
            int oldNumberI = numbers[i];
            numbers[i] = numbers[swapIndex];
            numbers[swapIndex] = oldNumberI;

        }
        for(int i = 0; i < numbers.length; i ++){
            System.out.println(numbers[i] + " ");
        }

    }
}
