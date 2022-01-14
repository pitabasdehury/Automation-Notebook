package Coding;

// Swiping numbers without taking 3rd variable

public class SwipeNumber2 {
    public static void main(String[] args) {
        int no1, no2;
        no1 = 10;
        no2 = 20;

        System.out.println("no1 = " + no1);
        System.out.println("no2 = " + no2);

        System.out.println("After swapping...................");

        no1 = no1 + no2;
        no2 = no1-no2;
        no1=no1-no2;

        System.out.println("no1 = " + no1);
        System.out.println("no2 = " + no2);
    }
}
