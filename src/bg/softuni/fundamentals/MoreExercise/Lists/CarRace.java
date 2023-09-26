package bg.softuni.fundamentals.MoreExercise.Lists;

import java.util.Arrays;
import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] raceNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int indexOfMiddleNumber = raceNumbers.length / 2;

        double carLeftTime = 0;
        double carRightTime = 0;
        for (int car1 = 0; car1 < indexOfMiddleNumber; car1++) {
            if(raceNumbers[car1] == 0){
                carLeftTime *= 0.8;
            }
            carLeftTime += raceNumbers[car1];
        }

        for (int car2 = raceNumbers.length - 1; car2 > indexOfMiddleNumber; car2--) {
            if(raceNumbers[car2] == 0){
                carRightTime *= 0.8;
            }
            carRightTime += raceNumbers[car2];
        }
        if(carLeftTime < carRightTime){
            System.out.printf("The winner is left with total time: %.1f\n", carLeftTime);
        }else{
            System.out.printf("The winner is right with total time: %.1f\n" , carRightTime);
        }



    }
}
