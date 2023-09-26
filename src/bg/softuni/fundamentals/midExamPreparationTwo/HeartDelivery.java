package bg.softuni.fundamentals.midExamPreparationTwo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> neighborhoodHouses = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int currentIndex = 0;
        while (!"Love!".equals(input)) {
            String[] command = input.split(" ");
            int lengthJmp = Integer.parseInt(command[1]);

            currentIndex += lengthJmp;
            if (currentIndex > neighborhoodHouses.size() - 1) {
                currentIndex = 0;
            }
            int houseJumpedOn = neighborhoodHouses.get(currentIndex);
            if (houseJumpedOn != 0) {

                int houseHeartsAfterCupid = houseJumpedOn - 2;
                neighborhoodHouses.set(currentIndex, houseHeartsAfterCupid);

                if (neighborhoodHouses.get(currentIndex) == 0) {
                    System.out.printf("Place %d has Valentine's day.\n", neighborhoodHouses.indexOf(houseHeartsAfterCupid));
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.\n", neighborhoodHouses.indexOf(houseJumpedOn));
            }

            input = scanner.nextLine();
        }
        boolean isFailed = false;
        System.out.printf("Cupid's last position was %d.\n", currentIndex);
        int countFailedHouses = 0;
        for (int i = 0; i < neighborhoodHouses.size(); i++) {
            if (neighborhoodHouses.get(i) > 0) {
                isFailed = true;
                countFailedHouses++;
            }
        }
        if (isFailed) {
            System.out.printf("Cupid has failed %d places.", countFailedHouses);
        } else {
            System.out.println("Mission was successful.");
        }

    }
}
