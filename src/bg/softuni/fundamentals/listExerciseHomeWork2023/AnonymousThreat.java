package bg.softuni.fundamentals.listExerciseHomeWork2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputOfStrings = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        String commandInput = scanner.nextLine();

        while (!"3:1".equals(commandInput)) {
            String[] command = commandInput.split(" ");

            if ("merge".equals(command[0])) {
                StringBuilder elementsToMerge = new StringBuilder();
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                if (startIndex < 0 || startIndex > inputOfStrings.size() - 1) {
                    startIndex = 0;
                }
                if (endIndex < 0 || endIndex > inputOfStrings.size() - 1) {
                    endIndex = inputOfStrings.size() - 1;
                }
                for (int i = startIndex; i <= endIndex; i++) {
                    String element = inputOfStrings.get(i);
                    elementsToMerge.append(element);
                } // Merging the elements

                String mergedElements = elementsToMerge.toString();
                inputOfStrings.set(startIndex, mergedElements); // setting the elements on the starting index

                for (int i = endIndex; i >= startIndex + 1; i--) {
                    inputOfStrings.remove(i);
                } // removing the already merged elements


                System.out.println();
            } else if ("divide".equals(command[0])) {
                String someString = inputOfStrings.get(Integer.parseInt(command[1]));

                int numPartitions = Integer.parseInt(command[2]);


                int partitionSize = someString.length() / numPartitions;


                int startIndex = 0;
                int indexToAddPartition = Integer.parseInt(command[1]);
                for (int i = 0; i < numPartitions; i++) {
                    int endIndex = startIndex + partitionSize;
                    if (i == numPartitions - 1) {
                        endIndex = someString.length();
                    }
                    String partitionToAdd = someString.substring(startIndex, endIndex);

                    inputOfStrings.add(indexToAddPartition, partitionToAdd);
                    startIndex = endIndex;
                    indexToAddPartition++;
                }
                inputOfStrings.remove(Integer.parseInt(command[1]) + Integer.parseInt(command[2]));

            }


            commandInput = scanner.nextLine();
        }
        for (String element : inputOfStrings) {
            System.out.print(element + " ");
        }

    }
}
