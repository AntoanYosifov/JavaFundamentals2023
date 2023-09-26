package bg.softuni.fundamentals.methods2020.methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(numberOnPower(number, power)));





    }
    public static double numberOnPower(double number, int power){
        double result = 1;
        for(int i = 0; i < power; i++){
            result = result * number;
        }
        return result;
    }
}
