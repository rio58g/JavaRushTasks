package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Фамилия1", "Имя1");
        map.put("Фамилия2", "Имя5");
        map.put("Фамилия3", "Имя3");
        map.put("Фамилия4", "Имя4");
        map.put("Фамилия5", "Имя5");
        map.put("Фамилия6", "Имя6");
        map.put("Фамилия7", "Имя7");
        map.put("Фамилия8", "Имя5");
        map.put("Фамилия9", "Имя9");
        map.put("Фамилия10", "Имя10");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        HashMap<String, String>  copy = new HashMap<>(map);

        for (Map.Entry< String, String > entry : copy.entrySet()) {

            for (Map.Entry< String, String > maps : map.entrySet()) {

                if (entry.getValue().equals(maps.getValue()) && !entry.getKey().equals(maps.getKey())) {

                    removeItemFromMapByValue(map, entry.getValue());

                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
