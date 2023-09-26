package bg.softuni.fundamentals.associativeArrays;

import java.sql.SQLOutput;
import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            Integer currentWordOccurrences = counts.get(wordInLowerCase);
            if(currentWordOccurrences == null){
                counts.put(wordInLowerCase, 1);
            }else{
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            }
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if(entry.getValue() % 2 == 1){
                odds.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", odds));

    }
}
