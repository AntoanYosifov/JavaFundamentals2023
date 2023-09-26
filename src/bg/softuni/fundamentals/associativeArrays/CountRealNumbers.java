package bg.softuni.fundamentals.associativeArrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numberOccurrences = new TreeMap<>();

        String[] numbersAsString = scanner.nextLine().split(" ");

        for(int i = 0;  i < numbersAsString.length; i++){
            double number = Double.parseDouble(numbersAsString[i]);

            Integer occurrences = numberOccurrences.get(number);
            if(occurrences == null){
                occurrences = 0;
            }
            numberOccurrences.put(number,occurrences + 1);
        }
        for (Map.Entry<Double, Integer> entry : numberOccurrences.entrySet()) {
            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }


    }
}
