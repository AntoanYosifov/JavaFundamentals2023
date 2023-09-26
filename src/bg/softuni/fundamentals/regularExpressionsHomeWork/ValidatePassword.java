package bg.softuni.fundamentals.regularExpressionsHomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String passwordInput = scanner.nextLine();

            Matcher matcher = pattern.matcher(passwordInput);
            if(matcher.find()){
                String validPassword = matcher.group("password");
                StringBuilder sbCategory = new StringBuilder();
                for(char symbol : validPassword.toCharArray()){
                    if(Character.isDigit(symbol)){
                        sbCategory.append(symbol);
                    }
                }
                if(sbCategory.length() == 0){
                    System.out.println("Group: default");
                }else{
                    String numbersOfGroup = sbCategory.toString();
                    System.out.println("Group: " + numbersOfGroup);
                }
            }else{
                System.out.println("Invalid pass!");
            }
        }


    }
}
