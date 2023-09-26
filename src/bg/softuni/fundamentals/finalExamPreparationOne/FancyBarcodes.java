package bg.softuni.fundamentals.finalExamPreparationOne;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String regex = "@#+(?<productGroup>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                StringBuilder groupBuilder = new StringBuilder();
                String productGroup = matcher.group("productGroup");
                for (char symbol : productGroup.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        groupBuilder.append(symbol);
                    }
                }
                if (groupBuilder.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + groupBuilder.toString());
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
/*
6
@###Val1d1teM@###
@#ValidIteM@#
##InvaliDiteM##
@InvalidIteM@
@#Invalid_IteM@#
@#ValiditeM@#


 */