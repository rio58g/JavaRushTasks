package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Бобокало", "Евгений");
        map.put("Бобокало1", "Наталия");
        map.put("Михненко", "Сергей");
        map.put("Михненко1", "Мария");
        map.put("Дягтеренко", "Сергей");
        map.put("Дягтеренко1", "Ирина");
        map.put("Пашко", "Сергей");
        map.put("Пашко1", "Мария");
        map.put("Нороха", "Андрей");
        map.put("Нороха1", "Наталия");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        int count = 0;

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> hm = iter.next();
            String valueName = hm.getValue();
            if (name.equals(valueName)){
                count++;
            }
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        int count = 0;

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, String> hm = iter.next();
            String keyLastName = hm.getKey();
            if (lastName.equals(keyLastName)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

//        System.out.println(createMap());
//        System.out.println(getCountTheSameFirstName(createMap(),"Сергей"));
//        System.out.println(getCountTheSameLastName(createMap(),"Пашко"));

    }
}
