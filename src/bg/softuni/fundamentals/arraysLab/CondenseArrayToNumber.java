package bg.softuni.fundamentals.arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (nums.length > 1) {
            while (nums.length > 1) {
                int[] condensed = new int[nums.length - 1];
                for (int i = 0; i < nums.length - 1; i++) {
                    condensed[i] = nums[i] + nums[i + 1];

                }
                nums = condensed;
                if (condensed.length == 1) {
                    for (int j : condensed) {
                        System.out.println(j);
                    }
                }
            }
        }else{
            System.out.println(nums[0]);
        }
    }
}
