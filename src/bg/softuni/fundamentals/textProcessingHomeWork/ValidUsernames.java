package bg.softuni.fundamentals.textProcessingHomeWork;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNames = scanner.nextLine().split(", ");
        for(String s : userNames){
            boolean isValid = s.matches("[a-zA-Z0-9-_]+");
            if(isValid && s.length() > 2 && s.length() < 17){
                System.out.println(s);
            }

        }


    }
}
