package bg.softuni.fundamentals.associativeArraysHomeWork;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] inputData = input.split("\\s*->\\s*");
            String company = inputData[0];
            String employeeId = inputData[1];
            List<String> currentId = companyEmployees.get(company);
            if (currentId == null) {
                currentId = new ArrayList<>();
                companyEmployees.put(company, currentId);

            }
            if (!currentId.contains(employeeId)) {
                currentId.add(employeeId);
            }


            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyEmployees.entrySet()) {
            System.out.println(entry.getKey());
            for (String s : entry.getValue()) {
                System.out.println("-- " + s);
            }

        }


    }
}
