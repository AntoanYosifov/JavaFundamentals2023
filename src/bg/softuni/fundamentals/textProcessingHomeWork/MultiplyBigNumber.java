package bg.softuni.fundamentals.textProcessingHomeWork;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.nextLine();;
        int number2 = Integer.parseInt(scanner.nextLine());;

        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = number1.length() - 1; i >= 0; i--) {
            int digit = number1.charAt(i) - '0';
            int product = digit * number2 + carry;
            result.insert(0, product % 10);
            carry = product / 10;
        }

        if (carry != 0) {
            result.insert(0, carry);
        }

        System.out.println(result.toString());


    }
}
