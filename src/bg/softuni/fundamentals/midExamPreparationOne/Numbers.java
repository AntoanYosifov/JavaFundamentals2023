package bg.softuni.fundamentals.midExamPreparationOne;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double sumOfNumbers = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfNumbers += numbers[i];
        }
        double averageValue = sumOfNumbers / numbers.length;

        List<Integer> numbersGreaterThenAverage = new ArrayList<>();

        for (int number : numbers) {
            if (number > averageValue) {
                numbersGreaterThenAverage.add(number);
            }
        }
        if (numbersGreaterThenAverage.isEmpty()) {
            System.out.println("No");
        } else if (numbersGreaterThenAverage.size() <= 5) {
            Collections.sort(numbersGreaterThenAverage, Collections.reverseOrder());
            for (int element : numbersGreaterThenAverage) {
                System.out.print(element + " ");
            }
        }else {
            Collections.sort(numbersGreaterThenAverage, Collections.reverseOrder());
            for(int i = 0; i < 5; i++){
                System.out.print(numbersGreaterThenAverage.get(i) + " ");
            }
        }


    }
}


