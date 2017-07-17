package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String [] masString = new String [10];
        int [] masInt = new int [10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < masString.length; i++){
            masString[i] = reader.readLine();
            masInt[i] = masString[i].length();
        }
        for(int j = 0; j < masInt.length; j++){
            System.out.println(masInt[j]);
        }
    }
}
