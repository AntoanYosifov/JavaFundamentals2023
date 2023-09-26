package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String category = "";
        if(0 <= age && age <= 2){
            category = "baby";
        }else if(3 <= age && age <= 13){
            category = "child";
        }else if(14 <= age && age <= 19){
            category = "teenager";
        }else if(20 <= age && age <= 65){
            category = "adult";
        }else if(age > 65){
            category = "elder";
        }
        System.out.println(category);


    }
}
