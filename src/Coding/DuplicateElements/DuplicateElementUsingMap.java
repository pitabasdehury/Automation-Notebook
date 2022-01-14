package Coding.DuplicateElements;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementUsingMap {
    public static void main(String[] args) {
        duplicateNames("pitabas","jaga","pitabas","raghu","pitabas","raghu","kalia");
        duplicateChar("pitabasa");
        duplicateCharWithFrequency("pitabasa");
    }

    public static void duplicateNames(String ...name){
        Map<String, Integer> nameMap = new HashMap<>();
        for(String str : name){
            Integer count = nameMap.get(str);
            if (count == null){
                nameMap.put(str,1);
            }
            else{
                nameMap.put(str, ++count);
            }
        }

        // printing duplicate element
        Set<Map.Entry<String, Integer>> entrySet = nameMap.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }

    public static void duplicateChar(String name){
        char[] chars = name.toCharArray();
        Map<Character,Integer> nameMap = new HashMap<>();
        for(char character : chars){
            Integer count = nameMap.get(character);
            if (count == null){
                nameMap.put(character,1);
            }
            else{
                nameMap.put(character, ++count);
            }
        }

        // printing duplicate characters
        Set<Map.Entry<Character,Integer>> entrySet =  nameMap.entrySet();
        for(Map.Entry<Character,Integer> entry : entrySet){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }

    public static void duplicateCharWithFrequency(String name) {
        char[] chars = name.toCharArray();

        Map<Character, Integer> nameMap = new LinkedHashMap<>();
        for (char character : chars) {
            Integer count = nameMap.get(character);
            if (count == null) {
                nameMap.put(character, 1);
            } else {
                nameMap.put(character, ++count);
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet = nameMap.entrySet();
        for(Map.Entry<Character,Integer> entry : entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
