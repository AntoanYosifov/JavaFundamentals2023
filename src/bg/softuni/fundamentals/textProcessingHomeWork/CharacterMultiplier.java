package bg.softuni.fundamentals.textProcessingHomeWork;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        String one = strings[0];
        String two = strings[1];
        characterMultiplier(one, two);

    }

    private static void characterMultiplier(String one, String two) {

        int totalSum = 0;
        int lastIndex = 0;
        for (int i = 0; i < one.length() && i < two.length(); i++) {

            int chCodeOne = one.charAt(i);
            int chCodeTwo = two.charAt(i);

            totalSum += chCodeOne * chCodeTwo;
            lastIndex = i;
        }
        if(one.length() != two.length()){
            if(one.length() > two.length()){
                for (int i = lastIndex + 1; i < one.length() ; i++) {
                    int chCode = one.charAt(i);
                    totalSum += chCode;
                }
            }else{
                for (int i = lastIndex + 1; i < two.length() ; i++) {
                    int chCode = two.charAt(i);
                    totalSum += chCode;
                }
            }
        }
        System.out.println(totalSum);
    }

}
