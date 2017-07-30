package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {

        HashMap<String, Integer> users = new HashMap<String, Integer>();

        users.put("Фамилия1", 450);
        users.put("Фамилия2", 600);
        users.put("Фамилия3", 400);
        users.put("Фамилия4", 800);
        users.put("Фамилия5", 650);
        users.put("Фамилия6", 250);
        users.put("Фамилия7", 100);
        users.put("Фамилия8", 820);
        users.put("Фамилия9", 550);
        users.put("Фамилия10", 300);

        return users;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        HashMap <String, Integer> copy = new HashMap<String, Integer>(map);

        for (Map.Entry<String, Integer> itm : copy.entrySet()){

            if (itm.getValue() < 500){
                map.remove(itm.getKey());
            }
        }
    }

    public static void main(String[] args) {

        removeItemFromMap(createMap());
    }
}