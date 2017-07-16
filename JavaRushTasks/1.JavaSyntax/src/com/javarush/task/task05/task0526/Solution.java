package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {

        Man man1 = new Man("Sergey", 31, "Kiev");
        Man man2 = new Man("Oleg", 31, "Kiev");
        System.out.println(man1.toString());
        System.out.println(man2.toString());

        Woman woman1 = new Woman("Ira", 28, "Kiev");
        Woman woman2 = new Woman("Olya", 25, "Kiev");
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){

            return name + " " + age + " " + address;
        }

    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){

            return name + " " + age + " " + address;
        }

    }
}
