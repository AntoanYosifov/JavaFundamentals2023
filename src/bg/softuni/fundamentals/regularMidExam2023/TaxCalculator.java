package bg.softuni.fundamentals.regularMidExam2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vehicles = scanner.nextLine().split(">>");
        // Input: family 5 3210>>pickUp 1 1345>>heavyDuty 7 21000>>sports 5 9410>>family 3 9012
        // Input: family 3 7210>>van 4 2345>>heavyDuty 9 31000>>sports 4 7410
        double nationalRevenueAgency = 0.0;
        for(int i = 0; i < vehicles.length;i++){
            double initialTax = 0.0;

            String vehicleInfoAsString = vehicles[i];
            String[] currentCarInfo = vehicleInfoAsString.split(" ");
            String carType = currentCarInfo[0];
            int yearsTaxShouldBePaid = Integer.parseInt(currentCarInfo[1]);
            int kilometersTraveled = Integer.parseInt(currentCarInfo[2]);

            switch (carType){
                case "family" :
                    int increasingRate =  kilometersTraveled / 3000;
                    initialTax = (50.0 - yearsTaxShouldBePaid * 5) +  increasingRate * 12;
                    break;
                case "heavyDuty" :
                    int increasingRateH = kilometersTraveled / 9000;
                    initialTax = (80.0 - yearsTaxShouldBePaid * 8) + increasingRateH * 14;
                    break;
                case "sports" :
                    int increasingRateS = kilometersTraveled / 2000;
                    initialTax = (100.0 - yearsTaxShouldBePaid * 9) + increasingRateS * 18;
                    break;
                default:
                    System.out.println("Invalid car type.");
                    continue;
            }
            System.out.printf("A %s car will pay %.02f euros in taxes.\n",carType, initialTax );
           nationalRevenueAgency += initialTax;




        }
        System.out.printf("The National Revenue Agency will collect %.02f euros in taxes.\n", nationalRevenueAgency);




    }
}
