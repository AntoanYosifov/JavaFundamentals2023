package bg.softuni.fundamentals.methods2020.methodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int n = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvenAndOdds(n));


    }
    public static int getMultipleOfEvenAndOdds(int number){
        int evenSum = getSumEvenDigits(number);
        int oddSum = getSumOddDigits(number);
        return evenSum * oddSum;
    }
    public static int getSumEvenDigits(int number){
        int sumOfEvenDigits = 0;
        while(number > 0){
            int digit = number % 10;
            if(digit % 2 == 0){
                sumOfEvenDigits += digit;
            }
            number = number / 10;
        }

        return sumOfEvenDigits;
    }
    public static int getSumOddDigits(int number){
        int sumOfOddDigits = 0;
        while(number > 0){
            int digit = number % 10;
            if(digit % 2 != 0){
                sumOfOddDigits += digit;
            }
            number = number / 10;
        }

        return sumOfOddDigits;
    }
}
