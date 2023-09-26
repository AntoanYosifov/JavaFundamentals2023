package bg.softuni.fundamentals.methods2020.methodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());
        String repeated = repeat(s, repetitions);
        System.out.println(repeated);

    }
    public static String repeat(String s, int count){
        String[] repetitons = new String[count];
        for(int i = 0; i < count; i++){
            repetitons[i] = s;
        }
        return String.join("", repetitons);

    }

    public static int[] readArray(Scanner scanner) {

        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
