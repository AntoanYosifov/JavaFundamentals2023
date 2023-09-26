package bg.softuni.fundamentals.objectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfWords = scanner.nextLine().split(" ");
        Random randomGenerator = new Random();
        for(int i = 0; i < arrayOfWords.length; i++){
            int x = randomGenerator.nextInt(arrayOfWords.length);
            int y = randomGenerator.nextInt(arrayOfWords.length);
            String oldWordX = arrayOfWords[x];
           arrayOfWords[x] = arrayOfWords[y];
           arrayOfWords[y] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator() , arrayOfWords));

    }
}
