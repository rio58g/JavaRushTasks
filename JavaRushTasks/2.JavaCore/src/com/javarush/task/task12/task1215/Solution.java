package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "TOM";
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

    public static class Dog extends Pet{

        @Override
        public String getName() {
            return "Spike";
        }

        @Override
        public Pet getChild() {
            return null;
        }
    }

}
