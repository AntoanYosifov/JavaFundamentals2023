package bg.softuni.fundamentals.oldMidExamsForPractice;

import java.util.*;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> twinElements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int numberOfMoves = 0;
        // Congrats! You have found matching elements - 1!
        while (!"end".equals(input) && !twinElements.isEmpty()) {

            String[] command = input.split(" ");
            numberOfMoves++;
            int indexOne = Integer.parseInt(command[0]);
            int indexTwo = Integer.parseInt(command[1]);

            if ((indexOne == indexTwo) ||
                    (indexOne < 0 || indexOne > twinElements.size() - 1 || indexTwo < 0 || indexTwo > twinElements.size() - 1)) {
               int middleIndex = (twinElements.size() - 1) / 2;
               String numberOfMovesAsString = "-" + Integer.toString(numberOfMoves) + "a";

                   twinElements.add(middleIndex + 1, numberOfMovesAsString);
                   twinElements.add(middleIndex + 2, numberOfMovesAsString);
                System.out.println("Invalid input! Adding additional elements to the board");


            } else if (twinElements.get(indexOne).equals(twinElements.get(indexTwo))) {

                System.out.printf("Congrats! You have found matching elements - %s!\n", twinElements.get(indexOne));
                List<String> elementsToRemove = new ArrayList<>();
                elementsToRemove.add(twinElements.get(indexOne));
                twinElements.removeAll(elementsToRemove);
                elementsToRemove.remove(0);

            } else{
                System.out.println("Try again!");
            }


            input = scanner.nextLine();
        }
        if(!twinElements.isEmpty()){
            System.out.println("Sorry you lose :(");
            for(String element : twinElements){
                System.out.print(element + " ");

            }
            System.out.println();
        }else{
            System.out.printf("You have won in %d turns!",numberOfMoves);
        }



    }
}
