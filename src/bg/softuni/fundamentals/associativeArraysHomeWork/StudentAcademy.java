package bg.softuni.fundamentals.associativeArraysHomeWork;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentInfo = new LinkedHashMap<>();

        for(int i = 0; i < n; i++){
            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());
            List<Double> currentGrade = studentInfo.get(studentName);
            if(currentGrade == null){
                currentGrade = new ArrayList<>();
                studentInfo.put(studentName, currentGrade);
            }
            currentGrade.add(studentGrade);
        }
        Map<String, Double> studentInfoFilteredAverageGrade = studentInfo.entrySet().stream()
                .filter(entry ->{
                    double averageGrade = entry.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .orElse(0.0);
                    return averageGrade >= 4.50;
                })
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(0.0),
                        (a, b) -> a, LinkedHashMap::new));





        for (Map.Entry<String, Double> entry : studentInfoFilteredAverageGrade.entrySet()) {
            System.out.printf("%s -> %.02f\n", entry.getKey(), entry.getValue());
        }


    }
}
