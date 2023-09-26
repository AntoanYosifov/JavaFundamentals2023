package bg.softuni.fundamentals.listExerciseHomeWork2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseLineOfNumbers(scanner);
        int[] bombNumberAndHisPower = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bombNumberIndex = 0;
        int sum = 0;
        boolean allNumbersChecked = false;
        while (!allNumbersChecked) {

            boolean isBombNumberFound = false;

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == bombNumberAndHisPower[0]) {
                    isBombNumberFound = true;
                    bombNumberIndex = i;
                }
            }
            int numbersInBombRangeStartIndex = bombNumberIndex - bombNumberAndHisPower[1];
            int numbersInBombRangeEndIndex = bombNumberIndex + bombNumberAndHisPower[1];

            if (isBombNumberFound) {
                if (numbersInBombRangeStartIndex >= 0 && numbersInBombRangeEndIndex <= numbers.size() - 1) {
                    for (int i = numbersInBombRangeEndIndex; i >= numbersInBombRangeStartIndex; i--) {
                        numbers.remove(i);
                    }
                } else if (numbersInBombRangeStartIndex >= 0 && numbersInBombRangeEndIndex > numbers.size() - 1) {
                    for (int i = numbers.size() - 1; i >= numbersInBombRangeStartIndex; i--) {
                        numbers.remove(i);
                    }
                } else if (numbersInBombRangeStartIndex < 0 && numbersInBombRangeEndIndex <= numbers.size() - 1) {
                    for (int i = numbersInBombRangeEndIndex; i >= 0; i--) {
                        numbers.remove(i);
                    }
                } else {
                    for (int i = numbers.size() - 1; i >= 0; i--) {
                        numbers.remove(i);
                    }
                }
            }

            if (!numbers.contains(bombNumberAndHisPower[0])) {
                allNumbersChecked = true;
            }
        }

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
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

