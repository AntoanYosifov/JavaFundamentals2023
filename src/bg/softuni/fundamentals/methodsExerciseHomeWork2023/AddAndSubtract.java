package bg.softuni.fundamentals.methodsExerciseHomeWork2023;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int sum = getSumOfTwoInts(firstNumber, secondNumber);
        System.out.println(subtractSumOfTwoInts(sum, thirdNumber));
    }
    public static int getSumOfTwoInts(int firstNumber, int secondNumber){
        return  firstNumber + secondNumber;
    }
    public static int subtractSumOfTwoInts(int sum, int number){
        return sum - number;
    }
}
