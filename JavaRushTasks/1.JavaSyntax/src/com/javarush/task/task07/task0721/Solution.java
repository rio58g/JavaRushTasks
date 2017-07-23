package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int [] masInt = new int [20];

        for (int i = 0; i < masInt.length ; i++) {
            masInt[i] = Integer.parseInt(reader.readLine());
        }

        maximum = masInt[0];
        minimum = masInt[0];

        for (int i = 0; i < masInt.length ; i++) {
            if (maximum < masInt[i]){
                maximum = masInt[i];
            }
        }
        for (int i = 0; i < masInt.length ; i++) {
            if(minimum > masInt[i]){
                minimum = masInt[i];
            }
        }

        System.out.println(maximum + " " + minimum);
        //System.out.println(minimum);
    }
}
