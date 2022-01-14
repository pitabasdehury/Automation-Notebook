package Coding;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        int number = 123456;
        int count = 0;

        while(number>0){
            number = number/10;
            count++;
        }

        System.out.println("The no of digits in the number is : "+count);
    }
}
