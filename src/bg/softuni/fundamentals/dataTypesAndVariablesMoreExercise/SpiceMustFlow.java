package bg.softuni.fundamentals.dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int daysOperating = 0;
        boolean isNotEnoughSpice = false;
        int spiceLeft = 0;
        int totalSpice = 0;

        while (!isNotEnoughSpice) {
            if(startingYield < 100){
                isNotEnoughSpice = true;
                break;
            }
            daysOperating += 1;
            spiceLeft = startingYield;
            spiceLeft = spiceLeft - 26;

            totalSpice += spiceLeft;
            startingYield -= 10;

        }


        System.out.println(daysOperating);
        if(totalSpice == 0){
            System.out.println(totalSpice);
        }else{
            System.out.println(totalSpice - 26);
        }


    }
}
