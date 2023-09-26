package bg.softuni.fundamentals.midExamPreparationOne;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>  groceries = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while(!"Go Shopping!".equals(input)){
            String command = input;
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            String item = commandParts[1];
            switch (commandName){
                case "Urgent":
                    if(!groceries.contains(item)){
                        groceries.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if(groceries.contains(item)){
                        groceries.remove(item);
                    }
                    break;
                case "Correct":
                    String item2 = commandParts[2];
                    if(groceries.contains(item) && !groceries.contains(item2)){
                        int indexOfOldItem = groceries.indexOf(item);
                        groceries.remove(item);
                        groceries.add(indexOfOldItem, item2);
                    }
                    break;
                case "Rearrange":
                    if(groceries.contains(item)){
                        groceries.remove(item);
                        groceries.add(item);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (String grocery: groceries) {
            if(groceries.indexOf(grocery) == groceries.size() - 1){
                System.out.println(grocery);
            }else{
                System.out.print(grocery + ", ");
            }

        }
    }
}
