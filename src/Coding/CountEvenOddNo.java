package Coding;

public class CountEvenOddNo {
    public static void main(String[] args) {

        int number = 1234567;
        int even = 0;
        int odd = 0;

        while (number>0){
            int remainder  = number%10;

            if (remainder%2==0){
                ++even;
            }
            else{
                ++odd;
            }

            number = number/10;
        }

        System.out.println("No of even nos are : "+even);
        System.out.println("No of odd nos are : "+odd);



    }

}
