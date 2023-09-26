package bg.softuni.fundamentals.associativeArraysHomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> typesResourcesQty = new LinkedHashMap<>();
        while (!"stop".equals(input)) {
            String resource = input;
            int qty = Integer.parseInt(scanner.nextLine());

            Integer currentQty = typesResourcesQty.get(resource);
            if(currentQty == null){
                typesResourcesQty.put(resource, qty);
            }else{
                typesResourcesQty.put(resource, currentQty + qty);
            }


            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : typesResourcesQty.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
