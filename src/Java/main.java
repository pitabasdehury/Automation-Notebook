package Java;

import java.util.Scanner;

public class main {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
        int sum(){
            int c = a + b;
            return c;
        }
        int max(){
            if (a>b);
            return a;
        }

        public static void main(String[] args) {
            main math = new main();
            int d = math.sum();
            System.out.println("Sum of the given two numbers is : "+d);

            d = math.max();
            System.out.println("Maximum value is : "+d);

            method ob1 = new method();
            String s1 = ob1.evenodd();
            System.out.println("The entered number is : "+s1);


        }


}
