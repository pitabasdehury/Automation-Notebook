package Java.Error;

import java.util.Scanner;

public class CheckingError {
    public static void main(String[] args) {

        // Syntax error
        /*

        int a = 3       // ; is not provided
         b = 5;         // datatype is not declared
        System.out.println(a+b);

         */

        // Logical (Bug) error
        /*
        int i;
        for (i=1; i<5; i++){
            System.out.println(2*i+1); // Result will be : 3 5 7 9
                                       // but 9 is not a prime number
                                       // logic failed
        }
         */

        // Runtime error
        /*
        Scanner sc = new Scanner(System.in);
        int a = 78;
        int b = sc.nextInt();       // if value 0 will be given ....then failed
        System.out.println(a/b);

         */
    }
}
