package bg.softuni.fundamentals.midExamPreparationTwo;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
       int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
       int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
       int studentCount = Integer.parseInt(scanner.nextLine());
       int totalEfficiencyPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;

       int hoursNeeded = 0;


       while(studentCount > 0){

           hoursNeeded += 1;
           if(hoursNeeded % 4 == 0){
               continue;
           }
           studentCount -= totalEfficiencyPerHour;


       }

        System.out.printf("Time needed: %dh.", hoursNeeded);


    }
}
