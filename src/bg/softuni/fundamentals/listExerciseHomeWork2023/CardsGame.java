package bg.softuni.fundamentals.listExerciseHomeWork2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHandOfCards = parseLineOfNumbers(scanner);
        List<Integer> secondHandOfCards = parseLineOfNumbers(scanner);
       String winner = "";
       int sumOfWinner = 0;
        for(int i = 0; i < firstHandOfCards.size() && i < secondHandOfCards.size(); i++) {
            int winingPlayersCard = 0;
            int losingPlayerCard = 0;

            if(firstHandOfCards.get(i) > secondHandOfCards.get(i)) {
                 winingPlayersCard = firstHandOfCards.get(i);
                 losingPlayerCard = secondHandOfCards.get(i);
                firstHandOfCards.remove(i);
                firstHandOfCards.add(winingPlayersCard);
                firstHandOfCards.add(losingPlayerCard);
                secondHandOfCards.remove(i);
            }else if(secondHandOfCards.get(i) > firstHandOfCards.get(i)) {
                winingPlayersCard = secondHandOfCards.get(i);
                losingPlayerCard = firstHandOfCards.get(i);
                secondHandOfCards.remove(i);
                secondHandOfCards.add(winingPlayersCard);
                secondHandOfCards.add(losingPlayerCard);
                firstHandOfCards.remove(i);
            }else {
                firstHandOfCards.remove(i);
                secondHandOfCards.remove(i);
            }
            i--;
        }
        if(firstHandOfCards.isEmpty()){
            winner = "Second player";
            for(int hand : secondHandOfCards){
                sumOfWinner += hand;
            }
        }else{
            winner = "First player";
            for(int hand : firstHandOfCards){
                sumOfWinner += hand;
            }
        }
        System.out.printf("%s wins! Sum: %d", winner, sumOfWinner);
    }
    private static List<Integer> parseLineOfNumbers(Scanner scanner) {


        String[] numberAsStrings = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (String s : numberAsStrings) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }
}
