package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isReceivedStart = false;
        double sum = 0;
        boolean isReceivedEnd = false;
        while (!isReceivedStart) {
            if ("Start".equals(input)) {
                isReceivedStart = true;
                continue;

            }
            double coinsInsert = Double.parseDouble(input);
            if (coinsInsert == 0.1 || coinsInsert == 0.2 || coinsInsert == 0.5 || coinsInsert == 1 || coinsInsert == 2) {
                sum += coinsInsert;
            } else {
                System.out.printf("Cannot accept %.2f\n", coinsInsert);
            }
            input = scanner.nextLine();

        }
// "Nuts" = 2.0, "Water" = 0.7, "Crisps" = 1.5,
//"Soda" = 0.8, "Coke"= 1.0
        double price = 0;
        String secondInput = scanner.nextLine();
        while (!isReceivedEnd) {
            if ("End".equals(secondInput)) {
                isReceivedEnd = true;
                continue;
            }
            String productToPurchase = (secondInput);
            switch (productToPurchase) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            if (price > sum) {
                System.out.println("Sorry, not enough money");

            } else if(price > 0) {
                System.out.printf("Purchased %s\n", productToPurchase);
                sum -= price;
            }
            secondInput = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);

    }
}
