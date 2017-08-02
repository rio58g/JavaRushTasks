package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {

        Date d = new Date(date);

        long finish = d.getTime();

        d.setDate(1);
        d.setMonth(0);

        long start = d.getTime();

        long result = finish - start;
        long milis = 24*60*60*1000;
        int resultTime = (int)(result/milis);

        if (resultTime%2 == 0){
            return true;
        }

        return false;
    }
}

