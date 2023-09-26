package bg.softuni.fundamentals.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLength = 0;
        int maxStartIndex = 0;

        int currentLength = 1;
        int currentStartIndex = 0;

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] == elements[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStartIndex = currentStartIndex;
                }

                currentLength = 1;
                currentStartIndex = i;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStartIndex = currentStartIndex;
        }

        for (int i = maxStartIndex; i < maxStartIndex + maxLength; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
