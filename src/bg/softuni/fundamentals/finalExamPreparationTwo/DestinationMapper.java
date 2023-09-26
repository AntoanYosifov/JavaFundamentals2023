package bg.softuni.fundamentals.finalExamPreparationTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destinationsInput = scanner.nextLine();
        String regex = "([=\\/])(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(destinationsInput);

        List<String> destinationsList = new ArrayList<>();
        while (matcher.find()) {
            String destination = matcher.group("destination");
            destinationsList.add(destination);

        }
        System.out.println("Destinations: " + String.join(", ", destinationsList));
        int travelPoints = 0;
        for (String destination : destinationsList) {
            travelPoints += destination.length();
        }


        System.out.println("Travel Points: " + travelPoints);






        /*
        =Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i=
         */


    }
}
