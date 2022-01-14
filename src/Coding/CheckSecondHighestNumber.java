package Coding;

public class CheckSecondHighestNumber {
    public static void main(String[] args) {
        int[] numbers = {23,45,36,98,42,55,104};
        int temp;

        for (int i=0; i< numbers.length; i++){
            for (int j=i+1; j< numbers.length; j++){
                if (numbers[i]>numbers[j]){     // comparing 1st no to 2nd no
                    temp = numbers[i];          // swapping no or sorting no using 3rd variable
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Second highest no is : "+numbers[numbers.length-2]);  // printing 2nd highest no
    }
}
