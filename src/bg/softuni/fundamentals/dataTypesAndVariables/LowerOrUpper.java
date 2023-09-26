package bg.softuni.fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char lowerOrUpper = input.charAt(0);
        if(Character.isLowerCase(lowerOrUpper)){
            System.out.println("lower-case");
        }else if(Character.isUpperCase(lowerOrUpper)){
            System.out.println("upper-case");
        }





    }
}
