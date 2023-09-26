package bg.softuni.fundamentals.associativeArraysHomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registerSystem = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            String action = inputData[0];
            String userName = inputData[1];
            switch (action) {
                case "register":
                    String licencePlateNumber = inputData[2];
                    String currentNumber = registerSystem.get(userName);
                    if(currentNumber == null){
                        registerSystem.put(userName, licencePlateNumber);
                        System.out.println(userName +" registered "+ licencePlateNumber + " successfully");
                    }else{
                        System.out.println("ERROR: already registered with plate number " + registerSystem.get(userName));
                    }
                    break;
                case "unregister":
                    String currentNumberToUnregister = registerSystem.get(userName);
                    if(currentNumberToUnregister == null){
                        System.out.printf("ERROR: user %s not found\n", userName);
                    }else{
                        registerSystem.remove(userName);
                        System.out.printf("%s unregistered successfully\n", userName);
                    }
                    break;
            }


        }
        for (Map.Entry<String, String> entry : registerSystem.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


    }
}
