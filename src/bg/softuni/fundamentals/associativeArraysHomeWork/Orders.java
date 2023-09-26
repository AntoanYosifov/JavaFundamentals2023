package bg.softuni.fundamentals.associativeArraysHomeWork;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<Double>> products = new LinkedHashMap<>();
        while(!"buy".equals(input)){
            String[] productData = input.split(" ");
            String productName = productData[0];
            double price = Double.parseDouble(productData[1]);
            double qty = Double.parseDouble(productData[2]);

           List<Double> priceAndQty = products.get(productName);
           if(priceAndQty == null){
                priceAndQty = new ArrayList<>();
                priceAndQty.add(price);
                priceAndQty.add(qty);
                products.put(productName, priceAndQty);
           }else{
               double currentQty = priceAndQty.get(1);
               priceAndQty.set(0, price);
               priceAndQty.set(1, qty + currentQty);
               products.put(productName, priceAndQty);
           }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : products.entrySet()) {
            System.out.printf("%s -> %.02f\n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
        }


    }
}
