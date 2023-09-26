package bg.softuni.fundamentals.regularExpresionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testOfCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           String expression = "\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
           String dateStrings = scanner.nextLine();
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(dateStrings);
        while (matcher.find()){
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s\n", day,month,year);
        }

    }
}
