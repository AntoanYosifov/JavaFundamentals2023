package bg.softuni.fundamentals.listExerciseHomeWork2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberOfWagonsAndPeopleInThem = parseLineOfNumbers(scanner);
        int maxCapacityOfEachWagon = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            if (Character.isDigit(input.charAt(0))) {

                for (int i = 0; i < numberOfWagonsAndPeopleInThem.size(); i++) {
                    int peopleToEnter = Integer.parseInt(input);
                    int peopleInCurrentWagon = numberOfWagonsAndPeopleInThem.get(i);
                    int totalPeopleToFit = peopleToEnter + peopleInCurrentWagon;

                    if (totalPeopleToFit <= maxCapacityOfEachWagon) {
                        numberOfWagonsAndPeopleInThem.set(i, totalPeopleToFit);
                        break;
                    }
                }
            } else {
                String[] command = input.split(" ");
                if(Integer.parseInt(command[1]) <= maxCapacityOfEachWagon){
                    numberOfWagonsAndPeopleInThem.add(Integer.parseInt(command[1]));
                }

            }

            input = scanner.nextLine();
        }

        for (int i : numberOfWagonsAndPeopleInThem) {
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
