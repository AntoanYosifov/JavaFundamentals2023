package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        double totalPriceLightSabers = (countStudents + (Math.ceil(countStudents * 0.10))) * lightSabersPrice;

        double totalPriceRobes = countStudents * robesPrice;
        double totalPriceBelts = 0;
        for(int i = 1; i <= countStudents; i++){
            if(i % 6 == 0){
                continue;
            }else{
                totalPriceBelts += beltsPrice;
            }
        }
        double totalCost = totalPriceBelts + totalPriceLightSabers + totalPriceRobes;
        double diff = Math.abs(amountOfMoney - totalCost);
        if(totalCost <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }


    }
}
