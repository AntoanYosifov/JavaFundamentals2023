package bg.softuni.fundamentals.regularMidExam2023;

import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int biscuitsPerWorkerPerDay = Integer.parseInt(scanner.nextLine());
       int countWorkers = Integer.parseInt(scanner.nextLine());
       int competingFactoryBiscuits = Integer.parseInt(scanner.nextLine());
       int totalBiscuitsPerDay = biscuitsPerWorkerPerDay * countWorkers;
       int totalBiscuitsPerMonth100 = 20 * totalBiscuitsPerDay;
       double totalBiscuitsPerMonth70 = 0.0 ;
       for(int i = 0; i < 10;i++ ){
           double biscuitsPerMonth70 = Math.floor(( totalBiscuitsPerDay * 1.0) * 0.75);
           totalBiscuitsPerMonth70 += biscuitsPerMonth70;
       }
       int totalBiscuitsPerMonth =(int) (totalBiscuitsPerMonth100 + totalBiscuitsPerMonth70);


        int difference = Math.abs(totalBiscuitsPerMonth - competingFactoryBiscuits);
        System.out.printf("You have produced %d biscuits for the past month.\n", totalBiscuitsPerMonth);
        if(totalBiscuitsPerMonth > competingFactoryBiscuits){
            double differencePercentage = (difference * 1.0 / competingFactoryBiscuits) * 100;
            System.out.printf("You produce %.02f percent more biscuits.", differencePercentage);
        }else{
            double differencePercentage = (difference * 1.0 / competingFactoryBiscuits) * 100;
            System.out.printf("You produce %.02f percent less biscuits.", differencePercentage);
        }


    }
}
