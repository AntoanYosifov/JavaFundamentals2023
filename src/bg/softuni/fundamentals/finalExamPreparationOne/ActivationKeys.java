package bg.softuni.fundamentals.finalExamPreparationOne;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String input = scanner.nextLine();
        while(!"Generate".equals(input)){
              String[] commands = input.split(">>>");
              String command = commands[0];
              String substring = "";
              int startIndex = -1;
              int endIndex = -1;
              switch (command){
                  case "Contains":
                      substring = commands[1];
                      if(activationKey.contains(substring)){
                          System.out.println(activationKey + " contains "+ substring);
                      }else{
                          System.out.println("Substring not found!");
                      }
                      break;
                  case "Flip":
                      String upperOrLower = commands[1];
                      startIndex = Integer.parseInt(commands[2]);
                      endIndex = Integer.parseInt(commands[3]);
                      substring = activationKey.substring(startIndex, endIndex);
                      if(upperOrLower.equals("Upper")){
                          //abcdefghijklmnopqrstuvwxyz
                          activationKey = activationKey.replace(substring,substring.toUpperCase());
                          System.out.println(activationKey);
                      }else{
                          activationKey = activationKey.replace(substring, substring.toLowerCase());
                          System.out.println(activationKey);
                      }
                      break;

                  case "Slice":
                      startIndex = Integer.parseInt(commands[1]);
                      endIndex = Integer.parseInt((commands[2]));
                      substring = activationKey.substring(startIndex,endIndex);
                      activationKey = activationKey.replace(substring, "");
                      System.out.println(activationKey);
                      break;
              }


            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s\n", activationKey);

    }
}
/*
abcdefghijklmnopqrstuvwxyz
Slice>>>2>>>6
Flip>>>Upper>>>3>>>14
Flip>>>Lower>>>5>>>7
Contains>>>def
Contains>>>deF
Generate
 */