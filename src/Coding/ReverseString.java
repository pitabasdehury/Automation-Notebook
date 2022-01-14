package Coding;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("pitabas");
    }

    public static void reverseString(String name){
        System.out.println("Name before reverse : "+name);
        String newName = "";
        for (int i=name.length()-1; i>=0; i--){
            newName += name.charAt(i);
        }
        System.out.println("Name after reverse : "+newName);
    }
}
