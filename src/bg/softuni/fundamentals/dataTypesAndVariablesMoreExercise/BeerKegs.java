package bg.softuni.fundamentals.dataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int n = Integer.parseInt(scanner.nextLine());
      double biggestVolume = 0;
      String biggestModel = "";
      for(int i = 0; i < n; i++){
          String model = scanner.nextLine();
          float r = Float.parseFloat(scanner.nextLine());
          int h = Integer.parseInt(scanner.nextLine());
          double volume = Math.PI * r * r * h;
          if(i == 0){
              biggestVolume = volume;
          }else if(volume > biggestVolume){
              biggestVolume = volume;
              biggestModel = model;
          }

      }


        System.out.println(biggestModel);
    }
}
