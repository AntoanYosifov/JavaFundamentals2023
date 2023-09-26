package bg.softuni.fundamentals.methods2020.methodsLab;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* signOfInteger(Integer.parseInt(scanner.nextLine()));*/

          int number = 153;
          number = number / 10;
        System.out.println(number);



    }
    public static void signOfInteger(int number) {
        if(number > 0){
            System.out.printf("The number %d is positive.", number);
        }else if(number < 0){
            System.out.printf("The number %d is negative.", number);
        }else{
            System.out.printf("The number %d is zero.", number);
        }

    }
}
