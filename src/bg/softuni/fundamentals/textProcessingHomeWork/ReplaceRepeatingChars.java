package bg.softuni.fundamentals.textProcessingHomeWork;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder textResult = new StringBuilder();
       for(int i = 0; i < text.length(); i++){
           char currentChar = text.charAt(i);
           if(i < text.length() - 1 && currentChar == text.charAt(i + 1)){
               continue;
           }
           textResult.append(currentChar);
       }
        System.out.println(textResult.toString());
    }
}
