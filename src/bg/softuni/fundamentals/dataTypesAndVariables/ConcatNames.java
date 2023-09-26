package bg.softuni.fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firsName = scanner.nextLine();
        String familyName = scanner.nextLine();
        String delimiter = scanner.nextLine();
        System.out.println(firsName + delimiter + familyName);


    }
}
