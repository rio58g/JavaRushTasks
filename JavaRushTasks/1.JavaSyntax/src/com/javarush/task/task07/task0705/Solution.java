package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int [] masBigInt = new int[20];
        int [] masSmallInt1 = new int[10];
        int [] masSmallInt2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < masBigInt.length; i++){
            masBigInt[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < masBigInt.length/2; j++){
            masSmallInt1[j] = masBigInt[j];
            masSmallInt2[j] = masBigInt[j+masSmallInt2.length];

            System.out.println(masSmallInt2[j]);
        }
    }
}
