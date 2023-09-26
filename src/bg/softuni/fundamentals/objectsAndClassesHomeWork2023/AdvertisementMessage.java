package bg.softuni.fundamentals.objectsAndClassesHomeWork2023;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfAdvertisements = Integer.parseInt(scanner.nextLine());

        String[] phrases = new String[]{"Excellent product.", "Such a great product.", "I always use that product.",
        "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random randomGenerator = new Random();
        for(int i = 0; i < numberOfAdvertisements; i++){
            int randomPhrase = randomGenerator.nextInt(phrases.length);
            int randomEvent = randomGenerator.nextInt(events.length);
            int randomAuthor = randomGenerator.nextInt(authors.length);
            int randomCity = randomGenerator.nextInt(cities.length);
            System.out.printf("%s %s %s – %s\n", phrases[randomPhrase], events[randomEvent],
                    authors[randomAuthor], cities[randomCity]);
        }


    }
}
