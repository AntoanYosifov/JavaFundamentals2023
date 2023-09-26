package bg.softuni.fundamentals.listExerciseHomeWork2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < numberOfCommands; i++) {

            String[] command = scanner.nextLine().split(" ");

            if (command.length < 4) {
                if (!guests.contains(command[0])) {
                    guests.add(command[0]);
                } else {
                    System.out.println(command[0] + " is already in the list!");
                }
            } else {
                if (!guests.contains(command[0])) {
                    System.out.println(command[0] + " is not in the list!");

                } else {
                    guests.remove(String.valueOf(command[0]));
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest);

        }
    }
}
