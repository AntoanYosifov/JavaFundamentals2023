package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double totalRageExpenses = 0;
        int keyboardBreaks = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                totalRageExpenses += headSetPrice;
            }
            if (i % 3 == 0) {
                totalRageExpenses += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                totalRageExpenses += keyboardPrice;
                keyboardBreaks += 1;
            }
            if(keyboardBreaks > 0 && keyboardBreaks % 2 == 0){
                totalRageExpenses += displayPrice;
             keyboardBreaks = 0;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", totalRageExpenses);

    }
}
