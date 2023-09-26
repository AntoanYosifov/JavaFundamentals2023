package bg.softuni.fundamentals.finalExamPreparationTwo;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        StringBuilder modifiedMessage = new StringBuilder(encryptedMessage);
        String input = scanner.nextLine();
        while (!"Decode".equals(input)) {
             String[] commands = input.split("\\|");
             String command = commands[0];
              switch (command){
                  case "Move":
                      int countLetters = Integer.parseInt(commands[1]);
                      String firstLetters = modifiedMessage.substring(0, countLetters);
                      modifiedMessage.delete(0, countLetters);
                      modifiedMessage.append(firstLetters);
                      break;
                  case "Insert":
                      int index = Integer.parseInt(commands[1]);
                      String value = commands[2];
                      modifiedMessage.insert(index, value);
                      break;
                  case "ChangeAll":
                      String textToReplace = commands[1];
                      String replacement = commands[2];
                      String currentMessage = modifiedMessage.toString();
                      currentMessage = currentMessage.replace(textToReplace, replacement);
                      modifiedMessage = new StringBuilder(currentMessage);
                      break;
              }



            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s\n", modifiedMessage.toString());

    }
}
/*
zzHe
ChangeAll|z|l
Insert|2|o
Move|3
Decode
 */