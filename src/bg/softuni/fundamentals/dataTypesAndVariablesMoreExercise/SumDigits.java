package bg.softuni.fundamentals.dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();

        int sumNumDigits = 0;

        for (int i = 0; i < numberAsString.length(); i++){
            char numToChar = numberAsString.charAt(i);
            int num = Character.getNumericValue(numToChar);
            sumNumDigits += num;

        }




            System.out.println(sumNumDigits);

        }


    }


