package bg.softuni.fundamentals.methodsExerciseHomeWork2023;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwordInput = scanner.nextLine();
        boolean isPasswordCorrect = true;
    if(!validationLengthOfPasswordCharacters(passwordInput)){
        System.out.println("Password must be between 6 and 10 characters");
        isPasswordCorrect = false;
    }

    if(!validationOfLettersAndDigitsOfPasswordCharacters(passwordInput)){
        System.out.println("Password must consist only of letters and digits");
        isPasswordCorrect = false;
    }

    if(!validationOfDigitCountOfPasswordCharacters(passwordInput)){
        System.out.println("Password must have at least 2 digits");
        isPasswordCorrect = false;
    }
    if(isPasswordCorrect){
        System.out.println("Password is valid");
    }

    }

    private static boolean validationOfLettersAndDigitsOfPasswordCharacters(String passwordInput) {
        boolean isOnlyLettersAndDigits = passwordInput.matches("[a-zA-Z0-9]+");
        if(!isOnlyLettersAndDigits){
            return false;
        }
        return true;
    }

    private static boolean validationOfDigitCountOfPasswordCharacters(String passwordInput) {
        int digitCount = 0;
        for (char c : passwordInput.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if(digitCount < 2){

            return false;
        }
        return true;
    }

    private static boolean validationLengthOfPasswordCharacters(String passwordInput) {

        if (passwordInput.length() < 6 || passwordInput.length() > 10) {

            return false;
        }
            return true;

    }
}
