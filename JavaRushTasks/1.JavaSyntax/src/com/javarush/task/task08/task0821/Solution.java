package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {

        HashMap <String, String> map = new HashMap<String, String>();

        map.put("Фамилия2", "Имя1");
        map.put("Фамилия2", "Имя2");
        map.put("Фамилия3", "Имя2");
        map.put("Фамилия2", "Имя1");
        map.put("Фамилия5", "Имя5");
        map.put("Фамилия2", "Имя6");
        map.put("Фамилия7", "Имя7");
        map.put("Фамилия2", "Имя1");
        map.put("Фамилия9", "Имя9");
        map.put("Фамилия10", "Имя2");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
