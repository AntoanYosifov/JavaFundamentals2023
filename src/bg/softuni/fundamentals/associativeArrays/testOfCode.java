package bg.softuni.fundamentals.associativeArrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class testOfCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        numbers.add("42.8");
        numbers.add("13.2");
        numbers.add("68");
        double sum = numbers.stream().mapToDouble(Double::parseDouble).sum();
        System.out.println(sum);

        int[] numbersArray = new int[] {42, 13, 68, 111, 256};
        IntStream streamNumbersArray = Arrays.stream(numbersArray);


//      List<String> words = new ArrayList<>();
//      words.add("cat");
//      words.add("dog");
//      words.add("apple");
//      words.add("orange");
//      words.add("budnunthewiser");
//      words.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
//
//        List<String> filtered = words.stream()
//                .filter(w -> w.length() <= 5)
//                .map(w -> w.toUpperCase())
//                .sorted((a, b) -> a.compareTo(b))
//                .toList();
//
//        System.out.println(String.join(" ", filtered));
//        System.out.println(String.join(" ", words));

    }
}
