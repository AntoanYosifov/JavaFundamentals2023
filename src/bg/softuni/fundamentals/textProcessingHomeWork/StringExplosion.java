package bg.softuni.fundamentals.textProcessingHomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);
        int totalPower = 0;
        for(int i = 0; i < textBuilder.length(); i++){
            char currentChar = textBuilder.charAt(i);
            if(currentChar == '>'){
                int explosionPower = Integer.parseInt(String.valueOf(textBuilder.charAt(i + 1)));
                totalPower += explosionPower;
            }else if(currentChar != '>' && totalPower > 0){
                textBuilder.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }
        System.out.println(textBuilder.toString());



    }
}
