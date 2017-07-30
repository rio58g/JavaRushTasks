package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = " ";
        String result = " ";

        String [] masStr = s.split("\\b");
        for(int i = 0; i < masStr.length; i++) {

            char[] masChar = masStr[i].toCharArray();
            for (int j = 0; j < masChar.length; j++) {
                masChar[0] = Character.toUpperCase(masChar[0]);

                s1 = new String(masChar);
            }
            result += s1;
        }
        System.out.print(result.trim());
    }
}
