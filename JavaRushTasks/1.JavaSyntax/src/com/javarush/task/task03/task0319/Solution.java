package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int s1Int = Integer.parseInt(s1);
        int s2Int = Integer.parseInt(s2);

        System.out.println(s + " получает " + s1Int + " через " + s2Int + " лет.");


    }
}
