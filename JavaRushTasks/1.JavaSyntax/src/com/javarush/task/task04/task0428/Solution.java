package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        NegAndPos(number1,number2,number3);

    }

    public static void NegAndPos(int n1, int n2, int n3) {

        int countPos = 0;

        int[] masNumber = {n1, n2, n3};
        for (int i = 0; i < masNumber.length; i++) {
            if (masNumber[i] > 0) {
                countPos++;
            }
        }
        System.out.println(countPos);
    }
}




