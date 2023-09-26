package bg.softuni.fundamentals.regularExpressionsHomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String expression = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(expression);
        List<String> furniture = new ArrayList<>();
        double totalPrice = 0;
        while(!"Purchase".equals(input)){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int qty = Integer.parseInt(matcher.group("quantity"));
                furniture.add(furnitureName);
                double currentPrice = price * qty;
                 totalPrice += currentPrice;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);

    }
}
