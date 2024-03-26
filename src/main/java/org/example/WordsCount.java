package org.example;

import java.util.HashMap;

public class WordsCount {
    public static void func(String str) {
        System.out.println("Words counting: ");
        HashMap<String, Integer> count = new HashMap<>();
        String[] words = str.split("\\s+");
        for(String s : words) {
            s = s.toLowerCase();
            if(count.containsKey(s)) count.put(s, count.get(s) +1);
             else count.put(s, 1);
        }
        for(String s :count.keySet())
            System.out.println(s + ": " + count.get(s));

    }
}
