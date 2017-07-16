package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        if ((number %2 == 0) && number > 0 && number < 10){
            System.out.println("четное однозначное число");

        }
        if ((number %2 != 0) && number > 0 && number < 10){
            System.out.println("нечетное однозначное число");

        }
        if ((number %2 == 0) && number > 9 && number < 100){
            System.out.println("четное двузначное число");

        }
        if ((number %2 != 0) && number > 9 && number < 100){
            System.out.println("нечетное двузначное число");

        }
        if ((number %2 == 0) && number > 99 && number < 1000){
            System.out.println("четное трехзначное число");

        }
        if ((number %2 != 0) && number > 99 && number < 1000){
            System.out.println("нечетное трехзначное число");
        }
    }
}
