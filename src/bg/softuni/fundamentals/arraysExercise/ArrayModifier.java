package bg.softuni.fundamentals.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String command = input;
            String[] commandArray = command.split(" ");

            int index1 = 0;
            int index2 = 0;
            if ("swap".equals(commandArray[0])) {

                index1 = Integer.parseInt(commandArray[1]);
                index2 = Integer.parseInt(commandArray[2]);
                int oldNumber = elements[index1];

                elements[index1] = elements[index2];
                elements[index2] = oldNumber;

            } else if ("multiply".equals(commandArray[0])) {
                int firstNumberToMultiply = elements[Integer.parseInt(commandArray[1])];
                int secondNumberToMultiply = elements[Integer.parseInt(commandArray[2])];
                int product = firstNumberToMultiply * secondNumberToMultiply;
                elements[Integer.parseInt(commandArray[1])] = product;

            } else {
                for (int i = 0; i < elements.length; i++) {
                    elements[i] -= 1;
                }

            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < elements.length; i++) {
            if (i == elements.length - 1) {
                System.out.print(elements[i]);
            } else {
                System.out.print(elements[i] + ", ");
            }

        }

    }
}
