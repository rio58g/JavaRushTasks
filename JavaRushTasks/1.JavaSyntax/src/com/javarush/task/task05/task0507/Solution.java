package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        double sum = 0;
        double count = 0;
        double average = 0;


        while (a!=-1) {
            a = Integer.parseInt(reader.readLine());

            if(a==-1) {
                break;
            }
                count++;
                sum = sum + a;
                average = sum / count;

        }
        System.out.println(average);

    }

}
//Пример для чисел 1 2 2 4 5 -1: 2.8
//Пример для чисел 4 3 2 1 -1: 2.5

