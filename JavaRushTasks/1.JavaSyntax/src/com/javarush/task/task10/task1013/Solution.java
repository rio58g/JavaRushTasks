package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {

        private String firstName;
        private String surname;
        private int age;
        private boolean sex;
        private String cityOfResidence;
        private String education;


        public Human() {
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String surname) {
            this.firstName = firstName;
            this.surname = surname;
        }

        public Human(String firstName, String surname, int age) {
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
        }

        public Human(String firstName, String surname, int age, boolean sex) {
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String surname, int age, boolean sex, String cityOfResidence) {
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.cityOfResidence = cityOfResidence;
        }

        public Human(String firstName, String surname, int age, boolean sex, String cityOfResidence, String education) {
            this.firstName = firstName;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.cityOfResidence = cityOfResidence;
            this.education = education;
        }

        public Human(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String firstName, int age, boolean sex) {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }
    }
}
