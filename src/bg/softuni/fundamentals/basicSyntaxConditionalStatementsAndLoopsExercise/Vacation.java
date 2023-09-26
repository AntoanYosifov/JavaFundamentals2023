package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String category = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        switch (day) {
            case "Friday":
                switch (category) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (category) {
                    case "Students":
                        price = 9.80;
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (category) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16;
                        break;
                    case "Regular":
                        price = 22.50;
                        break;
                }
                break;
        }

        double totalPrice = numberOfPeople * price;
        if ("Students".equals(category) && numberOfPeople >= 30) {
            totalPrice *= 0.85;
        } else if ("Business".equals(category) && numberOfPeople > 99) {
            totalPrice = totalPrice - (10 * price);

        } else if ("Regular".equals(category) && (10 <= numberOfPeople && numberOfPeople <= 20)) {
            totalPrice *= 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
