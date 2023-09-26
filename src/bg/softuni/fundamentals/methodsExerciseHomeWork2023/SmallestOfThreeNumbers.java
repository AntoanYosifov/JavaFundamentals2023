package bg.softuni.fundamentals.methodsExerciseHomeWork2023;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
       smallestOfThreeNumbers(a, b, c);

    }

    private static void smallestOfThreeNumbers(int a, int b, int c) {
        if (a < b && a < c){
            System.out.println(a);
        }else if(b < a && b < c){
            System.out.println(c);
        }else {
            System.out.println(c);
        }
    }
}
