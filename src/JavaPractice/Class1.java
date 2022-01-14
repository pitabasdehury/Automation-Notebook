package JavaPractice;

import java.util.Scanner;

public class Class1 {
    public static void main(String[]args){
        swap();
        System.out.println();

        math math = new math();
       // math.multiplication();
        math.division();
    }

    public static  void swap(){
        Scanner sc = new Scanner(System.in);
        int no1, no2, no3;

        System.out.print("First no is : ");
        no1 = sc.nextInt();

        System.out.print("Second no is : ");
        no2 = sc.nextInt();

        no3 = no1;
        no1 = no2;
        no2 = no3;
        System.out.println("First no is : "+no1);
        System.out.println("Second no is : "+no2);

    }

}

class  math{
    int no1, no2, result;
    Scanner sc = new Scanner(System.in);

    public void addition(){
        System.out.print("First no is : ");
        no1 = sc.nextInt();

        System.out.print("Second no is : ");
        no2 = sc.nextInt();

        result = no1 + no2;
        System.out.println("Sum is : "+result);

    }
    public  void subtraction(){
        System.out.print("First no is : ");
        no1 = sc.nextInt();

        System.out.print("Second no is : ");
        no2 = sc.nextInt();

        if (no1>no2){
            result = no1 - no2;
        }else {
            result = no2 - no1;
        }
        System.out.print("Subtraction is : "+result);

    }
    public void multiplication(){
        System.out.print("First no is : ");
        no1 = sc.nextInt();

        System.out.print("Second no is : ");
        no2 = sc.nextInt();

        result = no1 * no2;
        System.out.println("Multiplication is : "+result);

    }
    public  void division(){
        System.out.print("First no is : ");
        no1 = sc.nextInt();

        System.out.print("Second no is : ");
        no2 = sc.nextInt();

        if (no1>no2 & no2!=0){
            result = no1 / no2;
        }else if (no2>no1 & no1!=0){
            result = no2 / no1;
        }
        System.out.print("Division is : "+result);

    }
}

