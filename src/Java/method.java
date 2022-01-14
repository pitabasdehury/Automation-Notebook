package Java;

import java.util.Scanner;

public class method {

         String evenodd(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your number : ");
           int num = sc.nextInt();
            String num1 = "";

            if (num%2==0){
                return num1 = "Even";
            }else {
                return num1 = "Odd";
            }
        }

}
