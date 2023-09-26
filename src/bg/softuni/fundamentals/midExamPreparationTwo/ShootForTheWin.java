package bg.softuni.fundamentals.midExamPreparationTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        int countShotTargets = 0;
        while (!"End".equals(command)) {
            int index = Integer.parseInt(command);

            if (index >= 0 && index < targets.size()) {
                if (targets.get(index) != -1) {
                    countShotTargets += 1;

                    int shotTargetValue = targets.get(index);

                    for (int i = 0; i < targets.size(); i++) {
                        if (i == index || targets.get(i) == -1) {
                            continue;
                        }
                        if (targets.get(i) > shotTargetValue) {
                            int currentValue = targets.get(i);
                            int valueToSet = currentValue - shotTargetValue;
                            targets.set(i, valueToSet);
                            continue;
                        }
                        if (targets.get(i) <= shotTargetValue) {
                            int currentValue = targets.get(i);
                            int valueToSet = currentValue + shotTargetValue;
                            targets.set(i, valueToSet);
                        }
                    }
                    targets.set(index, -1);
                }
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < targets.size(); i++) {
            ;
            if (i == 0) {
                System.out.printf("Shot targets: %d -> %d ", countShotTargets, targets.get(i));
            } else {
                System.out.print(targets.get(i) + " ");
            }

        }


    }
}
