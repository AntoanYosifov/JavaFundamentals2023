package bg.softuni.fundamentals.methods2020.methodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputType = scanner.nextLine();
        if("int".equals(inputType)){
            int value1 = Integer.parseInt(scanner.nextLine());
            int value2 = Integer.parseInt(scanner.nextLine());
            int result = getMax(value1, value2);
            System.out.println(result);
        }else if("char".equals(inputType)){
            char value1 = scanner.next().charAt(0);
            char value2 = scanner.next().charAt(0);
            char result = getMax(value1, value2);
            System.out.println(result);
        }else if("string".equals(inputType)){
            String value1 = scanner.nextLine();
            String value2 = scanner.nextLine();
            String result = getMax(value1, value2);
            System.out.println(result);
        }else{
            System.out.println("Invalid input");
        }



    }
public static int getMax(int firstNum, int secondNum){
        if(firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
}
public static char getMax(char firstChar, char secondChar){
        if(Character.compare(firstChar, secondChar) > 0){
            return firstChar;
        }
        return secondChar;
}
public static String getMax(String value1, String value2){
        if(value1.compareTo(value2) > 0){
            return value1;
        }
        return value2;
}
}
