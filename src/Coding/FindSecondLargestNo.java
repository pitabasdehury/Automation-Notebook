package Coding;

public class FindSecondLargestNo {
    public static void main(String[] args) {
        largestNumber(3, new int[]{34, 23, 76, 56, 90, 51});
    }

    public static void largestNumber(int defineWhichLargestNo, int[] numbers){

        for (int i=0; i< numbers.length; i++){
            for (int j=i+1; j< numbers.length; j++){
                if (numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("The required largest no is : "+numbers[numbers.length-defineWhichLargestNo]);
    }
}
