package bg.softuni.fundamentals.arraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasure = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!"Yohoho!".equals(input)) {
            String[] command = input.split(" ");
            if ("Loot".equals(command[0])) {

                for (int i = 1; i < command.length; i++) {
                    boolean alreadyInTreasure = false;
                    for (int j = 0; j < treasure.size(); j++) {
                        if (command[i].equals(treasure.get(j))) {
                            alreadyInTreasure = true;
                        }
                    }
                    while (!alreadyInTreasure) {
                        treasure.add(0, command[i]);
                        alreadyInTreasure = true;
                    }
                }

            } else if ("Drop".equals(command[0])) {
                if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) <= treasure.size() - 1) {
                    String itemToRemove = treasure.get(Integer.parseInt(command[1]));
                    treasure.remove(Integer.parseInt(command[1]));
                    treasure.add(itemToRemove);

                }
            } else {
                if (Integer.parseInt(command[1]) <= treasure.size() - 1) {
                    List<String> removedElements = new ArrayList<>();
                    for (int i = 0; i < Integer.parseInt(command[1]); i++) {
                        removedElements.add(treasure.get(treasure.size() - 1));
                        treasure.remove(treasure.size() - 1);
                    }
                    for (int i = removedElements.size() - 1; i >= 0; i--) {
                        if (i == 0) {
                            System.out.println(removedElements.get(i));
                        } else {
                            System.out.print(removedElements.get(i) + ", ");
                        }
                    }
                } else {
                    List<String> removedElements = new ArrayList<>();
                    for (int i = 0; i < treasure.size(); ) {
                        removedElements.add(treasure.get(treasure.size() - 1));
                        treasure.remove(treasure.size() - 1);
                    }
                    for (int i = removedElements.size() - 1; i >= 0; i--) {
                        if (i == 0) {
                            System.out.println(removedElements.get(i));
                        } else {
                            System.out.print(removedElements.get(i) + ", ");
                        }

                    }
                }
            }
            input = scanner.nextLine();
        }


        if (treasure.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double totalItemsLength = 0;
            for (int i = 0; i < treasure.size(); i++) {
                String item = treasure.get(i);
                totalItemsLength += item.length();
            }
            double averageTreasureGain = totalItemsLength / treasure.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
        }

    }
}