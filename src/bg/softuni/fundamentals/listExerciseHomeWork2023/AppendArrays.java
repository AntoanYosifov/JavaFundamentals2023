package bg.softuni.fundamentals.listExerciseHomeWork2023;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrayStrings = input.split("\\|");
        List<Integer> result = new ArrayList<>();

        for (int i = arrayStrings.length - 1; i >= 0; i--) {
            String[] numbers = arrayStrings[i].trim().split("\\s+");

            for (String number : numbers) {
                if(isNumeric(number)){
                    result.add(Integer.parseInt(number));
                }

            }
        }


        for (int number : result) {
            System.out.print(number + " ");
        }
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
