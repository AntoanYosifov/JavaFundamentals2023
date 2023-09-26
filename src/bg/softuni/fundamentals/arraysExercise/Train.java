package bg.softuni.fundamentals.arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int[] entireTrain = new int[wagons];
        int sum = 0;
        for (int i = 0; i < wagons; i++) {
            int[] peopleInWagons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            entireTrain[i] = peopleInWagons[0];
            sum += peopleInWagons[0];
        }
        for (int j : entireTrain) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
