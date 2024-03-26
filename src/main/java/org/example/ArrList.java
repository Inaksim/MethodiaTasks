package org.example;

import java.util.ArrayList;

public class ArrList {

    public static void func( ArrayList<Integer> list) {
        System.out.println("Array List traverse: ");

        System.out.println("Using for: ");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("Using while: ");
        int i = 0;
        while(i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }
    }
}
