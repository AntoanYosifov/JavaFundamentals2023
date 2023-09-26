package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        int orders = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < orders; i++) {
            double currentPrice = 0;
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int Days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            currentPrice = (Days * capsuleCount) * pricePerCapsule;
            totalPrice += currentPrice;
            System.out.printf("The price for the coffee is: $%.2f\n", currentPrice);
        }
        System.out.printf("Total: $%.2f", totalPrice);

    }
}
