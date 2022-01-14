package Coding;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String [] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = number.nextInt();

        if (num==1 || num==0 || num<1) {
            System.out.println("You have entered wrong number.");
        }
        else if (num>1){
            int count=0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count==2){
                System.out.println(num+" is a prime number.");
            }
            else {
                System.out.println(num+" is not a prime number.");
            }
        }
    }
}
