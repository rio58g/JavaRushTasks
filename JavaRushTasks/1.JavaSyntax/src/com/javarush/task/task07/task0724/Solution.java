package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human human1 = new Human("Петя", true, 68);
        System.out.println(human1);
        Human human2 = new Human("Вася", true, 54);
        System.out.println(human2);
        Human human3 = new Human("Надя", false, 56);
        System.out.println(human3);
        Human human4 = new Human("Таня", false, 44);
        System.out.println(human4);
        Human human5 = new Human("Сергей", true, 25, human1, human3);
        System.out.println(human5);
        Human human6 = new Human("Игорь", true, 32, human1, human3);
        System.out.println(human6);
        Human human7 = new Human("Коля", true, 15, human1, human3);
        System.out.println(human7);
        Human human8 = new Human("Света", false, 20, human2, human4);
        System.out.println(human8);
        Human human9 = new Human("Надя", false, 15, human2, human4);
        System.out.println(human9);

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















