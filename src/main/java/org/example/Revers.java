package org.example;

public class Revers {

    public static void func(String str) {
        System.out.println("String revers: ");
        char[] chrArr = str.toCharArray();
        int s = 0;
        int e = str.length() - 1;
        while(s < e) {
            char tmp = chrArr[s];
            chrArr[s] = chrArr[e];
            chrArr[e] = tmp;

            s++;
            e--;
        }
        System.out.println(new String(chrArr));
    }
}
