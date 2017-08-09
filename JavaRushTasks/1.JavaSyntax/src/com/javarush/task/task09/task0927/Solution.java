package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {

        HashMap<String, Cat> map = new HashMap<String, Cat>();

        map.put("1", new Cat("Кот1"));
        map.put("2", new Cat("Кот2"));
        map.put("3", new Cat("Кот3"));
        map.put("4", new Cat("Кот4"));
        map.put("5", new Cat("Кот5"));
        map.put("6", new Cat("Кот6"));
        map.put("7", new Cat("Кот7"));
        map.put("8", new Cat("Кот8"));
        map.put("9", new Cat("Кот9"));
        map.put("10", new Cat("Кот10"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        HashSet<Cat> set = new HashSet<Cat>();

        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry pair = (Map.Entry) iter.next();
            Cat a = (Cat) pair.getValue();
            set.add(a);
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
