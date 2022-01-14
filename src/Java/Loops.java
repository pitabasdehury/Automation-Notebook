package Java;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        WhileLoop.sumFirstNaturalNo();
    }
}

 /*class ForLoop {
     public static void sumFirstNaturalNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("you have entered number :");
        int number = sc.nextInt();
        int sum = 0;
        System.out.print("First " +number+ " natural numbers are : ");

        for (int i = 0; i<number; i++){
            sum += i;
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("Sum of first " +number+ " numbers is : "+sum);
    }
}

  */
/* class DoWhileLoop {
    public static void sumFirstNaturalNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("you have entered number :");
        int number = sc.nextInt();
        int sum = 0;
        int i = 0;
        System.out.print("First " +number+ " natural numbers are : ");
        do {
            System.out.print(i+",");
            sum += i;
            i++;
        }while (i<number);
        System.out.println();
        System.out.println("Sum of first " +number+ " numbers is : "+sum);

    }
}

 */
class WhileLoop {
    public static void sumFirstNaturalNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("you have entered number :");
        int number = sc.nextInt();
        int sum = 0;
        int i = 0;
        System.out.print("First " +number+ " natural numbers are : ");
        while (i<number){
            System.out.print(i+",");
            sum += i;
            i++;
        }
        System.out.println();
        System.out.println("Sum of first " +number+ " numbers is : "+sum);

    }
}
