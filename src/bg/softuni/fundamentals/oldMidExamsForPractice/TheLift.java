package bg.softuni.fundamentals.oldMidExamsForPractice;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleForLift = Integer.parseInt(scanner.nextLine());
        int[] liftState = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < liftState.length; i++) {
            int wagonState = liftState[i];
            while (wagonState < 4 && peopleForLift > 0) {
                peopleForLift -= 1;
                wagonState += 1;
            }
            liftState[i] = wagonState;
        }
        boolean hasEmpty = false;
        for(int wagon : liftState){
            if(wagon < 4){
                hasEmpty = true;
            }
        }
        if(!hasEmpty && peopleForLift == 0){
            for(int liftWagon : liftState){
                System.out.print(liftWagon + " ");
            }
        }else if(hasEmpty && peopleForLift == 0){
            System.out.println("The lift has empty spots!");
            for(int liftWagon : liftState){
                System.out.print(liftWagon + " ");
            }
        }else{
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleForLift);
            for(int liftWagon : liftState){
                System.out.print(liftWagon + " ");
            }
        }

    }
}
