package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human son1 = new Human("сын Петя", true, 15, new ArrayList<Human>());
        Human son2 = new Human("сын Вася", true, 21, new ArrayList<Human>());
        Human daughter = new Human("дочь Маша", false, 18, new ArrayList<Human>());

        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(son1);
        ch.add(son2);
        ch.add(daughter);

        Human father = new Human("папа Коля", true, 43, ch);
        Human mother = new Human("мама Света", false, 35, ch);

        ArrayList<Human> fa = new ArrayList<Human>();
        fa.add(father);
        ArrayList<Human> mo = new ArrayList<Human>();
        mo.add(mother);

        Human grandfather1 = new Human("дед Стёпа", true, 80, fa);
        Human grandmother1 = new Human("бабка Клава", false, 67, fa);
        Human grandfather2 = new Human("дед Клод", true, 58, mo);
        Human grandmother2 = new Human("бабка Жозефина", false, 51, mo);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);


    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;


        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
