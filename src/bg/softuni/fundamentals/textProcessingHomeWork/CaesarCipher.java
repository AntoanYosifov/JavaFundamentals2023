package bg.softuni.fundamentals.textProcessingHomeWork;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder encryptedTextBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int codeCurrentChar = text.charAt(i);
            int codeNewChar = codeCurrentChar + 3;
             char encryptionChar = (char) codeNewChar;
             encryptedTextBuilder.append(encryptionChar);
            int x = 1;
        }
      String encryptedText = encryptedTextBuilder.toString();
        System.out.println(encryptedText);

    }
}
