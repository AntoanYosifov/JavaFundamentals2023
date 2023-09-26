package bg.softuni.fundamentals.finalExamFundamentals2023;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedString = scanner.nextLine();
        StringBuilder builderEncryptedString = new StringBuilder(encryptedString);
        String input = scanner.nextLine();
        while(!"Finish".equals(input)){
            String[] commands = input.split(" ");
            String action = commands[0];
            switch (action){
                case "Replace":
                    String currentChar = commands[1];
                    String newChar = commands[2];
                    String currentMessage = builderEncryptedString.toString();
                     currentMessage = currentMessage.replace(currentChar, newChar);
                     builderEncryptedString = new StringBuilder(currentMessage);
                    System.out.println(builderEncryptedString.toString());

                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);
                    if((startIndex >= 0 && startIndex < builderEncryptedString.length() - 1) &&
                            (endIndex > 0 && endIndex <= builderEncryptedString.length() - 1)){
                        builderEncryptedString.delete(startIndex, endIndex + 1);
                        System.out.println(builderEncryptedString.toString());

                    }else{
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String upperOrLower = commands[1];
                    if(upperOrLower.equals("Upper")){
                        String upperMessage = builderEncryptedString.toString();
                        upperMessage = upperMessage.toUpperCase();
                        builderEncryptedString = new StringBuilder(upperMessage);
                        System.out.println(builderEncryptedString.toString());
                    }else if(upperOrLower.equals("Lower")){
                        String lowerMessage = builderEncryptedString.toString();
                        lowerMessage = lowerMessage.toLowerCase();
                        builderEncryptedString = new StringBuilder(lowerMessage);
                        System.out.println(builderEncryptedString.toString());
                    }
                    break;
                case "Check":
                    String messageAsString = builderEncryptedString.toString();
                    String stringToCheck = commands[1];
                    boolean isContains = messageAsString.contains(stringToCheck);
                    if(isContains){
                        System.out.println("Message contains " + stringToCheck);
                    }else{
                        System.out.println("Message doesn't contain " + stringToCheck);
                    }
                    break;
                case "Sum":
                    int sum = 0;
                    String messageToSum = builderEncryptedString.toString();
                    int startIndexOfMessageToSum = Integer.parseInt(commands[1]);
                    int endIndexOfMessageToSum = Integer.parseInt(commands[2]);
                    if((startIndexOfMessageToSum >= 0 && startIndexOfMessageToSum < messageToSum.length() - 1) &&
                            (endIndexOfMessageToSum > 0 && endIndexOfMessageToSum <= messageToSum.length() - 1)){
                        for(int i = startIndexOfMessageToSum; i <= endIndexOfMessageToSum; i++ ){
                            char charOfMessage = messageToSum.charAt(i);
                            int assciValue = charOfMessage;
                            sum += assciValue;
                        }
                        System.out.println(sum);
                    }else{
                        System.out.println("Invalid indices!");
                    }

                    break;
            }


            input = scanner.nextLine();
        }

    }
}
