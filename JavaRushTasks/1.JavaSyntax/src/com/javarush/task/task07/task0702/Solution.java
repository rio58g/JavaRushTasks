package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String [] masString = new String [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < masString.length-2; i++){
            masString[i] = reader.readLine();

        }
        for (int j = masString.length-1; j >= 0; j--) {

            System.out.println(masString[j]);
        }

    }
}