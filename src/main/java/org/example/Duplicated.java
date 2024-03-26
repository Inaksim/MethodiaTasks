package org.example;


import java.util.HashMap;

public class Duplicated {
    public static void find(String str) {
        System.out.println("Duplicated: ");
        HashMap<Character, Integer> count = new HashMap<>();

        for(char c : str.toCharArray()) {
            if(count.containsKey(c)) count.put(c, count.get(c) + 1);
            else count.put(c, 1);
        }
        for(char c :count.keySet()) {
            if(count.get(c) > 1) {
                System.out.println(c + ": " + count.get(c));
            }
        }
    }
}
