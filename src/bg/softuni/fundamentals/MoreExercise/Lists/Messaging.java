package bg.softuni.fundamentals.MoreExercise.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String singleString = scanner.nextLine();
        StringBuilder stringInProcess = new StringBuilder(singleString);
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            int sumDigits = 0;

            String numberAsString = Integer.toString(numbers.get(i));
            for (int j = 0; j < numberAsString.length(); j++) {
                sumDigits += Integer.parseInt(String.valueOf(numberAsString.charAt(j)));
            }
            int stringLength = stringInProcess.length();
            if(sumDigits > stringLength - 1){
                sumDigits -= stringLength;
            }
            char takenChar = stringInProcess.charAt(sumDigits);
            message.append(takenChar);
            stringInProcess.deleteCharAt(sumDigits);


        }
         String messageAsString = message.toString();
        String leftCharacters = stringInProcess.toString();
        System.out.println(messageAsString);


    }
}
