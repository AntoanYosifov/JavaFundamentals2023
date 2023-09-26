package bg.softuni.fundamentals.listExerciseHomeWork2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseLineOfNumbers(scanner);
        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] command = input.split(" ");

            if(command.length < 3 && Integer.parseInt(command[1]) < 0){
                System.out.println("Invalid index");
            }else if(command.length == 3 && Integer.parseInt(command[2]) < 0){
                System.out.println("Invalid index");
            }

            else if (("Remove".equals(command[0]) && numbers.isEmpty()) ||
                    ("Remove".equals(command[0]) && Integer.parseInt(command[1]) > numbers.size() - 1) ||
                    ("Insert".equals(command[0]) && numbers.isEmpty() && Integer.parseInt(command[2]) != 0) ||
                    ("Insert".equals(command[0]) && !numbers.isEmpty() && Integer.parseInt(command[2]) > numbers.size() - 1) ||
                    ("Shift".equals(command[0]) && numbers.isEmpty())) {
                System.out.println("Invalid index");
            } else {
                if ("Add".equals(command[0])) {
                    numbers.add(Integer.parseInt(command[1]));
                } else if ("Remove".equals(command[0])) {
                    numbers.remove(Integer.parseInt(command[1]));
                } else if ("Insert".equals(command[0])) {
                    numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));

                } else if ("left".equals(command[1])) {
                    for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                        int firstNumber = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(firstNumber);
                    }
                } else if ("right".equals(command[1])) {
                    for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                        int lastNumber = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, lastNumber);
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
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
