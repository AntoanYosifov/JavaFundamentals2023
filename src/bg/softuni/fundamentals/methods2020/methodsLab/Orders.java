package bg.softuni.fundamentals.methods2020.methodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = Integer.parseInt(scanner.nextLine());
        totalPrice(product, qty);

    }

    private static void totalPrice(String product, int qty) {
        double price = 0;
        switch (product){
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            default:
                price = 2.00;
                break;
        }
        System.out.printf("%.2f", (qty * price));
    }
}
