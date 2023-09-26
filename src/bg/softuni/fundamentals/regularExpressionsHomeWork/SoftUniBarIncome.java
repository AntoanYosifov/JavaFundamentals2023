package bg.softuni.fundamentals.regularExpressionsHomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "%(?<Customer>[A-Z][a-z]+)%[^\\|\\$%\\.]*?<(?<product>\\w+)>[^\\|\\$%\\.]*?\\|(?<count>[0-9]+)\\|[^\\|\\$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0.0;
        while (!"end of shift".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String name = matcher.group("Customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double currentPrice = count * price;
                System.out.printf("%s: %s - %.02f\n", name, product, currentPrice);
                totalPrice += currentPrice;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f\n", totalPrice);

    }
}
