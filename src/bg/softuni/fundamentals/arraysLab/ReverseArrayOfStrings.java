package bg.softuni.fundamentals.arraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrAsString = scanner.nextLine();
        String[] array = arrAsString.split(" ");
        for (int i = 0; i < array.length / 2; i++) {
            int swapIndex = array.length - 1 - i;
            String oldSymbol = array[i];
            array[i] = array[swapIndex];
            array[swapIndex] = oldSymbol;
        }
        for (String s : array) {
            System.out.print(s + " ");
        }

    }
}
