package Coding.DuplicateElements;

public class DuplicateElementUsingForLoop {
    public static void main(String[] args) {
        duplicateChar("pitabas");
        duplicateNames("pitabas", "jaga","manoj","jaga", "manoj","jaga");
        duplicateChar("10001777");
    }

    public static void duplicateChar(String name){
        char[] chars = name.toCharArray();  // convert string to char[]
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[i]);
                    break;
                }
            }
        }
    }

    public static void duplicateNames(String ...name){
        for (int i = 0; i < name.length; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (name[i] == name[j]) {
                    System.out.println(name[i]);
                    break;
                }
            }
        }
    }
}
