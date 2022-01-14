package Java.ExceptionHandling.Try_Catch;

// Nested try....catch block

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("By which number you want to divide : ");
        int number = sc.nextInt();

        int i3 = 10;
        String a3 = null;
        try {
            try {
                System.out.println(a3.length());
            }
            catch (NullPointerException e) {
                System.out.println("Exception occured and reason is : "+e);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Exception occured and reason is : "+e.getMessage());
        }

    }
}
