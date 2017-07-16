package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name = null;
    int age = 5;
    int weight = 6;
    String address = null;
    String color = null;

    public Cat(String name){
        this.name = name;
        this.age = 5;
        this.weight = 6;
        this.color = "Чёрный";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Белый";
    }
    public Cat(String name, int age){
        this.name = name;
        this.weight = 6;
        this.age = age;
        this.color = "Оранжевый";
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 8;

    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 9;

    }

    public static void main(String[] args) {

    }
}
