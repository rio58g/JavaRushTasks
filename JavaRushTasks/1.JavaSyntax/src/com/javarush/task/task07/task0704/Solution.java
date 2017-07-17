package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] masInt = new int[10];
        for(int i = 0; i < masInt.length; i++){
            masInt[i] = Integer.parseInt(reader.readLine());
        }

        for(int j = masInt.length-1; j >= 0; j--){
            System.out.println(masInt[j]);
        }
    }
}

