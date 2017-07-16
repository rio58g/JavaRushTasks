package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {

        int multiplication = 1;

        for (int i = 1; i < 11; i++){

            multiplication *= i;

        }
        System.out.println(multiplication);
    }
}
