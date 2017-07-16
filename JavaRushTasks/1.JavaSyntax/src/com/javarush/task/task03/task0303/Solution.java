package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 0.8823));
        System.out.println(convertEurToUsd(14, 0.8823));
    }

    public static double convertEurToUsd(int eur, double course) {
        double dollar = eur * course;
        return dollar;
    }
}
