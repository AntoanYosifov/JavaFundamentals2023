package bg.softuni.fundamentals.oldMidExamsForPractice;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPriceNoTaxes = 0;
        double taxes = 0;
        while (!"special".equals(input) && !"regular".equals(input)) {
            double pricesNoTax = Double.parseDouble((input));
            if (pricesNoTax < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            } else if (pricesNoTax == 0) {
                System.out.println("Invalid order");
                input = scanner.nextLine();
                continue;
            }
            totalPriceNoTaxes += pricesNoTax;
            taxes += pricesNoTax * 0.20;


            input = scanner.nextLine();
        }
        double totalPriceWithTaxes = totalPriceNoTaxes + taxes;
        if("special".equals(input)){
            totalPriceWithTaxes *= 0.90;
        }
        if(totalPriceNoTaxes > 0){
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", totalPriceNoTaxes);
            System.out.printf("Taxes: %.2f$\n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPriceWithTaxes);
        }else{
            System.out.println("Invalid order!");
        }


    }
}
