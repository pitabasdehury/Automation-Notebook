

public class Demo {
    public static void main(String[] args) {
        int number = 1234;
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number = number/10;
        }
        System.out.println("Sum of the digits in the number is : "+sum);

    }


}
