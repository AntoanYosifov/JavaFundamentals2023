package bg.softuni.fundamentals.regularMidExam2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> priceRatings = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        // Input: -2, 2, 1, 5, 9, 3, 2, -2, 1, -1, -3, 3
        //         7
        //         expensive
        // Input: 1, 5, 1
        //        1
        //        cheap
        // Input: 5, 10, 12, 5, 4, 20
        //        3
        //        cheap
        int entryPointIndex = Integer.parseInt(scanner.nextLine());
        String typeOfItems = scanner.nextLine();
        int leftSum = 0;
        int rightSum = 0;
        for (int i = entryPointIndex; i >= 0; i--) {
            leftSum = getLeftSum(priceRatings, entryPointIndex, typeOfItems, leftSum, i);

        }
        for (int i = entryPointIndex; i < priceRatings.size(); i++) {
            rightSum = getLeftSum(priceRatings, entryPointIndex, typeOfItems, rightSum, i);

        }
        if (leftSum >= rightSum) {
            System.out.printf("Left - %d", leftSum);
        } else {
            System.out.printf("Right - %d", rightSum);
        }


    }

    private static int getLeftSum(List<Integer> priceRatings, int entryPointIndex, String typeOfItems, int leftSum, int i) {
        int entryPointItemPriceL = priceRatings.get(entryPointIndex);
        if (i == entryPointIndex) {
            return leftSum;
        }
        if ("cheap".equals(typeOfItems)) {
            if (priceRatings.get(i) < entryPointItemPriceL) {
                leftSum += priceRatings.get(i);
            }
        } else if ("expensive".equals(typeOfItems)) {
            if (priceRatings.get(i) >= entryPointItemPriceL) {
                leftSum += priceRatings.get(i);
            }
        }
        return leftSum;
    }
}
