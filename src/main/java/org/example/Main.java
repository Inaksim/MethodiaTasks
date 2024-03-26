package org.example;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        String str = "abcdefg asd qqq fd qqq";
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Revers.func(str);
        WordsCount.func(str);
        ArrList.func(list);
        Duplicated.find(str);
        ReadExcel.func("test.xlsx");
    }
}