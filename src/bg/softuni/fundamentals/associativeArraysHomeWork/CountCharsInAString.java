package bg.softuni.fundamentals.associativeArraysHomeWork;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> charsInput = input.chars().
                filter(ch -> !Character.isWhitespace(ch))
                .mapToObj(ch -> (char) ch).collect(Collectors.toList());

        Map<Character, Integer> charOccurrences = new LinkedHashMap<>();

        for (Character character : charsInput) {
            char currentCharacter = character;
            Integer currentCharOccurrences = charOccurrences.get(currentCharacter);
            if(currentCharOccurrences == null){
                charOccurrences.put(currentCharacter, 1);
            }else{
                charOccurrences.put(currentCharacter, currentCharOccurrences + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
