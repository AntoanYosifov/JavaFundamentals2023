package bg.softuni.fundamentals.listExerciseHomeWork2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = parseLineOfNumbers(scanner);
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] command = input.split(" ");
            if (command.length < 3) {
                int valueOfElementsToRemove = Integer.parseInt(command[1]);
                listOfNumbers.removeAll(List.of(valueOfElementsToRemove));
            } else {
                listOfNumbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            input = scanner.nextLine();
        }
        for(int i : listOfNumbers){
            System.out.print(i + " ");
        }
    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();

        String[] numberAsStrings = line.split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (String s : numberAsStrings) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }
}
