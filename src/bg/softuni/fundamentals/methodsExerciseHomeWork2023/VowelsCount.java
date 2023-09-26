package bg.softuni.fundamentals.methodsExerciseHomeWork2023;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        getVowelsCount(input);

        }

    private static void getVowelsCount(String input) {
        String lowerCaseString = input.toLowerCase();
        int vowelsCount = 0;
        for (int i = 0; i < lowerCaseString.length(); i++) {


            if("a".equals(String.valueOf(lowerCaseString.charAt(i))) || "e".equals(String.valueOf(lowerCaseString.charAt(i))) ||
                    "i".equals(String.valueOf(lowerCaseString.charAt(i))) || "u".equals(String.valueOf(lowerCaseString.charAt(i)))
            || "o".equals(String.valueOf(lowerCaseString.charAt(i))) ){
                vowelsCount += 1;

            }
    }
        System.out.println(vowelsCount);
    }


}


