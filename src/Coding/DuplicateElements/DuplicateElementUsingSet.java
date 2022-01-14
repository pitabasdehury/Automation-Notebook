package Coding.DuplicateElements;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElementUsingSet {
    public static void main(String[] args) {
        duplicateChars("pitabaspitabas");
        duplicateNames("pitabas", "raja", "jaga", "raja", "rohit", "raja","pitabas");
    }

    public static void duplicateChars(String name){
        char[] chars = name.toCharArray();
        Set<Character> names = new LinkedHashSet<>();
        for(char str : chars){
            if(names.add(str) == false){
                System.out.println(str);
            }
        }
    }

    public static void duplicateNames(String ...name){
        Set<String> names = new LinkedHashSet<>();
        for(String str : name){
            if(names.add(str) == false){
                System.out.println(str);
            }
        }
    }
}
