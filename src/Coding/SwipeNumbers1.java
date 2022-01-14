package Coding;

// swiping numbers using 3rd variable

public class SwipeNumbers1 {
    public static void main(String[] args){
        int no1, no2, no3;
        no1=6;
        no2=9;

        System.out.println("no1 = "+no1);
        System.out.println("no2 = "+no2);

        System.out.println("After swapping...................");

        no3=no1;
        no1=no2;
        no2=no3;

        System.out.println("no1 = "+no1);
        System.out.println("no2 = "+no2);
    }
}
