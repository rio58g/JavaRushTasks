package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int [] masInt = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int even = 0;
        int odd = 0;

        for(int y = 0; y < masInt.length; y++){
            masInt[y] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < masInt.length; i = i + 2){
           even += masInt[i];
        }
        for (int j = 1; j < masInt.length; j = j + 2){
            odd += masInt[j];
        }
        if (even > odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
