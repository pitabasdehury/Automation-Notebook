package JavaPractice;

public class Class5_Practice {

    static void multiplication_table(int n){

        for (int i=1; i<=10; i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);    // System.out.println(n+" * "+i+" = "+n*i);
        }
    }

   static void stars(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static int sum_firstNaturalNo(int n){       // Recursion method
        if (n==1)
            return 1;
        else
            return n + sum_firstNaturalNo(n-1);
    }

    public static void main(String[] args) {
    //    multiplication_table(7);
    //   stars(5);
        System.out.println("Sum of first n natural number : "+sum_firstNaturalNo(5));
    }
}
