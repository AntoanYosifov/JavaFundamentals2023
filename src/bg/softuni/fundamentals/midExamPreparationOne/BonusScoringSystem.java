package bg.softuni.fundamentals.midExamPreparationOne;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        int maxStudentAttended = 0;
        double maxStudentBonus = 0.0;

        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        for (int i = 0; i < countStudents; i++) {
            int currentStudentAttended = Integer.parseInt(scanner.nextLine());

            double currentBonus = (double) currentStudentAttended / countLectures * (5 + additionalBonus);
            if (currentBonus > maxStudentBonus) {
                maxStudentBonus = currentBonus;
                maxStudentAttended = currentStudentAttended;
            }

        }
        System.out.printf("Max Bonus: %d.\n", (int) Math.ceil(maxStudentBonus));
        System.out.printf("The student has attended %d lectures.", maxStudentAttended);


    }
}
