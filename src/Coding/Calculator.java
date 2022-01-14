package Coding;

import java.util.Scanner;

public class Calculator {
   static double a;
   static double b;
   static double result;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.print("Enter any operator (+, -, *, /) : ");
        String ch = sc.next();

        switch (ch){
            case "+": result = a + b;break;
            case "-":if (a>b){
                            result = a - b;
                     } else {
                            result = b - a;
                     }break;
            case "*": result = a * b;break;
            case "/": if (a>b){
                            result = a / b;
                    } else {
                             result = b / a;
                    }break;
            default:
                System.out.println("Incorrect operator");
        }
        System.out.println("Result is : "+result);


    }
}
