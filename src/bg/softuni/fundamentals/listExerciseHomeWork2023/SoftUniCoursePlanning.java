package bg.softuni.fundamentals.listExerciseHomeWork2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> topics = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!"course start".equals(command)) {
            String[] commandParts = command.split(":");
            String commandName = commandParts[0];
            String topic = commandParts[1];
            switch (commandName) {
                case "Add":
                    if (!topics.contains(topic)) {
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    if (!topics.contains(topic)) {
                        topics.add(index, topic);
                    }
                    break;
                case "Remove":
                    if(topics.contains(topic)){
                        int indexTopic = topics.indexOf(topic);
                        String exerciseName = topic + "-Exercise";

                        boolean hasExercise = indexTopic != topics.size() - 1 && topics.get(indexTopic + 1).equals(exerciseName);
                        if (topics.contains(topic)) {
                            topics.remove(topic);
                            if(hasExercise){
                                topics.remove(exerciseName);
                            }
                        }
                    }

                    break;
                case "Swap":
                    String topic2 = commandParts[2];
                    if(topics.contains(topic) && topics.contains(topic2)){
                        int indexFirstTopic = topics.indexOf(topic);
                        int indexSecondTopic = topics.indexOf(topic2);
                        topics.set(indexFirstTopic, topic2);
                        topics.set(indexSecondTopic, topic);
                    }
                    String exFirst = topic + "-Exercise";
                    String exSecond = topic2 + "-Exercise";
                    if(topics.contains(exFirst)){
                        topics.remove(exFirst);
                        topics.add(topics.indexOf(topic) + 1, exFirst);
                    }

                    if(topics.contains(exSecond)){
                        topics.remove(exSecond);
                        topics.add(topics.indexOf(topic2) + 1, exSecond);
                    }

                    break;
                case "Exercise":
                    String exercise = topic + "-Exercise";
                    if (topics.contains(topic)) {
                        int indexOfTopic = topics.indexOf(topic);
                         if(indexOfTopic == topics.size() - 1){
                             topics.add(indexOfTopic + 1, exercise);
                         }else if (!topics.get(indexOfTopic + 1).equals(exercise)){
                             topics.add(indexOfTopic + 1, exercise);
                         }

                    } else {
                        topics.add(topic);
                        topics.add(exercise);
                    }
                    break;
            }


            command = scanner.nextLine();

        }
          int count = 1;
        for (String topic:topics) {
            System.out.println(count + "." + topic);
            count++;
        }


    }
}
