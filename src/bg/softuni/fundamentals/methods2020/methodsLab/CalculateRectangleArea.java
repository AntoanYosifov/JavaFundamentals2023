package bg.softuni.fundamentals.methods2020.methodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
       double area = getRectAngleArea(width, length);
        System.out.printf("%.0f", area);


    }

    private static double getRectAngleArea(double width, double length) {
        return width * length;
    }
}
