package bg.softuni.fundamentals.finalExamFundamentals2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int n = Integer.parseInt(scanner.nextLine());
       String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<someString>[A-Za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(regex);
      for(int i = 0; i < n; i++){
          String input = scanner.nextLine();
          Matcher matcher = pattern.matcher(input);
          if(matcher.find()){
                String validString = matcher.group("someString");
                String command = matcher.group("command");
              List<String> translatedString = new ArrayList<>();
              for(char symbol : validString.toCharArray()){
                  int value = symbol;
                  translatedString.add(String.valueOf(value));
              }
              // Send: 73 118 97 110 105 115 72 101 114 101
              System.out.println(command + ": " + String.join(" ", translatedString));
          }else{
              System.out.println("The message is invalid");
          }

      }


    }
}
