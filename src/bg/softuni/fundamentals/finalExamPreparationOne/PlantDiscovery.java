package bg.softuni.fundamentals.finalExamPreparationOne;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> rarePlants = new HashMap<>();
        Map<String, Double> plantsRating = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] plantInfo = scanner.nextLine().split("<->");
            String plantName = plantInfo[0];
            int rarity = Integer.parseInt(plantInfo[1]);
            rarePlants.put(plantName, rarity);
            plantsRating.put(plantName, 0.0);
        }

        String input = scanner.nextLine();
        while (!"Exhibition".equals(input)) {
            String[] commands = input.split("[: -]+");
            String command = commands[0];
            String plant = commands[1];
            boolean isValidCommand = command.equals("Rate") || command.equals("Update") || command.equals("Reset");
            if(!rarePlants.containsKey(plant) || !isValidCommand){
                System.out.println("error");
            }
            switch (command){
                case "Rate":
                    double rate = Double.parseDouble(commands[2]);
                    if(plantsRating.get(plant) == 0){
                        plantsRating.put(plant, rate);
                    }else{
                        double newRate = (plantsRating.get(plant) + rate) / 2;
                        plantsRating.put(plant, newRate);
                    }
                    break;
                case "Update":
                    int newRarity = Integer.parseInt(commands[2]);
                    rarePlants.put(plant, newRarity);
                    break;
                case "Reset":
                    plantsRating.put(plant, 0.0);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Integer> entry : rarePlants.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n",entry.getKey(),entry.getValue(), plantsRating.get(entry.getKey()));
        }


    }
}
