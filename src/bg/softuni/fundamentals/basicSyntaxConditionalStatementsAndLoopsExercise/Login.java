package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pwd = scanner.nextLine();
        StringBuilder reversedPassword = new StringBuilder();
        reversedPassword.append(pwd);
        reversedPassword.reverse();
        int counter = 0;
        boolean correctPassword = false;
        while (counter < 4 && !correctPassword) {
            String enterPwd = scanner.nextLine();
            counter += 1;
            if (enterPwd.contentEquals(reversedPassword)) {
                correctPassword = true;
                System.out.printf("User %s logged in.", pwd);
                break;
            } else if (counter < 4) {
                System.out.println("Incorrect password. Try again.");
            }
            if(counter == 4){
                System.out.printf("User %s blocked!", pwd);
            }
        }


    }
}
