package bg.softuni.fundamentals.arraysLab;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringToArray = input.split(" ");
        int[] numbers = new int[stringToArray.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stringToArray[i]);
        }
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                evenSum += numbers[i];
            }else{
                oddSum += numbers[i];
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
