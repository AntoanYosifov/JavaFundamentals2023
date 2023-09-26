package bg.softuni.fundamentals.arraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int number = Integer.parseInt(scanner.nextLine());
        if(0 < number && number <=7 ){
            System.out.println(daysOfWeek[number - 1]);
        }else{
            System.out.println("Invalid day!");
        }



    }
}
