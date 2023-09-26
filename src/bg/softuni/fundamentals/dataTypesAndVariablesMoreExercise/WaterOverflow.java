package bg.softuni.fundamentals.dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterThankCapacity = 255;
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int litersInTank = 0;

        for (int i = 0; i < numberOfLines; i++) {
            int litersToFill = Integer.parseInt(scanner.nextLine());
            litersInTank += litersToFill;
            if(litersInTank > waterThankCapacity){
                System.out.println("Insufficient capacity!");
                litersInTank -= litersToFill;

            }
        }
        System.out.println(litersInTank);

    }
}
