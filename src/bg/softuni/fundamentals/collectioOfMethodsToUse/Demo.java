package bg.softuni.fundamentals.collectioOfMethodsToUse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

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
    public static boolean isNumeric(String string) {
        int intValue;



        if(string == null || string.equals("")) {

            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
}
