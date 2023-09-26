package bg.softuni.fundamentals.methods2020.methodsLab;


import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());
        double result = calculations(firstNumber, operator, secondNumber);
        if((int)result - result == 0){
            System.out.printf("%.0f", result);
        }else{
            System.out.printf("%.2f", result);
        }


    }

    private static double calculations(int firstNumber, String operator, int secondNumber) {
        double result = 0.0;
        switch(operator){
            case "/":
                if(secondNumber == 0){
                    break;
                }else{
                    result = (double) firstNumber / secondNumber;
                }
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
        }
        return result;
    }
}
